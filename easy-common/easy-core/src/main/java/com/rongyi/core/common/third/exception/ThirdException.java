package com.rongyi.core.common.third.exception;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  第三方业务 处理异常
 * time:  2015/9/22
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/22              1.0            创建文件
 *
 */

public class ThirdException extends Exception{

    private String code;

    public ThirdException(){
        super();
    }

    public ThirdException(String message) {
        super(message) ;
    }

    public ThirdException(String code,String message) {
        super(message) ;
        this.code = code;
    }

    public ThirdException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThirdException(Throwable cause) {
        super(cause);
    }

    public ThirdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
