package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

/**
 * ROA - 开机广告
 * 
 * @author wangjh7
 * @date 2016年4月7日
 */
public class LaunchAdvertVO implements Serializable {
	@Override
	public String toString() {
		return "LaunchAdvertVO [picUrl=" + picUrl + ", type=" + type + ", typeCode=" + typeCode + ", duration="
				+ duration + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5293372883986852421L;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	private String picUrl = "";
	private int type = 0;
	private String typeCode = "";
	private int duration = 0;
}
