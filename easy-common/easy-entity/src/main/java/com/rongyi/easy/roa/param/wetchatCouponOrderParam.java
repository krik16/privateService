package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class wetchatCouponOrderParam extends MalllifeBaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderNo;//订单号
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
}
