package com.mrpeng.config.utils;

import com.mrpeng.config.model.vo.RoleVO;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;

/**
 * 对象帮助类
 * @author: pqq
 * @create: 2021-01-02 17:02
 **/
public class ObjectUtils {

    public static void main(String[] args) {
        RoleVO vo =new RoleVO();
        vo.setTypeName("2356");
        System.out.println(fieldIsNull(vo, "typeName"));
    }


    /**
     * 通过属性名判断属性的值是否为空
     * @param o  判断对象
     * @param fieldName 字段名
     * @return 为空返回false，不为空返回false
     */
    public static Boolean fieldIsNull(Object o,String fieldName){
        if(o==null || StringUtils.isEmpty(fieldName)){
            return false;
        }
        try {
            Field field = o.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            Object o1 = field.get(o);
            if(o1 == null){
                return false;
            }
        } catch (NoSuchFieldException e) {
            return false;
        } catch (IllegalAccessException e) {
            return false;
        }
        return true;
    }
}
