package com.evildevsmk.exception.base;


import com.evildevsmk.codes.ErrorCode;
import com.evildevsmk.codes.NotAuthorizedErrorCode;

public final class NotAuthorizedException extends HttpStatusException {

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
