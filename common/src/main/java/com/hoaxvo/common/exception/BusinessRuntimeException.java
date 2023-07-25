package com.hoaxvo.common.exception;

public class BusinessRuntimeException extends RuntimeException {
    private String code;
    private final String message;

    public BusinessRuntimeException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BusinessRuntimeException(String message) {
        super(message);
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
