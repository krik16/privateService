package com.rongyi.easy.rmmm.exception;

/**
 * 未登录的异常
 * 类UnLoginException.java的实现描述：TODO 类实现描述 
 * @author rongyi-13 2014年8月19日 上午11:23:20
 */
public class UnLoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String msg = "请重新登录";

	public UnLoginException() {
		super(msg);
	}
}
