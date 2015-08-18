/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月20日上午10:25:33
 * @Description: TODO
 *
 **/

package com.rongyi.easy.tms.vo;

import java.io.Serializable;

/**	
 * @Author:  柯军
 * @Description: 优惠券佣金增加发送MQ消息bean 
 * @datetime:2015年7月20日上午10:25:33
 *
 **/

public class CouponCommissionMqVO implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -2033461681012450924L;

	private String guideId;
    
    private Double commissionAmount;
   
	public String getGuideId() {
		return guideId;
	}
	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}
	public Double getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
    
    

}
