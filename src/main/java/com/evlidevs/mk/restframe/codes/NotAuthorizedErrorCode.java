package com.evlidevs.mk.restframe.codes;

import static com.evlidevs.mk.restframe.util.ErrorCodeConstants.NOT_AUTHORIZED_ERROR_CODE;

public enum NotAuthorizedErrorCode implements ErrorCode {

    NOT_AUTHORIZED(NOT_AUTHORIZED_ERROR_CODE, "Not authorized");

    final String code;
    final String defaultMessage;

    NotAuthorizedErrorCode(String code, String defaultMessage) {
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
