package com.evildevsmk.codes;

import lombok.Getter;

import static com.evildevsmk.util.ErrorCodeConstants.NOT_AUTHORIZED_ERROR_CODE;

@Getter
public enum NotAuthorizedErrorCode implements ErrorCode {

    NOT_AUTHORIZED(NOT_AUTHORIZED_ERROR_CODE, "Not authorized");

    final String code;
    final String errorMessage;

    NotAuthorizedErrorCode(String code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
