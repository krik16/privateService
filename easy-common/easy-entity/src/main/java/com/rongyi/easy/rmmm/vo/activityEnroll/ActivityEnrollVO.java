package com.rongyi.easy.rmmm.vo.activityEnroll;

import java.io.Serializable;
/**
 * 商品活动报名VO
 * @author user
 *
 */
public class ActivityEnrollVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String activityId;//活动id
	private String activityName;//活动名称
	private String description;//描述
	private String startAt;//开始时间
	private String endAt;//结束时间
	private Integer status;//活动状态
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartAt() {
		return startAt;
	}
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	public String getEndAt() {
		return endAt;
	}
	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ActivityEnrollVO [activityId=" + activityId + ", activityName="
				+ activityName + ", description=" + description + ", startAt="
				+ startAt + ", endAt=" + endAt + ", status=" + status + "]";
	}
	
}
