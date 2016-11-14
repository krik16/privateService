package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;

public class GoodsInAppList implements Serializable {

	
	private static final long serialVersionUID = -5657027597391901057L;
	
	private int roundId;
	private String goodId;
	
	/**剩余库存*/
	private Integer roundRemainCount;//本场剩余库存
	/**本场次的销售价格*/
	private String roundSellIngPrice;
	
	
	
	
	public int getRoundId() {
		return roundId;
	}
	public void setRoundId(int roundId) {
		this.roundId = roundId;
	}
	public String getGoodId() {
		return goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public Integer getRoundRemainCount() {
		return roundRemainCount;
	}
	public void setRoundRemainCount(Integer roundRemainCount) {
		this.roundRemainCount = roundRemainCount;
	}
	public String getRoundSellIngPrice() {
		return roundSellIngPrice;
	}
	public void setRoundSellIngPrice(String roundSellIngPrice) {
		this.roundSellIngPrice = roundSellIngPrice;
	}
	@Override
	public String toString() {
		return "GoodsInAppList [roundId=" + roundId + ", goodId=" + goodId + ", roundRemainCount=" + roundRemainCount
				+ ", roundSellIngPrice=" + roundSellIngPrice + "]";
	}

	
	
	
}
