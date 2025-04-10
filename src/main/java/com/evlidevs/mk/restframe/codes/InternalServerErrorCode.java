package com.evlidevs.mk.restframe.codes;

import static com.evlidevs.mk.restframe.util.ErrorCodeConstants.INTERNAL_SERVER_ERROR_CODE;

public enum InternalServerErrorCode implements ErrorCode {

    INTERNAL_SERVER_ERROR(INTERNAL_SERVER_ERROR_CODE, "Something went wrong");
    final String code;
    final String defaultMessage;

    InternalServerErrorCode(String code, String defaultMessage) {
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
