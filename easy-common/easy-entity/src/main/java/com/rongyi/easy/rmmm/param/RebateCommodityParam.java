/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class RebateCommodityParam extends MalllifeBaseParam implements Serializable{
	
	private Double orderPrice;//"订单总价"（不包含邮费）
	
	private Double shopPostage = 0.0;// 店铺级别订单总价"（快递邮费）
	
	private List<CommodityListParam> commoditys;//商品数据集合

	public Double getShopPostage() {
		return shopPostage;
	}

	public void setShopPostage(Double shopPostage) {
		this.shopPostage = shopPostage;
	}

	public RebateCommodityParam() {
		super();
	}

	public RebateCommodityParam(Double orderPrice, List<CommodityListParam> commoditys) {
		super();
		this.orderPrice = orderPrice;
		this.commoditys = commoditys;
	}

	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public List<CommodityListParam> getCommoditys() {
		return commoditys;
	}

	public void setCommoditys(List<CommodityListParam> commoditys) {
		this.commoditys = commoditys;
	}

	@Override
	public String toString() {
		return "RebateCommodityParam [orderPrice=" + orderPrice + ", shopPostage=" + shopPostage + ", commoditys=" + commoditys
				+ "]";
	}

}
