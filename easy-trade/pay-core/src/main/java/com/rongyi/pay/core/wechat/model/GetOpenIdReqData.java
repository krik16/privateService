package com.rongyi.pay.core.wechat.model;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;

public class GetOpenIdReqData extends BaseData {

	private String code;

	private String state;

	private String appSecret;

	private String appid;

	private String grantType = "authorization_code";

	public GetOpenIdReqData(String code, String state, WechatConfigure wechatConfigure) {
		setAppid(wechatConfigure.getAppID());

		setAppSecret(wechatConfigure.getAppSecret());

		setCode(code);

		setState(state);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

}
