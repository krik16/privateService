package com.rongyi.easy.activitymanage.entity;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 活动基础信息
 */
public class SearchGoodInActivityRoundInfo extends ActivityRoundInfo implements Serializable {
	
	


    private Integer currentGoodsTotoalMuInActivity;//当前商品在本次活动的总库存

	public Integer getCurrentGoodsTotoalMuInActivity() {
		return currentGoodsTotoalMuInActivity;
	}

	public void setCurrentGoodsTotoalMuInActivity(Integer currentGoodsTotoalMuInActivity) {
		this.currentGoodsTotoalMuInActivity = currentGoodsTotoalMuInActivity;
	}
    
    


}
