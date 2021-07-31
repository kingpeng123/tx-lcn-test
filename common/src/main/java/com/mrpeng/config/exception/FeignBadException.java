package com.mrpeng.config.exception;

/**
 * @author: pqq
 * @create: 2021-03-03 15:00
 **/
public class FeignBadException extends RuntimeException {
    private int code;
    public FeignBadException() {
    }

    public FeignBadException(String message,int code) {
        super(message);
        this.code =code;
    }
    public FeignBadException(String message) {
        super(message);
    }

    public int getCode() {
        return code;
    }
}
