package com.evildevsmk.exception.base;

import com.evildevsmk.codes.ErrorCode;
import lombok.Getter;

@Getter
public abstract class HttpStatusException extends RuntimeException {

    protected int httpStatus;
    protected ErrorCode errorCode;
    protected HttpExceptionBody body;

    protected HttpStatusException(String message) {
        this(null, message);
    }

    protected HttpStatusException(ErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    protected HttpStatusException(ErrorCode errorCode, String message, HttpExceptionBody body) {
        super(message);
        this.errorCode = errorCode;
        this.body = body;
    }
}
