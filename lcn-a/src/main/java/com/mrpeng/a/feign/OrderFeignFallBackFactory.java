package com.mrpeng.a.feign;

import com.baomidou.mybatisplus.extension.api.R;

import com.codingapi.txlcn.tc.support.DTXUserControls;
import com.codingapi.txlcn.tracing.TracingContext;
import com.mrpeng.config.entity.User;

import com.mrpeng.config.model.ResultObj;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author pengquan
 * @version 1.0
 * @classname OrderFeignFactory
 * @description 类描述
 * @date 2021/7/30 14:13
 **/
@Component
@Slf4j
public class OrderFeignFallBackFactory implements FallbackFactory<OrderFeign> {

    @Override
    public OrderFeign create(Throwable throwable) {
        return new OrderFeign() {
            @Override
            public ResultObj createOrder(User user) {
                log.info(throwable.getCause().getMessage());
                DTXUserControls.rollbackGroup(TracingContext.tracing().groupId());
                return ResultObj.error().message("下单失败");
            }

            @Override
            public R<String> hello() {
                return null;
            }
        };
    }
}
