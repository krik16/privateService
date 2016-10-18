package com.rongyi.easy.roa.param;

import java.io.Serializable;

public class GroupActivityParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7183439909451664270L;
	
	private Integer activityId;//拼团活动id
	private String commodityId;//商品id
	private Long activityRoundId;//拼团id
	private Integer currentPage = 1;
	private Integer pageSize = 20;
	private String memberId;//微信用户id
	
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public Long getActivityRoundId() {
		return activityRoundId;
	}
	public void setActivityRoundId(Long activityRoundId) {
		this.activityRoundId = activityRoundId;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "GroupActivityParam [activityId=" + activityId
				+ ", commodityId=" + commodityId + ", activityRoundId="
				+ activityRoundId + ", currentPage=" + currentPage
				+ ", pageSize=" + pageSize 
				+ ", memberId=" + memberId 
				+ "]";
	}
	

}
