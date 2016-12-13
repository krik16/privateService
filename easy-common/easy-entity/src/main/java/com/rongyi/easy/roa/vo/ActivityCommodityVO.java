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
	private Double activityPrice;//拼团商品最低价格
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private Double commodityOPriceMax;//商品最高原价
	private List<String> commodityPicList;//商品图片
	private String commodityPic;//商品图片，超级团教育版取后台配置的1:2的图片
    //众筹价
	private String crowdFundingPrice;
    //活动结束时间，单位：毫
	private Long groupEndAt;
    //已参团人数
	private Integer groupNum;
	//成团所需人数或者最小成团人数
	private Integer groupPeopleLimit;
	//最大成团人数，0表示没有最大成团人数
	private Integer groupPeopleMax;
    //活动开始时间，单位：毫秒
	private Long groupStartAt;
     //拼团状态,0：拼团中，1：成功不可以参团，2：失败，3：未开始,4成功但仍可以参团
	private Integer groupStatus;
	private Integer activityCommodityStatus;//2:审核通过，其它为失效商品
	
	
	public Integer getActivityCommodityStatus() {
		return activityCommodityStatus;
	}
	public void setActivityCommodityStatus(Integer activityCommodityStatus) {
		this.activityCommodityStatus = activityCommodityStatus;
	}
	public String getCommodityPic() {
		return commodityPic;
	}
	public void setCommodityPic(String commodityPic) {
		this.commodityPic = commodityPic;
	}
	public Integer getActivityCommodityStock() {
		return activityCommodityStock;
	}
	public void setActivityCommodityStock(Integer activityCommodityStock) {
		this.activityCommodityStock = activityCommodityStock;
	}
	public Double getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(Double activityPrice) {
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
	public Double getCommodityOPriceMax() {
		return commodityOPriceMax;
	}
	public void setCommodityOPriceMax(Double commodityOPriceMax) {
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

	public String getCrowdFundingPrice() {
		return crowdFundingPrice;
	}

	public void setCrowdFundingPrice(String crowdFundingPrice) {
		this.crowdFundingPrice = crowdFundingPrice;
	}

	public Long getGroupEndAt() {
		return groupEndAt;
	}

	public void setGroupEndAt(Long groupEndAt) {
		this.groupEndAt = groupEndAt;
	}

	public Integer getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(Integer groupNum) {
		this.groupNum = groupNum;
	}

	public Integer getGroupPeopleMax() {
		return groupPeopleMax;
	}

	public void setGroupPeopleMax(Integer groupPeopleMax) {
		this.groupPeopleMax = groupPeopleMax;
	}

	public Long getGroupStartAt() {
		return groupStartAt;
	}

	public void setGroupStartAt(Long groupStartAt) {
		this.groupStartAt = groupStartAt;
	}

	public Integer getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(Integer groupStatus) {
		this.groupStatus = groupStatus;
	}
	@Override
	public String toString() {
		return "ActivityCommodityVO [activityCommodityStock="
				+ activityCommodityStock + ", activityPrice=" + activityPrice
				+ ", commodityId=" + commodityId + ", commodityName="
				+ commodityName + ", commodityOPriceMax=" + commodityOPriceMax
				+ ", commodityPicList=" + commodityPicList + ", commodityPic="
				+ commodityPic + ", crowdFundingPrice=" + crowdFundingPrice
				+ ", groupEndAt=" + groupEndAt + ", groupNum=" + groupNum
				+ ", groupPeopleLimit=" + groupPeopleLimit
				+ ", groupPeopleMax=" + groupPeopleMax + ", groupStartAt="
				+ groupStartAt + ", groupStatus=" + groupStatus
				+ ", activityCommodityStatus=" + activityCommodityStatus + "]";
	}
	
}
