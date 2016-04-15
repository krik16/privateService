package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

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
		return new ToStringBuilder(this)
				.append("picUrl", picUrl)
				.append("type", type)
				.append("typeCode", typeCode)
				.append("duration", duration)
				.append("shareContent", shareContent)
				.append("shareTitle", shareTitle)
				.append("sharePic", sharePic)
				.append("appTitle", appTitle)
				.toString();
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

	public String getShareContent() {
		return shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getSharePic() {
		return sharePic;
	}

	public void setSharePic(String sharePic) {
		this.sharePic = sharePic;
	}

	public String getAppTitle() {
		return appTitle;
	}

	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}

	private String picUrl = "";
	private int type = 0;
	private String typeCode = "";
	private int duration = 0;
	private String shareContent;
	private String shareTitle;
	private String sharePic;
	private String appTitle;
}
