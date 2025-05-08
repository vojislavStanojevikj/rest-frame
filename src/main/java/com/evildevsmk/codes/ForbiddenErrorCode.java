package com.evildevsmk.codes;


import com.evildevsmk.util.ErrorCodeConstants;
import lombok.Getter;

@Getter
public enum ForbiddenErrorCode implements ErrorCode {

    FORBIDDEN(ErrorCodeConstants.FORBIDDEN_ERROR_CODE, "Forbidden");

    final String code;
    final String errorMessage;

    ForbiddenErrorCode(String code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
