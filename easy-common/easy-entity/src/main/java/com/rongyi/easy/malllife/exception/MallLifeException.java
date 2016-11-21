package com.rongyi.easy.malllife.exception;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  摩生活 业务异常类
 * time:  2015/5/12
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/12              1.0            创建文件
 *
 */
public class MallLifeException extends Exception{
	
	private int code;


    public MallLifeException(){

    }

    public MallLifeException(String message) {
        super(message) ;
    }

    public MallLifeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MallLifeException(Throwable cause) {
        super(cause);
    }

    public MallLifeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public MallLifeException(int code, String message) {
		super(message);
		this.code = code;
	}
    
    public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}