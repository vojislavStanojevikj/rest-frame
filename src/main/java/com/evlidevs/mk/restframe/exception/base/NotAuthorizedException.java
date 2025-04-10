package com.evlidevs.mk.restframe.exception.base;


import com.evlidevs.mk.restframe.codes.ErrorCode;
import com.evlidevs.mk.restframe.codes.NotAuthorizedErrorCode;

public class NotAuthorizedException extends HttpStatusException {

    private static final int NOT_AUTHORIZED_HTTP_STATUS_CODE = 401;

    public NotAuthorizedException(String message) {
        super(message);
        this.httpStatus = NOT_AUTHORIZED_HTTP_STATUS_CODE;
        this.errorCode = NotAuthorizedErrorCode.NOT_AUTHORIZED;
    }

    public NotAuthorizedException(String message, ErrorCode errorCode) {
        this(message);
        this.errorCode = errorCode;
    }
}
