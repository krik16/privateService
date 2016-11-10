package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GoodShowStyleInRY implements Serializable {

	private static final long serialVersionUID = 7695372922025982811L;
	
	
	private String activityName;
	private Integer activityId;
	private Integer RoundId;
	private List<RoundGood> goods;
	
	
	
	 public Date getStartAt() {
		return startAt;
	}
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}
	public Date getEndAt() {
		return endAt;
	}
	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}
	/**
     * 场次开始时间
     */
    private Date startAt;

    
    /**
     * 场次结束时间
     */
    private Date endAt;
	
	
	
	
	
	
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public Integer getRoundId() {
		return RoundId;
	}
	public void setRoundId(Integer roundId) {
		RoundId = roundId;
	}
	public List<RoundGood> getGoods() {
		return goods;
	}
	public void setGoods(List<RoundGood> goods) {
		this.goods = goods;
	}
	
	
	

}
