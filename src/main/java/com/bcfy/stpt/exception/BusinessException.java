package com.bcfy.stpt.exception;

import com.bcfy.stpt.common.ErrorCode;

/**
 * 自定义异常类
 */
public class BusinessException extends RuntimeException {

    private final int code;

    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String msg) {
        super(msg);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
