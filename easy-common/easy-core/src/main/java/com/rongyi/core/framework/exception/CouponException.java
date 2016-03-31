package com.rongyi.core.framework.exception;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/3/10 11:44
 * Package:com.rongyi.core.framework.exception
 * Project:easy-market
 */
public class CouponException extends RYServiceException {
    private int code;
    public CouponException(int errorCode, String message) {
        super(String.valueOf(errorCode),message);
        this.code=errorCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
