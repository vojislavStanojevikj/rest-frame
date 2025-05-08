package com.evildevsmk.exception.base;

import com.evildevsmk.codes.ErrorCode;
import lombok.Getter;

@Getter
public final class GenericBodyHttpException extends HttpStatusException {

    public GenericBodyHttpException(ErrorCode errorCode, String message, int httpStatus, HttpExceptionBody body) {
        super(message);
        this.errorCode = errorCode;
        this.body = body;
        this.httpStatus = httpStatus;
    }
}
