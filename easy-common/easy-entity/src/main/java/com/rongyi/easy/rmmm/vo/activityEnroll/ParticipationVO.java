package com.rongyi.easy.rmmm.vo.activityEnroll;

import java.io.Serializable;
import java.util.List;

public class ParticipationVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roundId;//场次id
	private String activityId;//活动id
	private String commodityId;//商品id
	private String commoditySpecId;//商品规格id
	private String activityPrice;//活动价格
	private Integer inventory;//活动提报库存
	private List<SpecColumnVO> columnList;//规格具体信息集合
	private String startAt;//场次开始时间
	private String endAt;//场次结束时间
	public String getRoundId() {
		return roundId;
	}
	public void setRoundId(String roundId) {
		this.roundId = roundId;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommoditySpecId() {
		return commoditySpecId;
	}
	public void setCommoditySpecId(String commoditySpecId) {
		this.commoditySpecId = commoditySpecId;
	}
	public String getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public List<SpecColumnVO> getColumnList() {
		return columnList;
	}
	public void setColumnList(List<SpecColumnVO> columnList) {
		this.columnList = columnList;
	}
	public String getStartAt() {
		return startAt;
	}
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	public String getEndAt() {
		return endAt;
	}
	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}
	@Override
	public String toString() {
		return "ParticipationVO [roundId=" + roundId + ", activityId="
				+ activityId + ", commodityId=" + commodityId
				+ ", commoditySpecId=" + commoditySpecId + ", activityPrice="
				+ activityPrice + ", inventory=" + inventory + ", columnList="
				+ columnList + ", startAt=" + startAt + ", endAt=" + endAt
				+ "]";
	}
	
}
