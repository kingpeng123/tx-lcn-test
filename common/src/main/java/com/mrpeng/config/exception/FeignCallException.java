package com.mrpeng.config.exception;

/**
 * @author pengquan
 * @version 1.0
 * @classname FeignCallException
 * @description
 * @date 2021/7/30 15:17
 **/
public class FeignCallException extends Exception {

    public FeignCallException(String message) {
        super(message);
    }
}
