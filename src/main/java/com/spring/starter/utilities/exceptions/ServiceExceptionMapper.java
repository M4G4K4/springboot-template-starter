package com.spring.starter.utilities.exceptions;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ServiceExceptionMapper implements ExceptionMapper<ServiceException> {

    public ServiceExceptionMapper() {
    }

    @Override
    public Response toResponse(final ServiceException exception) {
        ErrorPayload errorPayload = buildErrorPayload(exception);

        return Response.status(exception.getErrorCode().getHttpStatusCode())
                .entity(errorPayload)
                .build();
    }

    private ErrorPayload buildErrorPayload(final ServiceException exception) {
        return ErrorPayload.builder()
                .message(exception.getMessage())
                .description(exception.getDescription())
                .status(exception.getErrorCode().getHttpStatusCode())
                .build();
    }
}
