package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class TransactionDetailParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderNums;//订单号  注：多个时，以逗号隔开

	public String getOrderNums() {
		return orderNums;
	}

	public void setOrderNums(String orderNums) {
		this.orderNums = orderNums;
	}

	@Override
	public String toString() {
		return "TransactionDetailParam{" +
				"orderNums='" + orderNums + '\'' +
				'}';
	}
}
