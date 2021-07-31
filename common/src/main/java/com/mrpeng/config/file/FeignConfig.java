package com.mrpeng.config.file;

import com.mrpeng.config.decoder.FeignResponseEntityDecoder;

import com.mrpeng.config.intercept.MyFeignInterceptor;
import com.mrpeng.config.strategy.FeignHystrixConcurrencyStrategy;
import feign.codec.Decoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author pengquan
 * @version 1.0
 * @classname FeignConfig
 * @description 类描述
 * @date 2021/7/30 13:01
 **/
@Configuration
public class FeignConfig {
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;

    @Bean
    public Decoder feignDecoder(){
        return new FeignResponseEntityDecoder(new SpringDecoder(this.messageConverters));
    }


    @Bean
    public MyFeignInterceptor feignInterceptor(){
        return new MyFeignInterceptor();
    }

    /**
     * 自定义策略：解决feign加入hystrix熔断后attributes为空的问题
     * @return
     */
    @Bean
    public FeignHystrixConcurrencyStrategy feignHystrixConcurrencyStrategy() {
        return new FeignHystrixConcurrencyStrategy();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
