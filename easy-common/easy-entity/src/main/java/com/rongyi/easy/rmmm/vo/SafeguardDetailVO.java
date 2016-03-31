package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class SafeguardDetailVO extends RefundDetailVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String safeguardComment;//维权说明
	private List<String> safeguardPicList;//维权说明图片集合
	private String waitingTime;//等待时间
	private String safeguardStatus;//维权状态
	private String remainingTime;//等待官方介入剩余描述
	
	public String getSafeguardComment() {
		return safeguardComment;
	}
	public void setSafeguardComment(String safeguardComment) {
		this.safeguardComment = safeguardComment;
	}
	public List<String> getSafeguardPicList() {
		return safeguardPicList;
	}
	public void setSafeguardPicList(List<String> safeguardPicList) {
		this.safeguardPicList = safeguardPicList;
	}
	public String getWaitingTime() {
		return waitingTime;
	}
	public void setWaitingTime(String waitingTime) {
		this.waitingTime = waitingTime;
	}
	public String getSafeguardStatus() {
		return safeguardStatus;
	}
	public void setSafeguardStatus(String safeguardStatus) {
		this.safeguardStatus = safeguardStatus;
	}
	public String getRemainingTime() {
		return remainingTime;
	}
	public void setRemainingTime(String remainingTime) {
		this.remainingTime = remainingTime;
	}
	
}
