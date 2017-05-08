package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 单品推荐返回VO
 * @author user
 *
 */
public class ActivityCommodityVO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commodityId;
	private String commodityOPriceMax;//我是最高原价”,
    private String commodityOPriceMin;//我是最低原价”,
    private String commodityCPriceMax;//我是最高现价”,
    private String commodityCPriceMin;//我是最低现价”,
    private String commodityOPOfLCP;//我是最低现价对应的原价
    private String commodityDescription;//我是商品描述”,
    private String commodityName;//我是商品名称”,
    private List<String> commodityPicList; // 图片地址
    private String activityUrl;//单品活动图片
    
	public String getActivityUrl() {
		return activityUrl;
	}
	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityOPriceMax() {
		return commodityOPriceMax;
	}
	public void setCommodityOPriceMax(String commodityOPriceMax) {
		this.commodityOPriceMax = commodityOPriceMax;
	}
	public String getCommodityOPriceMin() {
		return commodityOPriceMin;
	}
	public void setCommodityOPriceMin(String commodityOPriceMin) {
		this.commodityOPriceMin = commodityOPriceMin;
	}
	public String getCommodityCPriceMax() {
		return commodityCPriceMax;
	}
	public void setCommodityCPriceMax(String commodityCPriceMax) {
		this.commodityCPriceMax = commodityCPriceMax;
	}
	public String getCommodityCPriceMin() {
		return commodityCPriceMin;
	}
	public void setCommodityCPriceMin(String commodityCPriceMin) {
		this.commodityCPriceMin = commodityCPriceMin;
	}
	public String getCommodityOPOfLCP() {
		return commodityOPOfLCP;
	}
	public void setCommodityOPOfLCP(String commodityOPOfLCP) {
		this.commodityOPOfLCP = commodityOPOfLCP;
	}
	public String getCommodityDescription() {
		return commodityDescription;
	}
	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	@Override
	public String toString() {
		return "ActivityCommodityVO [commodityId=" + commodityId
				+ ", commodityOPriceMax=" + commodityOPriceMax
				+ ", commodityOPriceMin=" + commodityOPriceMin
				+ ", commodityCPriceMax=" + commodityCPriceMax
				+ ", commodityCPriceMin=" + commodityCPriceMin
				+ ", commodityOPOfLCP=" + commodityOPOfLCP
				+ ", commodityDescription=" + commodityDescription
				+ ", commodityName=" + commodityName + ", commodityPicList="
				+ commodityPicList + "]";
	}
    
}
