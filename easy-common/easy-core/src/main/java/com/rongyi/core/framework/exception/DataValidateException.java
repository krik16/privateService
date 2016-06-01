package com.rongyi.core.framework.exception;


/**
 * Data Validate Exception
 *
 * @author yaoyiwei
 * @date 2016-05-09
 * @version 1.0
 */
public class DataValidateException extends BaseException {
    private String message;

    public DataValidateException() {
        this.message = "";
    }

    public DataValidateException(String message) {
        this.message = message;
    }

    public DataValidateException(String message, Throwable t) {
        super(message, t);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
