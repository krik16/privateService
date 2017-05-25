package com.rongyi.core.Exception;

/**
 * Created by WUH on 2017/5/2.
 * 权限校验异常
 */
public class AuthorityException extends RuntimeException {
    private Integer errorNo;

    private String reason;

    public int getErrorNo() {
        return errorNo;
    }

    public String getReason() {
        return reason;
    }

    public AuthorityException(){}

    public AuthorityException(Integer errorNo, String reason){
        super(reason);
        this.errorNo = errorNo;
        this.reason = reason;
    }

    public AuthorityException(Integer errorNo, String reason, Throwable e){
        super(reason, e);
        this.errorNo = errorNo;
        this.reason = reason;
    }
}
