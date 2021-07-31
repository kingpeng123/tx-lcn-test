package com.mrpeng.config.decoder;

import com.mrpeng.config.model.myenum.HttpStatus;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * 如果feign返回发生错误，会调用该接口，然后自定义错误返回
 * @author: pqq
 * @create: 2021-03-03 12:24
 **/
@Slf4j
//@Configuration
public class FeignClientErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        if(response.status() != HttpStatus.OK.getCode()){
            Exception exception = null;
            String json = null;
            try {
                json = Util.toString(response.body().asReader());
            } catch (IOException e) {
                throw new IllegalArgumentException("Feign JSON转换为对象异常:"+ json, e);
            }
//            Map<String,String> result = JSON.parseObject(json, Map.class);
//            String message = result.get("message");
//            exception = new FeignBadException(message,response.status());
            return exception;
        }
        return new Exception("未知错误！");
    }
}
