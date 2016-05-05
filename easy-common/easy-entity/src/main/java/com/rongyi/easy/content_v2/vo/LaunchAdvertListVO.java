package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * ROA - 开机广告列表
 * 
 * @author wangjh7
 * @date 2016年4月7日
 */
public class LaunchAdvertListVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 888790447067061421L;

	private int disabled = 0;
	private int continueTime = 0;
	private List<LaunchAdvertVO> picList = null;


	public int getContinueTime() {
		return continueTime;
	}

	public void setContinueTime(int continueTime) {
		this.continueTime = continueTime;
	}

	public List<LaunchAdvertVO> getPicList() {
		return picList;
	}

	public void setPicList(List<LaunchAdvertVO> picList) {
		this.picList = picList;
	}

	public int getDisabled() {
		return disabled;
	}

	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("picList", picList)
				.append("continueTime", continueTime)
				.append("disabled", disabled)
				.toString();
	}
}
