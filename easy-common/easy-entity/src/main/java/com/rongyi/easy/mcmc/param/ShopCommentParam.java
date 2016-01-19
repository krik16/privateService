package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.List;

public class ShopCommentParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7412526844670731510L;
	private String orderId;
	private String shopId;
	private String shopLevel;
	private List<CommodityCommentParam> sonOrderList;
	private String mark;// 分数：10 30 50 70 90

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopLevel() {
		return shopLevel;
	}

	public void setShopLevel(String shopLevel) {
		this.shopLevel = shopLevel;
	}

	public List<CommodityCommentParam> getSonOrderList() {
		return sonOrderList;
	}

	public void setSonOrderList(List<CommodityCommentParam> sonOrderList) {
		this.sonOrderList = sonOrderList;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
}
