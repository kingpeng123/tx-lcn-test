package com.mrpeng.b.feign;

import com.baomidou.mybatisplus.extension.api.R;

import com.mrpeng.config.file.FeignConfig;
import com.mrpeng.config.model.ResultObj;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author pengquan
 * @version 1.0
 * @classname bankFeign
 * @description 类描述
 * @date 2021/7/30 13:39
 **/
@FeignClient(name = "bank",configuration = FeignConfig.class,fallbackFactory = BankFeignFallBackFactory.class)
public interface BankFeign {

    @GetMapping("/c/bank/reduceMoney/{userId}/{money}")
    ResultObj reduceMoney(@PathVariable(value = "userId") Integer userId, @PathVariable(value = "money") Double money);
}
