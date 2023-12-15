package com.hs.hscommon.common;

import lombok.Data;

import java.io.Serializable;


@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 4887078045405290846L;
    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(Error errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
