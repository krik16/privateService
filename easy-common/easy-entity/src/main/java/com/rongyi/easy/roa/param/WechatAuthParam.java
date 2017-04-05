package com.rongyi.easy.roa.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * conan 2016/11/10 17:30
 **/
public class WechatAuthParam implements Serializable {

	private static final long serialVersionUID = 8914898844957709287L;

	private Integer mchInfoId;

	private Integer authType;

	private String redirectUrl;

	private String code;

	private Integer storeId;

	private Integer state;

	private String attach;//扩展参数

	public Integer getMchInfoId() {
		return mchInfoId;
	}

	public void setMchInfoId(Integer mchInfoId) {
		this.mchInfoId = mchInfoId;
	}

	public Integer getAuthType() {
		return authType;
	}

	public void setAuthType(Integer authType) {
		this.authType = authType;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

}
