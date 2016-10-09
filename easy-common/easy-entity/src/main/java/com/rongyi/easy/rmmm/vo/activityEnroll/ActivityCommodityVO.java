package com.rongyi.easy.rmmm.vo.activityEnroll;

import java.io.Serializable;
import java.util.List;
/**
 * 活动下的商品报名列表VO
 * @author user
 *
 */
public class ActivityCommodityVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String activityId;//活动id
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private List<String> commodityPicList;//商品图片集合
	private Integer status;//状态
	private String commodityNo;//商品款号
	private String commodityCurrentPrice;//商品现价
	private boolean isApply = false;//是否报名
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}
	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}
	public boolean isApply() {
		return isApply;
	}
	public void setApply(boolean isApply) {
		this.isApply = isApply;
	}
	@Override
	public String toString() {
		return "ActivityCommodityVO [activityId=" + activityId
				+ ", commodityId=" + commodityId + ", commodityName="
				+ commodityName + ", commodityPicList=" + commodityPicList
				+ ", status=" + status + ", commodityNo=" + commodityNo
				+ ", commodityCurrentPrice=" + commodityCurrentPrice
				+ ", isApply=" + isApply + "]";
	}
	
}
