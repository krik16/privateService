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

	/**
     * 场次名称
     */
    private String roundName;

    /**
     * 场次开始时间
     */
    private Date startAt;

    /**
     * 场次结束时间
     */
    private Date endAt;
	

	
    private Integer currentGoodsTotoalMuInActivity;//当前商品在本次活动的总库存



	public String getRoundName() {
		return roundName;
	}



	public void setRoundName(String roundName) {
		this.roundName = roundName;
	}



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



	public Integer getCurrentGoodsTotoalMuInActivity() {
		return currentGoodsTotoalMuInActivity;
	}



	public void setCurrentGoodsTotoalMuInActivity(Integer currentGoodsTotoalMuInActivity) {
		this.currentGoodsTotoalMuInActivity = currentGoodsTotoalMuInActivity;
	}
    


   


    
    


}
