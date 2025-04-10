package com.evlidevs.mk.restframe.exception.base;


import com.evlidevs.mk.restframe.codes.ErrorCode;
import com.evlidevs.mk.restframe.codes.InternalServerErrorCode;

public class InternalServerErrorException extends HttpStatusException {

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
