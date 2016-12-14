package com.rongyi.easy.ryoms.user.vo;

import java.io.Serializable;

public class BuyerStatusVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3827947678942099103L;
	
	private Integer totalCount;//总数量
	private Integer disabledCount;//停用数量
	private Integer enabledCount;//启用数量
	private Integer unauthorizedCount;//未认证数量
	private Integer notPassedCount;//未通过数量
	private Integer checkingCount;//待审核数量
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getDisabledCount() {
		return disabledCount;
	}
	public void setDisabledCount(Integer disabledCount) {
		this.disabledCount = disabledCount;
	}
	public Integer getEnabledCount() {
		return enabledCount;
	}
	public void setEnabledCount(Integer enabledCount) {
		this.enabledCount = enabledCount;
	}
	public Integer getUnauthorizedCount() {
		return unauthorizedCount;
	}
	public void setUnauthorizedCount(Integer unauthorizedCount) {
		this.unauthorizedCount = unauthorizedCount;
	}
	public Integer getNotPassedCount() {
		return notPassedCount;
	}
	public void setNotPassedCount(Integer notPassedCount) {
		this.notPassedCount = notPassedCount;
	}
	public Integer getCheckingCount() {
		return checkingCount;
	}
	public void setCheckingCount(Integer checkingCount) {
		this.checkingCount = checkingCount;
	}
	@Override
	public String toString() {
		return "BuyerStatusVO [totalCount=" + totalCount + ", disabledCount="
				+ disabledCount + ", enabledCount=" + enabledCount
				+ ", unauthorizedCount=" + unauthorizedCount
				+ ", notPassedCount=" + notPassedCount + ", checkingCount="
				+ checkingCount + "]";
	}
	
}
