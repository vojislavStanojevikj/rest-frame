package com.evlidevs.mk.restframe.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponseDTO<T> implements Serializable {

    private int status;
    private Instant timestamp;
    private String message;
    private String errorCode;
    private T body;

    public RestResponseDTO(int status, Instant timestamp, String message) {
        this(status, timestamp, message, null, null);
    }

    public RestResponseDTO(int status, Instant timestamp, String message, String errorCode) {
        this(status, timestamp, message, errorCode, null);
    }

    public RestResponseDTO(int status, Instant timestamp, String message, String errorCode, T body) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
        this.errorCode = errorCode;
        this.body = body;
    }
}
