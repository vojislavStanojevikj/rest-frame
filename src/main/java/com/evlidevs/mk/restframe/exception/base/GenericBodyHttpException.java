package com.evlidevs.mk.restframe.exception.base;

import com.evlidevs.mk.restframe.codes.ErrorCode;
import lombok.Getter;

@Getter
public class GenericBodyHttpException extends HttpStatusException {

    public GenericBodyHttpException(ErrorCode errorCode, String message, int httpStatus, HttpExceptionBody body) {
        super(message);
        this.errorCode = errorCode;
        this.body = body;
        this.httpStatus = httpStatus;
    }
}
