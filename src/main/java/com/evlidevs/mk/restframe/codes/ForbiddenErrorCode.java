package com.evlidevs.mk.restframe.codes;


import com.evlidevs.mk.restframe.util.ErrorCodeConstants;

public enum ForbiddenErrorCode implements ErrorCode {

    FORBIDDEN(ErrorCodeConstants.FORBIDDEN_ERROR_CODE, "Forbidden");

    final String code;
    final String defaultMessage;

    ForbiddenErrorCode(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDefaultMessage() {
        return defaultMessage;
    }
}
