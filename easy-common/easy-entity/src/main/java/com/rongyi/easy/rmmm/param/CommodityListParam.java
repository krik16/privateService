/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class CommodityListParam implements Serializable{
	
    private String commodityId;//商品id
	
	private Integer num;//商品购买数量
	
	private Double commodityUnitPrice;//商品单价

	public CommodityListParam() {
		super();
	}

	public CommodityListParam(String commodityId, Integer num, Double commodityUnitPrice) {
		super();
		this.commodityId = commodityId;
		this.num = num;
		this.commodityUnitPrice = commodityUnitPrice;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getCommodityUnitPrice() {
		return commodityUnitPrice;
	}

	public void setCommodityUnitPrice(Double commodityUnitPrice) {
		this.commodityUnitPrice = commodityUnitPrice;
	}

	@Override
	public String toString() {
		return "CommodityListParam [commodityId=" + commodityId + ", num=" + num + ", commodityUnitPrice=" + commodityUnitPrice
				+ "]";
	}

}
