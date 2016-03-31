package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class SafeguardInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sonOrderId;// 子订单id
	private String safeguardStatus;// 维权状态
	private String safeguardResult;// 维权结果
	private String waitingTime;// 等待时间
	// private String shopIM;//店铺IM账号
	private List<String> shopIM;// 店铺IM账号
	private String requestTime;// 申请维权时间
	private String officialTime;// 官方介入时间
	private String safeguardEndTime;// 维权结束时间
	private String officalDescribe;// 官方描述
	private List<String> safeguardPicList;// 图片列表List
	private String safeguardComment;// 维权说明
	private String sonOrderStatus;// 子订单状态
	private String countDown;// 等带商家处理时间
	private String appealTimes;// 维权次数

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getSafeguardStatus() {
		return safeguardStatus;
	}

	public void setSafeguardStatus(String safeguardStatus) {
		this.safeguardStatus = safeguardStatus;
	}

	public String getSafeguardResult() {
		return safeguardResult;
	}

	public void setSafeguardResult(String safeguardResult) {
		this.safeguardResult = safeguardResult;
	}

	public String getWaitingTime() {
		return waitingTime;
	}

	public void setWaitingTime(String waitingTime) {
		this.waitingTime = waitingTime;
	}

	public List<String> getShopIM() {
		return shopIM;
	}

	public void setShopIM(List<String> shopIM) {
		this.shopIM = shopIM;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getOfficialTime() {
		return officialTime;
	}

	public void setOfficialTime(String officialTime) {
		this.officialTime = officialTime;
	}

	public String getSafeguardEndTime() {
		return safeguardEndTime;
	}

	public void setSafeguardEndTime(String safeguardEndTime) {
		this.safeguardEndTime = safeguardEndTime;
	}

	public String getOfficalDescribe() {
		return officalDescribe;
	}

	public void setOfficalDescribe(String officalDescribe) {
		this.officalDescribe = officalDescribe;
	}

	public List<String> getSafeguardPicList() {
		return safeguardPicList;
	}

	public void setSafeguardPicList(List<String> safeguardPicList) {
		this.safeguardPicList = safeguardPicList;
	}

	public String getSafeguardComment() {
		return safeguardComment;
	}

	public void setSafeguardComment(String safeguardComment) {
		this.safeguardComment = safeguardComment;
	}

	public String getSonOrderStatus() {
		return sonOrderStatus;
	}

	public void setSonOrderStatus(String sonOrderStatus) {
		this.sonOrderStatus = sonOrderStatus;
	}

	public String getCountDown() {
		return countDown;
	}

	public void setCountDown(String countDown) {
		this.countDown = countDown;
	}

	public String getAppealTimes() {
		return appealTimes;
	}

	public void setAppealTimes(String appealTimes) {
		this.appealTimes = appealTimes;
	}

}
