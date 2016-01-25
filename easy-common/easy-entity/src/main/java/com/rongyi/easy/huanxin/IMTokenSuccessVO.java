package com.rongyi.easy.huanxin;

import java.io.Serializable;

/**
 * 成功请求TOKEN返回VO
 * @author Lc
 *
 */
public class IMTokenSuccessVO implements Serializable{

	/** 返回TOKEN*/
	private String accessToken;
	/** 有效时间,秒为单位, 默认是七天,在有效期内是不需要重复获取的.
	 * 重要提醒：token在有效期内都是可用的，有效期具体值请看接口返回值中的expires_in字段，所以，请不要频繁向服务器发送获取token的请求，同一账号发送此请求超过一定频率会被服务器封号.
	 * */
	private String expiresIn;

	/** 当前app的UUID值*/
	private String application;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}
}
