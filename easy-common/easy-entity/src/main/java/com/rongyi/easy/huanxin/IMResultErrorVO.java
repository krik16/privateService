package com.rongyi.easy.huanxin;

import java.io.Serializable;

/**
 * 
 * @author Lc
 * 
 * IM注册返回错误vo
 */

public class IMResultErrorVO implements Serializable{

	/** 环信IM返回ERROR名称*/
	private String error;
	/** 时间戳*/
	private Integer timestamp;
	/** 时长*/
	private Integer duration;
	/** 异常*/
	private String exception;
	/** 异常描述*/
	private String errorDescription;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	
}
