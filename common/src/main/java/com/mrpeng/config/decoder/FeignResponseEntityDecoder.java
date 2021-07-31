package com.mrpeng.config.decoder;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import com.mrpeng.config.exception.service.ServiceException;
import com.mrpeng.config.model.ResultObj;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 当feign调用客户端失败时，如果被全局异常捕获到，会返回ResultObj对象，在这里可以拦截到返回体内容，并获取到状态码，和错误信息
 * @author: pqq
 * @create: 2021-03-11 13:08
 **/
public class FeignResponseEntityDecoder extends ResponseEntityDecoder {
    public FeignResponseEntityDecoder(Decoder decoder) {
        super(decoder);
    }

    @Override
    public Object decode(Response response, Type type) throws IOException, FeignException {
        if(response.body() == null){
            throw new DecodeException("返回数据为空");
        }
        String bodyStr = Util.toString(response.body().asReader(Util.UTF_8));
        //对结果进行转换
        ResultObj resultBody= null;
        try {
            //如果JSON发生异常，这是返回的内容为接口DTO
            resultBody = JSON.parseObject(bodyStr, ResultObj.class);
        } catch (Exception e) {
            return jsonToobj(bodyStr,type); //直接反序列化返回
        }
        //如果返回结果为Map json.parseObject返回一个新对象不会异常
        if(resultBody != null && resultBody.getResultCode() ==0){
            return jsonToobj(bodyStr,type);
        }
        //此处如果不是正常的200状态，则抛出异常，异常就会进入熔断，走熔断策略
        if (resultBody != null && resultBody.getResultCode() != 200) {
            throw new ServiceException(resultBody.getResultMsg());
        }
        return jsonToobj(bodyStr,type);
    }

    /**
     * 反序列化
     * @param jsonStr
     * @param targetType
     * @param <T>
     * @return
     */
    public static <T> T jsonToobj(String jsonStr, Type targetType) {
        try {
            JavaType javaType = TypeFactory.defaultInstance().constructType(targetType);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonStr, javaType);
        } catch (IOException e) {
            throw new IllegalArgumentException("Feign JSON转换为对象异常:" + jsonStr, e);
        }
    }
}
