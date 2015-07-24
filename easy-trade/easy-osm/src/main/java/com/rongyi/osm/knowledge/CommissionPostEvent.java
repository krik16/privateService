/** 
 * @Title: CommissionPostEvent.java 
 * @Package com.rongyi.osm.knowledge 
 * @Description: 佣金进入tms待审核列表的事件，由osm发起，发起时间点为订单完成（确认收货冷却时间结束）
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月21日 上午11:50:45 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.knowledge;

import java.math.BigDecimal;

import net.sf.json.JSONObject;

import com.rongyi.core.constant.TmsEventTypeEnum;

/**
 * @author ZhengYl
 * 
 */
public class CommissionPostEvent extends UserEvent {
	private static final long serialVersionUID = -3107656524101208105L;
	
	/** 佣金金额 */
	private BigDecimal commissionAmount;
	
	/** 导购Id */
	private String guideId;
	
	/** 买家Id */
	private String buyerId;
	
	/**
	 * 事件发起: osm，接收方: tms
	 */
	public CommissionPostEvent(){
		setTarget("tms");
		setSource("osm");
		setType(TmsEventTypeEnum.COMMISSION_POST.getCode());
	}
	
	@Override
	public void updateBody() {
		super.updateBody();
		
		JSONObject param = getBody();
		param.put("commissionAmount", getCommissionAmount());
		param.put("guideId", getGuideId());
		param.put("buyerId", getBuyerId());
	}
	
	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}
	
	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	
	public String getGuideId() {
		return guideId;
	}
	
	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	
	
}
