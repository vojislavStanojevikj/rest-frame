package com.evildevsmk.util;

import com.evildevsmk.codes.ErrorCode;
import lombok.extern.slf4j.Slf4j;

import java.util.function.BiFunction;
import java.util.function.Supplier;

@Slf4j
public final class ExceptionLoggerUtil {

    private ExceptionLoggerUtil() { }

    /**
     * Intended for using as an error message logger and
     * exception object provider, based on the provided function.
     *
     * @param errorCode    errorCode
     * @param function     exception object provider
     * @param <T>          type of the exception
     * @return exception supplier
     */
    public static <T extends Exception> Supplier<T> logAndSupplyException(ErrorCode errorCode,
                                                                          BiFunction<String, ErrorCode, T> function) {
        return logAndSupplyException(errorCode.getErrorMessage(), errorCode, function);
    }

    /**
     * Intended for using as an error message logger and
     * exception object provider, based on the provided function.
     *
     * @param message      log and error message
     * @param errorCode    error code
     * @param function     exception object provider
     * @param <T>          type of the exception
     * @return exception supplier
     */
    public static <T extends Exception> Supplier<T> logAndSupplyException(String message, ErrorCode errorCode,
                                                                          BiFunction<String, ErrorCode, T> function) {
        return logAndSupplyException(message, message, errorCode, function);
    }

    /**
     * Intended for using as an error message logger and
     * exception object provider, based on the provided function.
     *
     * @param logMessage   log message
     * @param errorMessage error message
     * @param errorCode    error code
     * @param function     exception object provider
     * @param <T>          type of the exception
     * @return exception supplier
     */
    public static <T extends Exception> Supplier<T> logAndSupplyException(String logMessage, String errorMessage, ErrorCode errorCode,
                                                                          BiFunction<String, ErrorCode, T> function) {
        return () -> {
            log.error(logMessage);
            return function.apply(errorMessage, errorCode);
        };
    }
}
