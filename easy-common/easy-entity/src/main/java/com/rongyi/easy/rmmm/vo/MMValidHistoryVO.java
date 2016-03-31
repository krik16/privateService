package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class MMValidHistoryVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;//券名称
	private String couponCode;//券码
	private Integer status;//核销状态:已使用[2]
	private String buyerUserName;//买家用户名
	private String updateTime;//核销验证时间
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBuyerUserName() {
		return buyerUserName;
	}
	public void setBuyerUserName(String buyerUserName) {
		this.buyerUserName = buyerUserName;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}
