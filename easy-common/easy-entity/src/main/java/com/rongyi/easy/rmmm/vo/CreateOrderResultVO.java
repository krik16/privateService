package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CreateOrderResultVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> orderNo;//订单号

	private List<String[]> commodityDetailList;//0：shopid、1：商品id、2：导购id、3：规则id

	public List<String> getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(List<String> orderNo) {
		this.orderNo = orderNo;
	}

	public List<String[]> getCommodityDetailList() {
		return commodityDetailList;
	}

	public void setCommodityDetailList(List<String[]> commodityDetailList) {
		this.commodityDetailList = commodityDetailList;
	}

	@Override
	public String toString() {
		return "CreateOrderResultVO{" +
				"orderNo=" + orderNo +
				", commodityDetailList='" + commodityDetailList + '\'' +
				'}';
	}
}
