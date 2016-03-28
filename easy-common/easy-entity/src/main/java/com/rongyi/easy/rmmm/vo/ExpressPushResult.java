package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * 返回给快递100的数据
 * @author user
 *
 */
public class ExpressPushResult  implements Serializable{
	
	/** true表示回调成功,false表示失败 **/
	private boolean result = true;
	/** 200: 提交成功  500: 服务器错误  其他错误请自行定义 **/
	private String returnCode;
	/** 错误信息 **/
	private String message;
	public ExpressPushResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpressPushResult(boolean result, String returnCode, String message) {
		super();
		this.result = result;
		this.returnCode = returnCode;
		this.message = message;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "SubscribeResult [result=" + result + ", returnCode="
				+ returnCode + ", message=" + message + "]";
	}

}
