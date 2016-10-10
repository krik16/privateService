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
	private String name;//活动名称
	private String activityRule;//描述
	private String startAt;//开始时间
	private String endAt;//结束时间
	private String createAt;//创建时间
	private Integer status;//活动状态
	/**
	 * 活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖7秒杀' 7'10月版本新增的秒杀'
	 */
	private Integer activityType;
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActivityRule() {
		return activityRule;
	}
	public void setActivityRule(String activityRule) {
		this.activityRule = activityRule;
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
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getActivityType() {
		return activityType;
	}
	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}
	@Override
	public String toString() {
		return "ActivityEnrollVO [activityId=" + activityId + ", name=" + name
				+ ", activityRule=" + activityRule + ", startAt=" + startAt
				+ ", endAt=" + endAt + ", createAt=" + createAt + ", status="
				+ status + ", activityType=" + activityType + "]";
	}
	
	
}
