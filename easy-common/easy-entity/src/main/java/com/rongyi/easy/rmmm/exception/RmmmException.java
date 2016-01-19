package com.rongyi.easy.rmmm.exception;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  RMMM  业务处理时发生异常
 * time:  2015/5/4
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/4              1.0            创建文件
 *
 */
public class RmmmException extends Exception{


    public RmmmException(){

    }

    public RmmmException(String message) {
        super(message) ;
    }

    public RmmmException(String message, Throwable cause) {
        super(message, cause);
    }

    public RmmmException(Throwable cause) {
        super(cause);
    }

    public RmmmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
