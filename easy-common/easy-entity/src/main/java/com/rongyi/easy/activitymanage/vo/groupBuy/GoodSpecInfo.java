package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;

public class GoodSpecInfo implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -3017144665036364356L;


	/***
	 * 商品id
	 * 
	 */
	private String goodId;
	
	
	/***
	 * 商品规格id
	 * 
	 */
	private String goodSpecId;
	
	
	/***
	 * 拼团价格
	 */
	private int goodGroupPrice;
	
	
	/***
	 * 拼团参与库存
	 */
	private int joinCount;
	
	
	/***
	 * 剩余库存
	 */
	private int remainCount;


	public String getGoodId() {
		return goodId;
	}


	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}


	public String getGoodSpecId() {
		return goodSpecId;
	}


	public void setGoodSpecId(String goodSpecId) {
		this.goodSpecId = goodSpecId;
	}


	public int getGoodGroupPrice() {
		return goodGroupPrice;
	}


	public void setGoodGroupPrice(int goodGroupPrice) {
		this.goodGroupPrice = goodGroupPrice;
	}


	public int getJoinCount() {
		return joinCount;
	}


	public void setJoinCount(int joinCount) {
		this.joinCount = joinCount;
	}


	public int getRemainCount() {
		return remainCount;
	}


	public void setRemainCount(int remainCount) {
		this.remainCount = remainCount;
	}
	
	
	
	
	
	
}
