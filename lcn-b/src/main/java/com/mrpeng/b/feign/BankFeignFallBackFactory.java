package com.mrpeng.b.feign;

import com.baomidou.mybatisplus.extension.api.R;
import com.mrpeng.config.model.ResultObj;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author pengquan
 * @version 1.0
 * @classname BankFeignFallBackFactory
 * @description 类描述
 * @date 2021/7/30 14:19
 **/
@Component
@Slf4j
public class BankFeignFallBackFactory implements FallbackFactory<BankFeign> {

    @Override
    public BankFeign create(Throwable throwable) {
        return new BankFeign() {
            @Override
            public ResultObj reduceMoney(Integer userId, Double money) {
                log.info("扣减金钱失败！");
                return ResultObj.error().message("扣减金钱失败！");
            }
        };
    }
}
