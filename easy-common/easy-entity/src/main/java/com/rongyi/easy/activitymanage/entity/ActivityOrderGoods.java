package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;

public class ActivityOrderGoods  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6611971577175758485L;
	
	private int activityId;
	private int roundId;
	private String sku;
	private int count;
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public int getRoundId() {
		return roundId;
	}
	public void setRoundId(int roundId) {
		this.roundId = roundId;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	

}
