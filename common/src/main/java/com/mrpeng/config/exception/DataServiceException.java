package com.mrpeng.config.exception;

public class DataServiceException extends RuntimeException {

    public DataServiceException(){};

    public DataServiceException(String message) {
        super(message);
    }

    public DataServiceException(Throwable cause) {
        super(cause);
    }

    public DataServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
