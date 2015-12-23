package com.rongyi.easy.rmmm.param;

/**
 * 订单详情参数
 * @author chenjun
 *
 */
public class OrderDetailParam {

	private String orderId;// 大订单id
	private boolean cartOrder = false;//true 是购物车订单，false:普通订单
	
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
