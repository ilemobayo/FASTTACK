package com.cts.fasttack.common.core.exception;

public enum StandardErrorCodes implements ErrorCode {

    INTERNAL_SERVICE_FAILURE,
    INVALID_FIELD_VALUE,
    INVALID_FIELD_LENGTH,
    MISSING_REQUIRED_FIELD,
    INVALID_FIELD_FORMAT,
    INVALID_JSON,
    CRYPTOGRAPHY_ERROR,
    MISSING_EXPIRY_DATE,
    RESOURCE_ALREADY_EXISTS,
    RESOURCE_NOT_FOUND,
    HOST_NOT_AVAILABLE,
    HOST_TIMEOUT,
    UNABLE_TO_ASSESS,
    NO_DATA_FOUND,
    INVALID_TOKEN_STATUS,
    INCOMPATIBLE_FIELDS;


    public interface Names {
        String INTERNAL_SERVICE_FAILURE = "INTERNAL_SERVICE_FAILURE";
        String INVALID_FIELD_VALUE = "INVALID_FIELD_VALUE";
        String INVALID_FIELD_LENGTH = "INVALID_FIELD_LENGTH";
        String MISSING_REQUIRED_FIELD = "MISSING_REQUIRED_FIELD";
        String INVALID_FIELD_FORMAT = "INVALID_FIELD_FORMAT";
        String INVALID_JSON = "INVALID_JSON";
        String CRYPTOGRAPHY_ERROR = "CRYPTOGRAPHY_ERROR";
        String MISSING_EXPIRY_DATE = "MISSING_EXPIRY_DATE";
        String RESOURCE_ALREADY_EXISTS = "RESOURCE_ALREADY_EXISTS";
        String RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";
        String HOST_NOT_AVAILABLE = "HOST_NOT_AVAILABLE";
        String HOST_TIMEOUT = "HOST_TIMEOUT";
        String UNABLE_TO_ASSESS = "UNABLE_TO_ASSESS";
        String NO_DATA_FOUND = "NO_DATA_FOUND";
        String INVALID_TOKEN_STATUS = "INVALID_TOKEN_STATUS";
        String INCOMPATIBLE_FIELDS = "INCOMPATIBLE_FIELDS";
    }


    public boolean isHostNotAvailable() {
        return this == HOST_NOT_AVAILABLE;
    }

    public boolean isHostTimeout() {
        return this == HOST_TIMEOUT;
    }
}
