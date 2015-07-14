package com.rongyi.osm.knowledge;

import java.io.Serializable;

/**
 * 用来记录一些，发出Payment请求后，收到PaymentResponse后
 * 需要进行的动作
 * 
 * @author Fu Qiang
 *
 */
public class PaymentAction implements Serializable{
	private static final long serialVersionUID = -3107656524101208105L;
	
	private String type;
	private String orderNo;
	private String orderItemNo;
	private BaseEvent event;
	private String paymentIdList;
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[type=" + getType() + " OrderNo=" + getOrderNo() +
				" OrderItemNo=" + getOrderItemNo() + " paymentIdList=" +
				getPaymentIdList());
		return buf.toString();
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderItemNo() {
		return orderItemNo;
	}
	public void setOrderItemNo(String orderItemNo) {
		this.orderItemNo = orderItemNo;
	}
	public BaseEvent getEvent() {
		return event;
	}
	public void setEvent(BaseEvent event) {
		this.event = event;
	}
	public String getPaymentIdList() {
		return paymentIdList;
	}
	public void setPaymentIdList(String paymentIdList) {
		this.paymentIdList = paymentIdList;
	}

	public static PaymentAction create(String type, String orderNo, 
			String orderItemNo, String paymentIdList, BaseEvent event) {
		PaymentAction action = new PaymentAction();
		action.setOrderNo(orderNo);
		action.setOrderItemNo(orderItemNo);
		action.setPaymentIdList(paymentIdList);
		action.setEvent(event);
		
		return action;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
