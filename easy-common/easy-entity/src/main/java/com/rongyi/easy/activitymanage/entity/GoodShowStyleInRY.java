package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;
import java.util.List;

public class GoodShowStyleInRY implements Serializable {

	private static final long serialVersionUID = 7695372922025982811L;
	
	
	private String activityName;
	private Integer activityId;
	private Integer RoundId;
	private List<RoundGood> goods;
	
	
	
	
	
	
	
	
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
