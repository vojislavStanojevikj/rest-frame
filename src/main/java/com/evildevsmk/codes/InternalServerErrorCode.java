package com.evildevsmk.codes;

import lombok.Getter;

import static com.evildevsmk.util.ErrorCodeConstants.INTERNAL_SERVER_ERROR_CODE;

@Getter
public enum InternalServerErrorCode implements ErrorCode {

    INTERNAL_SERVER_ERROR(INTERNAL_SERVER_ERROR_CODE, "Something went wrong");
    final String code;
    final String errorMessage;

    InternalServerErrorCode(String code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
