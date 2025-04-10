package com.evlidevs.mk.restframe.codes;


import com.evlidevs.mk.restframe.util.ErrorCodeConstants;

public enum InvalidParameterErrorCode implements ErrorCode {

    INVALID_PARAMETER(ErrorCodeConstants.INVALID_PARAMETER_ERROR_CODE, "Invalid parameter");

    final String code;
    final String defaultMessage;

    InvalidParameterErrorCode(String code, String defaultMessage) {
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
