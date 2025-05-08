package com.evildevsmk.codes;

import com.evildevsmk.util.ErrorCodeConstants;
import lombok.Getter;

@Getter
public enum NotFoundErrorCode implements ErrorCode {

    NOT_FOUND(ErrorCodeConstants.NOT_FOUND_ERROR_CODE, "Not found");

    final String code;
    final String errorMessage;
    NotFoundErrorCode(String code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
