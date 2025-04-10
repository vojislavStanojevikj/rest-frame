package com.evlidevs.mk.restframe.codes;

import com.evlidevs.mk.restframe.util.ErrorCodeConstants;

public enum NotSupportedErrorCode implements ErrorCode {

    NOT_SUPPORTED(ErrorCodeConstants.NOT_SUPPORTED_ERROR_CODE, "Not supported");

    final String code;
    final String defaultMessage;

    NotSupportedErrorCode(String code, String defaultMessage) {
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
