package com.evildevsmk.exception.base;


import com.evildevsmk.codes.ErrorCode;
import com.evildevsmk.codes.ForbiddenErrorCode;

public final class ForbiddenException extends HttpStatusException {

    private static final int FORBIDDEN_HTTP_STATUS_CODE = 403;

    public ForbiddenException(String message) {
        super(message);
        this.httpStatus = FORBIDDEN_HTTP_STATUS_CODE;
        this.errorCode = ForbiddenErrorCode.FORBIDDEN;
    }

    public ForbiddenException(String message, ErrorCode errorCode) {
        this(message);
        this.errorCode = errorCode;
    }
}
