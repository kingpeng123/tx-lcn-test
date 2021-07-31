package com.mrpeng.config.utils;

import java.util.regex.Pattern;

/** 手机号校验
 * @author: pqq
 * @create: 2020-12-24 10:48
 **/

public class MobileUtils {

    public static boolean checkPhone(String phone){
        Pattern p = Pattern.compile("^[1](([3-9][\\d])|([4][5,6,7,8,9])|([6][5,6])|([7][3,4,5,6,7,8])|([9][8,9]))[\\d]{8}$");
        if(p.matcher(phone).matches()){
            return true;
        }
        return false;
    }
}
