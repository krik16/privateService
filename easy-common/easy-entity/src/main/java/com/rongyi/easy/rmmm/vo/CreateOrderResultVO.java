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

	private String commodityName;//商品名称

	private Integer commodityNum;//商品数量

	private List<Integer> detailModelIds;//要删除的或修改的子模板id集合

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

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Integer getCommodityNum() {
		return commodityNum;
	}

	public void setCommodityNum(Integer commodityNum) {
		this.commodityNum = commodityNum;
	}

	public List<Integer> getDetailModelIds() {
		return detailModelIds;
	}

	public void setDetailModelIds(List<Integer> detailModelIds) {
		this.detailModelIds = detailModelIds;
	}

	@Override
	public String toString() {
		return "CreateOrderResultVO{" +
				"orderNo=" + orderNo +
				"commodityName=" + commodityName +
				"commodityNum=" + commodityNum +
				"detailModelIds=" + detailModelIds +
				", commodityDetailList='" + commodityDetailList + '\'' +
				'}';
	}
}
