package com.mrpeng.config.exception;

/**
 * @author pengquan
 * @version 1.0
 * @classname DemoException
 * @description 类描述
 * @date 2021/7/2 14:00
 **/
public class DemoException extends Exception {

    public DemoException() {
    }

    public DemoException(String message) {
        super(message);
    }

    public DemoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DemoException(Throwable cause) {
        super(cause);
    }

    public DemoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
