package com.rongyi.easy.rmmm.vo.activityEnroll;

import java.io.Serializable;
import java.util.List;
/**
 * 商品报名信息详情VO
 * @author user
 *
 */
public class ActivityEnrollInfoVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//活动与商品关联id
	private Integer activityId;//活动id
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private String commodityNo;//商品款号
	private List<String> commodityPicList;//商品图片集合
	private String commodityCurrentPrice;//商品现价
	private List<CommoditySpecVO> commoditySpecList;//参与活动的商品规格集合
	private String userId;//创建人id
	private Integer status;//状态
	private String returnReason;//退回原因
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
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
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}
	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}
	public List<CommoditySpecVO> getCommoditySpecList() {
		return commoditySpecList;
	}
	public void setCommoditySpecList(List<CommoditySpecVO> commoditySpecList) {
		this.commoditySpecList = commoditySpecList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getReturnReason() {
		return returnReason;
	}
	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}
	@Override
	public String toString() {
		return "ActivityEnrollInfoVO [id=" + id + ", activityId=" + activityId
				+ ", commodityId=" + commodityId + ", commodityName="
				+ commodityName + ", commodityNo=" + commodityNo
				+ ", commodityPicList=" + commodityPicList
				+ ", commodityCurrentPrice=" + commodityCurrentPrice
				+ ", commoditySpecList=" + commoditySpecList + ", userId="
				+ userId + ", status=" + status + ", returnReason="
				+ returnReason + "]";
	}
	
}
