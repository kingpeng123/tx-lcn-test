package com.mrpeng.config.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrpeng.config.model.ResultObj;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求返回帮助类
 */
public class ResponseUtil {

    public static void out(HttpServletResponse response, ResultObj resultObj) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.OK.value());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try {
            mapper.writeValue(response.getWriter(), resultObj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
