package com.mrpeng.config.exception.service;

/**
 * 请求被拒绝异常类
 */
public class NotAcceptException extends RuntimeException {

    public NotAcceptException(String message) {
        super(message);
    }

    public NotAcceptException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAcceptException(Throwable cause) {
        super(cause);
    }
}
