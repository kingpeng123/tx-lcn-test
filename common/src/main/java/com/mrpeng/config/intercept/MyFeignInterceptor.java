package com.mrpeng.config.intercept;

import com.codingapi.txlcn.tracing.TracingContext;
import com.codingapi.txlcn.tracing.Tracings;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * 重写该接口可以拦截feign请求，并做一些修改
 * @author: pqq
 * @create: 2020-12-21 09:57
 **/
@ConditionalOnClass(Feign.class)
@Order
public class MyFeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if(attributes == null){
                return;
            }
            //将token放入请求头中，这样子请求可以被security框架拦截校验，否者，无法访问带有安全框架的服务
            HttpServletRequest request = attributes.getRequest();
            requestTemplate.header("token",request.getHeader("token"));
            //tm重写RequestInterceptor，fein调用的时候将groupId放入请求头中,自己重写会见tm中的重写覆盖掉，所以这里要加上，不然连续服务调用不会使用同一组groupId
            //例如服务A，调用服务B，服务B，调用服务C，如果不重写，会出现服务A，B在同一个事务组中，而服务C在一个事务组中，在事务B中发生异常，AB回滚，C不回滚
            //问题在于：1.hystrix调用feign时开启了一个子线程无法获取父线程的threadlocal中的数据；
            //可能的解决方案：可以根据tx-lcn中重写HystrixConcurrencyStrategy方法，具体可以看TracingHystrixConcurrencyStrategy，模仿着写（未做）
            //现在的解决方案：关闭hystrix熔断 feign.hystrix.enable=false
            Tracings.transmit(requestTemplate::header);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
