package com.rongyi.core.Exception;

/**
 * Created by WUH on 2017/5/2.
 * 文件系统异常
 */
public class FileSystemException extends Exception {
    private Integer errorNo;

    private String reason;

    public int getErrorNo() {
        return errorNo;
    }

    public String getReason() {
        return reason;
    }

    public FileSystemException(){}

    public FileSystemException(Integer errorNo, String reason){
        super(reason);
        this.errorNo = errorNo;
        this.reason = reason;
    }

    public FileSystemException(Integer errorNo, String reason, Throwable e){
        super(reason, e);
        this.errorNo = errorNo;
        this.reason = reason;
    }
}
