package com.evildevsmk.validation.component;

import com.evildevsmk.codes.ErrorCode;
import com.evildevsmk.util.ErrorCodeConstants;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ErrorCodeValidationAspect {

    @Before(value = "within(@com.evildevsmk.validation.annotation.ValidateErrorCode *) && this(errorCode)",
            argNames = "errorCode")
    public void validateErrorCode(ErrorCode errorCode) {
        if (ErrorCodeConstants.REST_ERROR_CODES.contains(errorCode.getCode())) {
            throw new IllegalStateException("Error code '" + errorCode.getCode() + "' is already defined in REST_ERROR_CODES.");
        }
    }
}