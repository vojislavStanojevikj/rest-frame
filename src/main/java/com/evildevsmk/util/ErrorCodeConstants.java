package com.evildevsmk.util;

import java.util.Set;

public final class ErrorCodeConstants {

    // Common error codes
    public static final String BAD_REQUEST_ERROR_CODE = "400";
    public static final String NOT_AUTHORIZED_ERROR_CODE = "401";
    public static final String FORBIDDEN_ERROR_CODE = "403";
    public static final String NOT_FOUND_ERROR_CODE = "404";
    public static final String INTERNAL_SERVER_ERROR_CODE = "500";

    public static final Set<String> REST_ERROR_CODES = Set.of(
            BAD_REQUEST_ERROR_CODE,
            NOT_AUTHORIZED_ERROR_CODE,
            FORBIDDEN_ERROR_CODE,
            NOT_FOUND_ERROR_CODE,
            INTERNAL_SERVER_ERROR_CODE
    );
}
