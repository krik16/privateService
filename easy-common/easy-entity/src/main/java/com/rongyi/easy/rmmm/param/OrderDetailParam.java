package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * 订单详情参数
 * @author chenjun
 *
 */
public class OrderDetailParam extends MalllifeBaseParam implements Serializable{

	private String orderId;// 大订单id

	private String orderNum;//订单号

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
