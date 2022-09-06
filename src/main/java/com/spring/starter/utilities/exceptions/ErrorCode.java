package com.spring.starter.utilities.exceptions;

import javax.ws.rs.core.Response;

public enum ErrorCode {
    FILE_TYPE_NOT_SUPPORTED("File type not supported", Response.Status.BAD_REQUEST.getStatusCode()),
    FILE_ZONES_FRIST_IMPORT("Zones file must be the first import", Response.Status.BAD_REQUEST.getStatusCode()),
    ZONE_NOT_FOUND("Zone not found", Response.Status.BAD_REQUEST.getStatusCode());

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
