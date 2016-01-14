package com.rongyi.easy.exception;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/12/1
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/12/1              1.0            创建文件
 *
 */

public class UserException  extends Exception {

    public UserException(){

    }

    public UserException(String message) {
        super(message) ;
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException(Throwable cause) {
        super(cause);
    }

    public UserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }



}
