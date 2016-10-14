package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
* @Description: 拼团详情vo
* @author chenjun
* @date 2016年10月14日 上午10:32:05 
*
 */
public class ActivityGroupDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8378241802744823078L;
		
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private String commodityOPriceMax;//商品最高原价
	private int commodityAppStatus;//商品APP显示状态 (0下架 1上架 3待上架 4秒杀结束)
	private List<String> commodityPicList;//商品图片	
	private Integer activityId;//拼团活动id
	private String activityName;//拼团活动名称
	private Integer activityCommodityStock;//活动商品库存
	private String activityPrice;//拼团商品最低价格
	private Long endAt;//拼团活动结束时间
	private Long startAt;//拼团活动开始时间
	private Boolean forceAttention = false;//下单是否需要强制关注,true：要关注，false：不需要关注
	private Long groupEndAt;//拼团结束时间
	private List<GroupMemberVO> groupMembers;//参团人员
	private Integer groupPeopleLimit;//成团所需人数
	private Integer groupStatus;//拼团状态,0：拼团中，1：成功，2：失败
	private Integer memberIdentity;//用户身份,0：未参团者，1：开团者，2：参团者
	private String orderNo;//用户参团或开团的订单号
	
	public int getCommodityAppStatus() {
		return commodityAppStatus;
	}
	public void setCommodityAppStatus(int commodityAppStatus) {
		this.commodityAppStatus = commodityAppStatus;
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
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
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
	public Long getEndAt() {
		return endAt;
	}
	public void setEndAt(Long endAt) {
		this.endAt = endAt;
	}
	public Long getStartAt() {
		return startAt;
	}
	public void setStartAt(Long startAt) {
		this.startAt = startAt;
	}
	public Boolean getForceAttention() {
		return forceAttention;
	}
	public void setForceAttention(Boolean forceAttention) {
		this.forceAttention = forceAttention;
	}
	public Long getGroupEndAt() {
		return groupEndAt;
	}
	public void setGroupEndAt(Long groupEndAt) {
		this.groupEndAt = groupEndAt;
	}
	public List<GroupMemberVO> getGroupMembers() {
		return groupMembers;
	}
	public void setGroupMembers(List<GroupMemberVO> groupMembers) {
		this.groupMembers = groupMembers;
	}
	public Integer getGroupPeopleLimit() {
		return groupPeopleLimit;
	}
	public void setGroupPeopleLimit(Integer groupPeopleLimit) {
		this.groupPeopleLimit = groupPeopleLimit;
	}
	public Integer getGroupStatus() {
		return groupStatus;
	}
	public void setGroupStatus(Integer groupStatus) {
		this.groupStatus = groupStatus;
	}
	public Integer getMemberIdentity() {
		return memberIdentity;
	}
	public void setMemberIdentity(Integer memberIdentity) {
		this.memberIdentity = memberIdentity;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	@Override
	public String toString() {
		return "ActivityGroupDetailVO [commodityId=" + commodityId
				+ ", commodityName=" + commodityName + ", commodityOPriceMax="
				+ commodityOPriceMax + ", commodityPicList=" + commodityPicList
				+ ", activityId=" + activityId + ", activityName="
				+ activityName + ", activityCommodityStock="
				+ activityCommodityStock + ", activityPrice=" + activityPrice
				+ ", endAt=" + endAt + ", startAt=" + startAt
				+ ", forceAttention=" + forceAttention + ", groupEndAt="
				+ groupEndAt + ", groupMembers=" + groupMembers + ", groupPeopleLimit="
				+ groupPeopleLimit + ", groupStatus=" + groupStatus
				+ ", memberIdentity=" + memberIdentity 
				+ ", orderNo=" + orderNo + ", commodityAppStatus=" + commodityAppStatus
				+ "]";
	}

}
