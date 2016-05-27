package com.rongyi.core.framework.exception;

/**
 * Database Exception
 *
 * @author yaoyiwei
 * @date 2016-05-09
 * @version 1.0
 */
public class DatabaseException extends BaseException {

    public DatabaseException() {
        super();
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(Throwable cause) {
        super(cause);
    }
}
