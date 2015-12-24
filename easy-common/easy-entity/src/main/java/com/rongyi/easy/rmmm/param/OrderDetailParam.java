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
	private boolean cartOrder = false;//true 是购物车订单，false:普通订单
	private String orderNum;//订单号
	
	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public boolean isCartOrder() {
		return cartOrder;
	}

	public void setCartOrder(boolean cartOrder) {
		this.cartOrder = cartOrder;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
