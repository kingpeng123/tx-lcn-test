package com.mrpeng.config.strategy;

import com.codingapi.txlcn.tracing.TracingContext;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.netflix.hystrix.HystrixThreadPoolProperties;
import com.netflix.hystrix.strategy.HystrixPlugins;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategy;
import com.netflix.hystrix.strategy.concurrency.HystrixRequestVariable;
import com.netflix.hystrix.strategy.concurrency.HystrixRequestVariableLifecycle;
import com.netflix.hystrix.strategy.eventnotifier.HystrixEventNotifier;
import com.netflix.hystrix.strategy.executionhook.HystrixCommandExecutionHook;
import com.netflix.hystrix.strategy.metrics.HystrixMetricsPublisher;
import com.netflix.hystrix.strategy.properties.HystrixPropertiesStrategy;
import com.netflix.hystrix.strategy.properties.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 当引入Hystrix熔断策略时，出现了一个新的问题
 * RequestAttributes attributes = RequestContextHolder.getRequestAttributes(); attributes为null，获取不到request信息，无法将token设置到请求头
 * 最终发现RequestContextHolder.getRequestAttributes()该方法是从ThreadLocal变量里面取得对应信息的
 * Hystrix有隔离策略：THREAD以及SEMAPHORE，hystrix默认隔离策略为 THREAD 时，hystrix开启了一个子线程去调用feign，子线程是没办法拿到主线程ThreadLocal中的值的。
 * 解决方案1.在yml配置文件中配置hystrix.command.default.execution.isolation.strategy: SEMAPHORE（信号量），隔离策略
 * 解决方案2.自定义隔离策略，如下
 * @author pqq
 * @date 2021/3/04 10:09
 */
@Slf4j
public class FeignHystrixConcurrencyStrategy extends HystrixConcurrencyStrategy {
    private HystrixConcurrencyStrategy delegate;
    public FeignHystrixConcurrencyStrategy() {
        try {
            this.delegate = HystrixPlugins.getInstance().getConcurrencyStrategy();
            if (this.delegate instanceof FeignHystrixConcurrencyStrategy) {
                // Welcome to singleton hell...
                return;
            }
            HystrixCommandExecutionHook commandExecutionHook =
                    HystrixPlugins.getInstance().getCommandExecutionHook();
            HystrixEventNotifier eventNotifier = HystrixPlugins.getInstance().getEventNotifier();
            HystrixMetricsPublisher metricsPublisher = HystrixPlugins.getInstance().getMetricsPublisher();
            HystrixPropertiesStrategy propertiesStrategy =
                    HystrixPlugins.getInstance().getPropertiesStrategy();
            this.logCurrentStateOfHystrixPlugins(eventNotifier, metricsPublisher, propertiesStrategy);
            HystrixPlugins.reset();
            HystrixPlugins.getInstance().registerConcurrencyStrategy(this);
            HystrixPlugins.getInstance().registerCommandExecutionHook(commandExecutionHook);
            HystrixPlugins.getInstance().registerEventNotifier(eventNotifier);
            HystrixPlugins.getInstance().registerMetricsPublisher(metricsPublisher);
            HystrixPlugins.getInstance().registerPropertiesStrategy(propertiesStrategy);
        } catch (Exception e) {
            log.error("Failed to register Sleuth Hystrix Concurrency Strategy", e);
        }
    }

    private void logCurrentStateOfHystrixPlugins(HystrixEventNotifier eventNotifier,
                                                 HystrixMetricsPublisher metricsPublisher, HystrixPropertiesStrategy propertiesStrategy) {
        if (log.isDebugEnabled()) {
            log.debug("Current Hystrix plugins configuration is [" + "concurrencyStrategy ["
                    + this.delegate + "]," + "eventNotifier [" + eventNotifier + "]," + "metricPublisher ["
                    + metricsPublisher + "]," + "propertiesStrategy [" + propertiesStrategy + "]," + "]");
            log.debug("Registering Sleuth Hystrix Concurrency Strategy.");
        }
    }


    @Override
    public ThreadPoolExecutor getThreadPool(HystrixThreadPoolKey threadPoolKey,
                                            HystrixProperty<Integer> corePoolSize, HystrixProperty<Integer> maximumPoolSize,
                                            HystrixProperty<Integer> keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        return this.delegate.getThreadPool(threadPoolKey, corePoolSize, maximumPoolSize, keepAliveTime,
                unit, workQueue);
    }

    @Override
    public ThreadPoolExecutor getThreadPool(HystrixThreadPoolKey threadPoolKey,
                                            HystrixThreadPoolProperties threadPoolProperties) {
        return this.delegate.getThreadPool(threadPoolKey, threadPoolProperties);
    }

    @Override
    public BlockingQueue<Runnable> getBlockingQueue(int maxQueueSize) {
        return this.delegate.getBlockingQueue(maxQueueSize);
    }

    @Override
    public <T> HystrixRequestVariable<T> getRequestVariable(HystrixRequestVariableLifecycle<T> rv) {
        return this.delegate.getRequestVariable(rv);
    }

    /**
     * 多线程下，重写该方法可以对线程进行进一步修饰
     * 比如，线程上下文内容的继承
     * 在这里我进行了，RequestAttributes和TracingContext属性的继承，
     * 因为feign请求和熔断时都是使用的多线程模式，不从写这里的RequestAttributes和TracingContext属性会丢失。
     * 在tx-lcn框架的groupId不会发送到其他服务，导致不会加入事务组，事务不会回滚。
     * 通过重写wrapCallable方法对Callable进行修饰并结合MyFeignInterceptor将token和事务ID写道header中
     * @author pengquan
     * @date 2021/7/31 9:55
     * @param callable
     * @return java.util.concurrent.Callable<T>
     */
    @Override
    public <T> Callable<T> wrapCallable(Callable<T> callable) {
        Map<String, String> fields = TracingContext.tracing().fields();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        return new WrappedCallable<>(callable, requestAttributes,fields);
    }


    static class WrappedCallable<T> implements Callable<T> {
        private final Callable<T> target;
        private final RequestAttributes requestAttributes;
        private final Map<String,String> fields;
        public WrappedCallable(Callable<T> target, RequestAttributes requestAttributes,Map<String,String> fields) {
            this.target = target;
            this.requestAttributes = requestAttributes;
            this.fields =fields;
        }

        @Override
        public T call() throws Exception {
            boolean isReInitTracingContext = true;
            try {
                RequestContextHolder.setRequestAttributes(requestAttributes);
                if (TracingContext.tracing().hasGroup()) {
                    isReInitTracingContext = false;
                    return target.call();
                }
                log.debug("Hystrix transfer tracing.");
                TracingContext.init(fields);
                return target.call();
            } finally {
                if (isReInitTracingContext) {
                    TracingContext.tracing().destroy();
                }
                RequestContextHolder.resetRequestAttributes();
            }
        }
    }


}
