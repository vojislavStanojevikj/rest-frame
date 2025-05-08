package com.evildevsmk.exception.base;


import com.evildevsmk.codes.ErrorCode;
import com.evildevsmk.codes.InternalServerErrorCode;

public final class InternalServerErrorException extends HttpStatusException {

    private static final int INTERNAL_SERVER_ERROR_HTTP_STATUS_CODE = 500;

    public InternalServerErrorException(String message) {
        super(message);
        this.httpStatus = INTERNAL_SERVER_ERROR_HTTP_STATUS_CODE;
        this.errorCode = InternalServerErrorCode.INTERNAL_SERVER_ERROR;
    }

    public InternalServerErrorException(String message, ErrorCode errorCode) {
        this(message);
        this.errorCode = errorCode;
    }
}
