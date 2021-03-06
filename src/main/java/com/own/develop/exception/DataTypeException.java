package com.own.develop.exception;

public class DataTypeException extends Exception {

    private static final long serialVersionUID = 1L;

    public DataTypeException() {
        super();
    }
    
    public DataTypeException(String message) {
        super(message);
    }
    
    public DataTypeException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public DataTypeException(Throwable cause) {
        super(cause);
    }
    
    protected DataTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
