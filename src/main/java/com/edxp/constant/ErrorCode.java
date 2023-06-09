package com.edxp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not founded"),
    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "Username is duplicated"),
    INVALID_AUTH_CODE(HttpStatus.UNAUTHORIZED, "Auth code is invalid"),


    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error")
    ;

    private final HttpStatus status;
    private final String message;
}
