package com.mrpeng.config.utils;

import java.util.UUID;

/**
 * UUID 帮助类
 * @author: pqq
 * @create: 2021-01-06 11:34
 **/
public class UUIDUtils {

    /**
     * 获取UUID字符串（小写）
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

    /**
     * 获取UUID字符串（大写）
     * @return
     */
    public static String getUUIDToUpper(){
        return UUID.randomUUID().toString().toUpperCase();
    }


}
