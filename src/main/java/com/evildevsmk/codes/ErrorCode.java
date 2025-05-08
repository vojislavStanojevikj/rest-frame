package com.evildevsmk.codes;

import com.evildevsmk.util.ErrorCodeConstants;

import java.io.Serializable;

public interface ErrorCode extends Serializable {

    String getCode();
    String getErrorMessage();

    default void validateErrorCode() {
        if (ErrorCodeConstants.REST_ERROR_CODES.contains(getCode())) {
            throw new IllegalStateException("Error code '" + getCode() + "' is already defined in REST_ERROR_CODES.");
        }
    }
}
