package com.evlidevs.mk.restframe.exception.base;

import com.evlidevs.mk.restframe.codes.BadRequestErrorCode;
import com.evlidevs.mk.restframe.codes.ErrorCode;

public class BadRequestException extends HttpStatusException {

    private static final int BAD_REQUEST_HTTP_STATUS_CODE = 400;

    public BadRequestException(String message) {
        super(message);
        this.httpStatus = BAD_REQUEST_HTTP_STATUS_CODE;
        this.errorCode = BadRequestErrorCode.BAD_REQUEST;
    }

    public BadRequestException(String message, ErrorCode errorCode) {
        this(message);
        this.errorCode = errorCode;
    }
}
