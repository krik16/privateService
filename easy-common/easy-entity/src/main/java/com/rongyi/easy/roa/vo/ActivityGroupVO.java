package com.rongyi.easy.roa.vo;

import java.io.Serializable;

/**
 * 
* @Description: 拼团vo
* @author chenjun
* @date 2016年10月14日 上午10:31:28 
*
 */
public class ActivityGroupVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5733923224371109330L;
	
	private Long activityRoundId;//拼团id
	private String commodityId;//商品id
	private Long groupEndAt;//拼团结束时间groupNum
	private Integer groupPeopleLimit;//拼团所需人数
	private Integer groupRemainNum;//剩余成团人数
	private String memberId;//开团人id
	private String memberLogo;//开团人头像
	private String memberName;//开团人昵称
	
	
	public Integer getGroupPeopleLimit() {
		return groupPeopleLimit;
	}
	public void setGroupPeopleLimit(Integer groupPeopleLimit) {
		this.groupPeopleLimit = groupPeopleLimit;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public Long getActivityRoundId() {
		return activityRoundId;
	}
	public void setActivityRoundId(Long activityRoundId) {
		this.activityRoundId = activityRoundId;
	}
	public Long getGroupEndAt() {
		return groupEndAt;
	}
	public void setGroupEndAt(Long groupEndAt) {
		this.groupEndAt = groupEndAt;
	}
	public Integer getGroupRemainNum() {
		return groupRemainNum;
	}
	public void setGroupRemainNum(Integer groupRemainNum) {
		this.groupRemainNum = groupRemainNum;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberLogo() {
		return memberLogo;
	}
	public void setMemberLogo(String memberLogo) {
		this.memberLogo = memberLogo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "ActivityGroupVO [activityRoundId=" + activityRoundId
				+ ", groupEndAt=" + groupEndAt + ", groupRemainNum="
				+ groupRemainNum + ", memberId=" + memberId + ", memberLogo="
				+ memberLogo 
				+ ", memberName=" + memberName 
				+ ", commodityId=" + commodityId 
				+ ", groupPeopleLimit=" + groupPeopleLimit 
				+ "]";
	}

}
