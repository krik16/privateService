package com.rongyi.core.framework.exception;

/**
 * Invalid Parameter Exception
 *
 * @author yaoyiwei
 * @date 2016-06-06
 * @version 1.0
 */
public class BusinessException extends BaseException {

    public BusinessException() {
        super();
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

}
