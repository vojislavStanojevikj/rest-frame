package com.evlidevs.mk.restframe.codes;

import com.evlidevs.mk.restframe.util.ErrorCodeConstants;

public enum NotFoundErrorCode implements ErrorCode {

    NOT_FOUND(ErrorCodeConstants.NOT_FOUND_ERROR_CODE, "Not found");

    final String code;
    final String defaultMessage;
    NotFoundErrorCode(String code, String defaultMessage) {
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
