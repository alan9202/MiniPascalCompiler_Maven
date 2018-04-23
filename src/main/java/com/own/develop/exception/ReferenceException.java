package com.own.develop.exception;

public class ReferenceException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public ReferenceException() {
        super();
    }
    
    public ReferenceException(String message) {
        super(message);
    }
    
    public ReferenceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ReferenceException(Throwable cause) {
        super(cause);
    }
    
    protected ReferenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
