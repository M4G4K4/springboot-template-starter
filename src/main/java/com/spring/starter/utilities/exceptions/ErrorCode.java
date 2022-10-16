package com.spring.starter.utilities.exceptions;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    USER_NOT_FOUND("User not found", HttpStatus.BAD_REQUEST.value());

    private final String message;
    private final int httpStatusCode;

    ErrorCode(String message, int httpStatusCode) {
        this.message = message;
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }
}
