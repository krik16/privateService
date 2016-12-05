package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;

public class RoundGoodInSell  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5433489050872070577L;
	
	
	private Integer id;
		
	/**活动id*/
	private Integer activityId;
	/**场次id*/
	private Integer roundId;
	
	private String goodId;
	/**sku*/
	private String goodSku;
	/**限购数*/
	private Integer quotaCount;
	/**本场次参与库存*/
	private Integer roundParticipationCount;//本场次参与库存
	/**本场次的销售价格*/
	private String roundSellIngPrice;//本场次的销售价格
	/**本场剩余库存*/
	private Integer roundRemainCount;//本场剩余库存
	
	/**订单取消时间*/
	private Integer cancelTime;
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public Integer getRoundId() {
		return roundId;
	}
	public void setRoundId(Integer roundId) {
		this.roundId = roundId;
	}
	public String getGoodSku() {
		return goodSku;
	}
	public void setGoodSku(String goodSku) {
		this.goodSku = goodSku;
	}
	public Integer getQuotaCount() {
		return quotaCount;
	}
	public void setQuotaCount(Integer quotaCount) {
		this.quotaCount = quotaCount;
	}
	public Integer getCancelTime() {
		return cancelTime;
	}
	public void setCancelTime(Integer cancelTime) {
		this.cancelTime = cancelTime;
	}
	public Integer getRoundParticipationCount() {
		return roundParticipationCount;
	}
	public void setRoundParticipationCount(Integer roundParticipationCount) {
		this.roundParticipationCount = roundParticipationCount;
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
	
	
	public String getGoodId() {
		return goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "RoundGoodInSell [id=" + id + ", activityId=" + activityId + ", roundId=" + roundId + ", goodId="
				+ goodId + ", goodSku=" + goodSku + ", quotaCount=" + quotaCount + ", roundParticipationCount="
				+ roundParticipationCount + ", roundSellIngPrice=" + roundSellIngPrice + ", roundRemainCount="
				+ roundRemainCount + ", cancelTime=" + cancelTime + "]";
	}
	
	
	
	
	
	
	
	
}
