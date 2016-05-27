package com.rongyi.core.framework.exception;

/**
 * Base Exception
 *
 * @author yaoyiwei
 * @date 2016-05-09
 * @version 1.0
 */
public class BaseException extends Exception {

    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}