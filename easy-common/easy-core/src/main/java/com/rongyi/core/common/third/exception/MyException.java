/**
 * 
 */
package com.rongyi.core.common.third.exception;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年7月27日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年7月27日               1.0              创建文件
 */
public class MyException extends Exception{
	
	private int code;

	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException(int code, String message) {
		super(message);
		this.code = code;
	}
	
	public MyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public MyException(Throwable cause) {
		super(cause);
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}		

}
