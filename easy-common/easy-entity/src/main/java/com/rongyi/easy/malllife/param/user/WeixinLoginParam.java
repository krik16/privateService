package com.rongyi.easy.malllife.param.user;

import java.io.Serializable;
/**
 * 微信登陆参数
 * @author user
 *
 */
public class WeixinLoginParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String phone;//手机号（用户账号）
	private String pswd;//密码
	private String openId;//微信openId

	private String appId; //商家公众号Id


	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
}
