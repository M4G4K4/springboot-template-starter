package com.spring.starter.utilities.exceptions;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    FILE_TYPE_NOT_SUPPORTED("File type not supported", HttpStatus.BAD_REQUEST.value()),
    FILE_ZONES_FRIST_IMPORT("Zones file must be the first import", HttpStatus.BAD_REQUEST.value()),
    ZONE_NOT_FOUND("Zone not found", HttpStatus.BAD_REQUEST.value());

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
