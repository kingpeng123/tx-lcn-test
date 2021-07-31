package com.mrpeng.config.exception;

/**
 * @author pengquan
 * @version 1.0
 * @classname TokenExpiredException
 * @description 签证过期
 * @date 2021/6/30 9:40
 **/
public class TokenExpiredException extends RuntimeException {
    public TokenExpiredException(String msg) {
        super(msg);
    }

    public TokenExpiredException(String msg, Throwable t) {
        super(msg, t);
    }
}
