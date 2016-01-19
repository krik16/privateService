/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年7月27日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年7月27日 1.0 创建文件
 */
public class MaxIntegralParam implements Serializable {

	private Double orderPrice = 0.0;

	private Double expressFee = 0.0;

	private Double platformRebateAmount = 0.0;

	private List<OrderListParam> orderList;

	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Double getExpressFee() {
		return expressFee;
	}

	public void setExpressFee(Double expressFee) {
		this.expressFee = expressFee;
	}

	public List<OrderListParam> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderListParam> orderList) {
		this.orderList = orderList;
	}

	public Double getPlatformRebateAmount() {
		return platformRebateAmount;
	}

	public void setPlatformRebateAmount(Double platformRebateAmount) {
		this.platformRebateAmount = platformRebateAmount;
	}

	@Override
	public String toString() {
		return "MaxIntegralParam{" +
				"orderPrice=" + orderPrice +
				", expressFee=" + expressFee +
				", orderList=" + orderList +
				", platformRebateAmount=orderList" + platformRebateAmount +
				'}';
	}
}
