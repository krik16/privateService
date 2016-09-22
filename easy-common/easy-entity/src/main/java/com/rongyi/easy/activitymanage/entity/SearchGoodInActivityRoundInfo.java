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
	






}
