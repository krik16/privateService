package com.rongyi.core.framework.exception;

/**
 * Invalid Parameter Exception
 *
 * @author yaoyiwei
 * @date 2016-05-09
 * @version 1.0
 */
public class InvalidParameterException extends BaseException {

    public InvalidParameterException() {
        super();
    }

    public InvalidParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParameterException(String message) {
        super(message);
    }

    public InvalidParameterException(Throwable cause) {
        super(cause);
    }

}
