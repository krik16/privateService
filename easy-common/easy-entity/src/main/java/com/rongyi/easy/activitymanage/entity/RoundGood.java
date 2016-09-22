package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;

public class RoundGood  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9147429880524919599L;
	private Integer id;//数据库id
	private Integer roundId;//场次id
	
	private Integer activityId;//活动id
	
	private String goodId;//商品id
	
	private String goodSpecId ;//商品规格id
	
	private Integer roundParticipationCount;//本场次参与库存
	
	private Integer quotaCount;//限购数目
	
	private String roundSellIngPrice;//本场次的销售价格
	
	private Integer roundRemainCount;//本场剩余库存
	
	private String specName;//规格名称
	
	private String catName;//分类

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoundId() {
		return roundId;
	}

	public void setRoundId(Integer roundId) {
		this.roundId = roundId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

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

	public Integer getRoundParticipationCount() {
		return roundParticipationCount;
	}

	public void setRoundParticipationCount(Integer roundParticipationCount) {
		this.roundParticipationCount = roundParticipationCount;
	}

	public Integer getQuotaCount() {
		return quotaCount;
	}

	public void setQuotaCount(Integer quotaCount) {
		this.quotaCount = quotaCount;
	}

	public String getRoundSellIngPrice() {
		return roundSellIngPrice;
	}

	public void setRoundSellIngPrice(String roundSellIngPrice) {
		this.roundSellIngPrice = roundSellIngPrice;
	}

	public Integer getRoundRemainCount() {
		return roundRemainCount;
	}

	public void setRoundRemainCount(Integer roundRemainCount) {
		this.roundRemainCount = roundRemainCount;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
