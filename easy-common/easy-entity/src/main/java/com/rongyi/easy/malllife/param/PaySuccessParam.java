package com.rongyi.easy.malllife.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

public class PaySuccessParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderId;//订单id
	private Integer type;//支付类型   1商品订单  2优惠券订单
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "PaySuccessParam [orderId=" + orderId + ", type=" + type + "]";
	}
	
}
