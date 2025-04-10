package com.evlidevs.mk.restframe.codes;


import com.evlidevs.mk.restframe.util.ErrorCodeConstants;

public enum BadRequestErrorCode implements ErrorCode {

    BAD_REQUEST(ErrorCodeConstants.BAD_REQUEST_ERROR_CODE, "Bad request");

    final String code;
    final String defaultMessage;

    BadRequestErrorCode(String code, String defaultMessage) {
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
