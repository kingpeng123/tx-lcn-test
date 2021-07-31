package com.mrpeng.a.feign;

import com.baomidou.mybatisplus.extension.api.R;
import com.mrpeng.config.entity.Order;
import com.mrpeng.config.entity.User;
import com.mrpeng.config.file.FeignConfig;
import com.mrpeng.config.model.ResultObj;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author pengquan
 * @version 1.0
 * @classname OrderFeign
 * @description 类描述
 * @date 2021/7/30 11:14
 **/
@FeignClient(name = "order",configuration = FeignConfig.class,fallbackFactory = OrderFeignFallBackFactory.class)
public interface OrderFeign {

    @PostMapping(value = "/b/order/createOrder")
    ResultObj createOrder(@RequestBody User user);

    @GetMapping(value = "/b/order/hello")
    R<String> hello ();

}
