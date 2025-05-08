package com.evildevsmk.codes;


import com.evildevsmk.util.ErrorCodeConstants;
import lombok.Getter;

@Getter
public enum BadRequestErrorCode implements ErrorCode {

    BAD_REQUEST(ErrorCodeConstants.BAD_REQUEST_ERROR_CODE, "Bad request");

    final String code;
    final String errorMessage;

    BadRequestErrorCode(String code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
        validateErrorCode();
    }
}
