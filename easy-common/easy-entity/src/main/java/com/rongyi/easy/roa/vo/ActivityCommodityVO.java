package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 拼团活动商品vo
* @Description: 
* @author chenjun
* @date 2016年10月14日 上午10:31:14 
*
 */
public class ActivityCommodityVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -598866414899955040L;
	
	private Integer activityCommodityStock;//活动商品库存
	private String activityPrice;//拼团商品最低价格
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private String commodityOPriceMax;//商品最高原价
	private Integer groupPeopleLimit;//成团所需人数
	private List<String> commodityPicList;//商品图片
	public Integer getActivityCommodityStock() {
		return activityCommodityStock;
	}
	public void setActivityCommodityStock(Integer activityCommodityStock) {
		this.activityCommodityStock = activityCommodityStock;
	}
	public String getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityOPriceMax() {
		return commodityOPriceMax;
	}
	public void setCommodityOPriceMax(String commodityOPriceMax) {
		this.commodityOPriceMax = commodityOPriceMax;
	}
	public Integer getGroupPeopleLimit() {
		return groupPeopleLimit;
	}
	public void setGroupPeopleLimit(Integer groupPeopleLimit) {
		this.groupPeopleLimit = groupPeopleLimit;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	@Override
	public String toString() {
		return "GroupActivityCommodityVO [activityCommodityStock="
				+ activityCommodityStock + ", activityPrice=" + activityPrice
				+ ", commodityId=" + commodityId + ", commodityName="
				+ commodityName + ", commodityOPriceMax=" + commodityOPriceMax
				+ ", groupPeopleLimit=" + groupPeopleLimit + ", commodityPicList="
				+ commodityPicList + "]";
	}

}
