package com.rongyi.core.bean;

/**
 * 统一返回对象 逐渐废弃
 *
 * @author baodk
 * @see ResponseVO
 */
public class ResponseResult implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 成功消息Code **/
	private static final String SUCCESS = "0";
	/** 是否成功 **/
	private boolean success = true;
	/** 返回对象类型数据 **/
	private Object info;
	/** 信息编码 **/
	private String code;
	/** 提升信息 **/
	private String message;

	/**
	 * 构造函数 - 默认success
	 */
	public ResponseResult() {
		this.success = true;
		this.code = SUCCESS;
		this.message = "成功";
	}

	/**
	 * Error 
	 * @param errCode	错误码
	 * @param message	消息
	 * @return
	 */
	public ResponseResult error(String errCode, String message) {
		return error(errCode, message, null);
	}

	/**
	 * Error 
	 * @param errCode	错误码
	 * @param message	消息
	 * @param info		info
	 * @return
	 */
	public ResponseResult error(String errCode, String message, Object info) {
		this.success = false;
		this.code = errCode;
		this.message = message;
		this.info = info;
		return this;
	}
	
	/**
	 * Success 
	 * @return
	 */
	public ResponseResult Success() {
		return Success(null);
	}

	/**
	 * Success 
	 * @param info		返回值信息
	 * @return
	 */
	public ResponseResult Success(Object info) {
		return Success(info, "正常");
	}
	
	/**
	 * Success 
	 * @param info		返回值信息
	 * @param message	消息
	 * @return
	 */
	public ResponseResult Success(Object info, String message) {
		return Success(info, message, SUCCESS);
	}
	
	/**
	 * Success 
	 * @param info		返回值信息
	 * @param message	消息
	 * @param errCode	消息码
	 * @return
	 */
	public ResponseResult Success(Object info, String message, String errCode) {
		this.success = true;
		this.info = info;
		this.code = errCode;
		this.message = message;
		return this;
	}

	/**
	 * 判断成功
	 * @return
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * 判断失败
	 * @return
	 */
	public boolean isError() {
		return !success;
	}

	public ResponseResult setSuccess(boolean success) {
		this.success = success;
		return this;
	}

	public Object getInfo() {
		return info;
	}

	public ResponseResult setInfo(Object info) {
		this.info = info;
		return this;
	}

	public String getCode() {
		return code;
	}

	public Integer getCodeInt() {
		return Integer.valueOf(code);
	}

	public ResponseResult setCode(String code) {
		this.code = code;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResponseResult setMessage(String message) {
		this.message = message;
		return this;
	}
	
	public static ResponseResult err(String errCode, String message) {
		return new ResponseResult().error(errCode, message);
	}
	
	public static ResponseResult err(String errCode, String message, Object info) {
		return new ResponseResult().error(errCode, message, info);
	}
	
	public static ResponseResult succ() {
		return new ResponseResult().Success();
	}
	
	public static ResponseResult succ(Object info) {
		return new ResponseResult().Success(info);
	}
	
	public static ResponseResult succ(Object info, String message) {
		return new ResponseResult().Success(info, message);
	}
	
	public static ResponseResult succ(Object info, String message, String errCode) {
		return new ResponseResult().Success(info, message, errCode);
	}

	@Override
	public String toString() {
		return "ResponseResult [success=" + success + ", info=" + info + ", code=" + code + ", message=" + message + "]";
	}

}
