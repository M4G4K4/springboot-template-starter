package com.spring.starter.utilities.exceptions;

import lombok.Getter;

@Getter
public class ServiceException extends RuntimeException {

    private final ErrorCode errorCode;
    private final String description;

    public ServiceException(final ErrorCode errorCode) {
        this(errorCode, null, null);
    }

    public ServiceException(final ErrorCode errorCode, final String description) {
        this(errorCode, description, null);
    }

    public ServiceException(
            final ErrorCode errorCode,
            final String description,
            final Throwable cause) {

        super(errorCode.getMessage(), cause);

        this.errorCode = errorCode;
        this.description = description;
    }

}
