package com.rongyi.easy.activitymanage.entity;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class SearchGoodInActivityRoundInfo extends RoundGood implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 4774118439578283640L;
	
	private String Color;
	
	private String Size;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}
	
	
	private String activityName;
	
	
	
	
	
    public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	/**
     * 场次开始时间
     */
    private Date startAt;

    
    /**
     * 场次结束时间
     */
    private Date endAt;

	

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

	@Override
	public String toString() {
		return "SearchGoodInActivityRoundInfo [Color=" + Color + ", Size=" + Size + ", activityName=" + activityName
				+ ", startAt=" + startAt + ", endAt=" + endAt + ", getId()=" + getId() + ", getRoundId()="
				+ getRoundId() + ", getActivityId()=" + getActivityId() + ", getGoodId()=" + getGoodId()
				+ ", getGoodSpecId()=" + getGoodSpecId() + ", getRoundParticipationCount()="
				+ getRoundParticipationCount() + ", getQuotaCount()=" + getQuotaCount() + ", getRoundSellIngPrice()="
				+ getRoundSellIngPrice() + ", getRoundRemainCount()=" + getRoundRemainCount() + ", getCancelTime()="
				+ getCancelTime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	






}
