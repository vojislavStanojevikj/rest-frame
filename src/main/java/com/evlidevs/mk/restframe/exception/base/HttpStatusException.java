package com.evlidevs.mk.restframe.exception.base;

import com.evlidevs.mk.restframe.codes.ErrorCode;
import lombok.Getter;

@Getter
public class HttpStatusException extends RuntimeException {

    protected int httpStatus;
    protected ErrorCode errorCode;
    protected HttpExceptionBody body;

    public HttpStatusException(String message) {
        this(null, message);
    }

    public HttpStatusException(ErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    public HttpStatusException(ErrorCode errorCode, String message, HttpExceptionBody body) {
        super(message);
        this.errorCode = errorCode;
        this.body = body;
    }
}
