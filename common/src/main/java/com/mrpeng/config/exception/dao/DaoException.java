package com.mrpeng.config.exception.dao;

/**
 * 持久层异常类
 */
public class DaoException extends RuntimeException {
    public DaoException(String message) {
        super(message);
    }
}
