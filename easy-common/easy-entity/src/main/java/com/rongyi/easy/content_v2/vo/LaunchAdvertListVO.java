package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.List;

/**
 * ROA - 开机广告列表
 * 
 * @author wangjh7
 * @date 2016年4月7日
 */
public class LaunchAdvertListVO implements Serializable {

	@Override
	public String toString() {
		return "LaunchAdvertListVO [disable=" + disable + ", continueTime=" + continueTime + ", picList=" + picList
				+ "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 888790447067061421L;

	public int getDisable() {
		return disable;
	}

	public void setDisable(int disable) {
		this.disable = disable;
	}

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

	private int disable = 0;
	private int continueTime = 0;
	private List<LaunchAdvertVO> picList = null;
}
