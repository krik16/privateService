package com.rongyi.osm.knowledge;

import java.math.BigDecimal;

import net.sf.json.JSONObject;

import com.rongyi.core.constant.Constants;

public class PaymentEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 8000726598132369643L;
	
	private BigDecimal totalAmount;
	private String paymentIdList;
	private String weidianId;

	public PaymentEvent() {
		setTarget(Constants.MQRequestParam.REQUEST_QUEUENAME_RPB);
		setSource(Constants.MQRequestParam.REQUEST_QUEUENAME_OSM);
	}
	
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getPaymentIdList() {
		return paymentIdList;
	}

	public void setPaymentIdList(String paymentIdList) {
		this.paymentIdList = paymentIdList;
	}

	public void updateBody() {
		super.updateBody();
		
		JSONObject param = getBody();
		param.put("totalPrice", getTotalAmount());
		param.put("paymentId", getPaymentIdList());
		
		if (weidianId != null) {
			param.put("weidianId", getWeidianId());
		}
	}

	public String getWeidianId() {
		return weidianId;
	}

	public void setWeidianId(String weidianId) {
		this.weidianId = weidianId;
	}
}
