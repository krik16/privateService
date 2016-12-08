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
	private Integer activityStatus;//1:未开始，2：进行中，3：活动已结束
	private String activityName;//拼团活动名称
	private Integer activityCommodityStock;//活动商品库存
	private double activityPrice;//拼团商品最低价格
	private Long endAt;//拼团活动结束时间
	private Long startAt;//拼团活动开始时间
	private Boolean forceAttention = false;//下单是否需要强制关注,true：要关注，false：不需要关注
	private Long groupStartAt;//拼团开始时间
	private Long groupEndAt;//拼团结束时间
	private List<GroupMemberVO> groupMembers;//参团人员
	private Integer groupPeopleLimit;//成团所需人数
	private Integer groupStatus;//拼团状态,0：拼团中，1：成功，2：失败
	private Integer memberIdentity;//用户身份,0：未参团者，1：开团者，2：参团者
	private String orderNo;//用户参团或开团的订单号
	private String activityCommodityDesc;//拼团活动商品描述
	private int groupTotalNum;//活动商品参团总人数
	private boolean ifOpenGroup;//是否可参团，true:可以，false：不可以
	private boolean ifJoinGroup;//是否可开团，true可以，false不可以

	//超级团
	private String  activityGroupDesc;//	开团说明
	private int groupNum;//已参团人数
	private int groupPeopleMax;//最大成团人数，0表示没有最大成团人数
	private Integer activityType;//8普通拼团,9电商版拼团，10教育版拼团

	private String activityRoundId;//超级团教育版团编号，用来参团，如果超级团未开团，则没有团编号
	private boolean ifSupportAdjustPrice;//是否支持按成团人数调价，true:支持，false:不支持
	private String expectTotalAmount;//众筹价
	private String mallName;//商场名称
	
	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getExpectTotalAmount() {
		return expectTotalAmount;
	}

	public void setExpectTotalAmount(String expectTotalAmount) {
		this.expectTotalAmount = expectTotalAmount;
	}

	public Long getGroupStartAt() {
		return groupStartAt;
	}

	public void setGroupStartAt(Long groupStartAt) {
		this.groupStartAt = groupStartAt;
	}

	public Integer getActivityType() {
		return activityType;
	}

	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}

	public String getActivityGroupDesc() {
		return activityGroupDesc;
	}

	public void setActivityGroupDesc(String activityGroupDesc) {
		this.activityGroupDesc = activityGroupDesc;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public int getGroupPeopleMax() {
		return groupPeopleMax;
	}

	public void setGroupPeopleMax(int groupPeopleMax) {
		this.groupPeopleMax = groupPeopleMax;
	}

	public boolean isIfOpenGroup() {
		return ifOpenGroup;
	}
	public void setIfOpenGroup(boolean ifOpenGroup) {
		this.ifOpenGroup = ifOpenGroup;
	}
	public boolean isIfJoinGroup() {
		return ifJoinGroup;
	}
	public void setIfJoinGroup(boolean ifJoinGroup) {
		this.ifJoinGroup = ifJoinGroup;
	}
	public Integer getActivityStatus() {
		return activityStatus;
	}
	public void setActivityStatus(Integer activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityCommodityDesc() {
		return activityCommodityDesc;
	}
	public void setActivityCommodityDesc(String activityCommodityDesc) {
		this.activityCommodityDesc = activityCommodityDesc;
	}
	public int getGroupTotalNum() {
		return groupTotalNum;
	}
	public void setGroupTotalNum(int groupTotalNum) {
		this.groupTotalNum = groupTotalNum;
	}
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
	public double getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(double activityPrice) {
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

	public String getActivityRoundId() {
		return activityRoundId;
	}

	public void setActivityRoundId(String activityRoundId) {
		this.activityRoundId = activityRoundId;
	}

	public boolean isIfSupportAdjustPrice() {
		return ifSupportAdjustPrice;
	}

	public void setIfSupportAdjustPrice(boolean ifSupportAdjustPrice) {
		this.ifSupportAdjustPrice = ifSupportAdjustPrice;
	}

	@Override
	public String toString() {
		return "ActivityGroupDetailVO [commodityId=" + commodityId
				+ ", commodityName=" + commodityName + ", commodityOPriceMax="
				+ commodityOPriceMax + ", commodityAppStatus="
				+ commodityAppStatus + ", commodityPicList=" + commodityPicList
				+ ", activityId=" + activityId + ", activityStatus="
				+ activityStatus + ", activityName=" + activityName
				+ ", activityCommodityStock=" + activityCommodityStock
				+ ", activityPrice=" + activityPrice + ", endAt=" + endAt
				+ ", startAt=" + startAt + ", forceAttention=" + forceAttention
				+ ", groupStartAt=" + groupStartAt + ", groupEndAt="
				+ groupEndAt + ", groupMembers=" + groupMembers
				+ ", groupPeopleLimit=" + groupPeopleLimit + ", groupStatus="
				+ groupStatus + ", memberIdentity=" + memberIdentity
				+ ", orderNo=" + orderNo + ", activityCommodityDesc="
				+ activityCommodityDesc + ", groupTotalNum=" + groupTotalNum
				+ ", ifOpenGroup=" + ifOpenGroup + ", ifJoinGroup="
				+ ifJoinGroup + ", activityGroupDesc=" + activityGroupDesc
				+ ", groupNum=" + groupNum + ", groupPeopleMax="
				+ groupPeopleMax + ", activityType=" + activityType + "]";
	}
	
}
