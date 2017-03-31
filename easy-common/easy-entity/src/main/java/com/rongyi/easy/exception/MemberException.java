package com.rongyi.easy.exception;

import com.rongyi.core.framework.exception.BusinessException;

/**
 * desc
 *
 * @author wangjh7
 * @date 2017-03-10
 **/
public class MemberException extends BusinessException {
    private String code;

    public MemberException(String message) {
        super(message);
    }

    public MemberException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
