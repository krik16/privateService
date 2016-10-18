package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;
import java.util.Date;

public class GroupDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8643031504146087289L;

	@Override
	public String toString() {
		return "GroupDetail{" +
				"activityId=" + activityId +
				", groupId=" + groupId +
				", userNick='" + userNick + '\'' +
				", userIcon='" + userIcon + '\'' +
				", userId='" + userId + '\'' +
				", groupRole=" + groupRole +
				", openId='" + openId + '\'' +
				", goodId='" + goodId + '\'' +
				", goodSpecId='" + goodSpecId + '\'' +
				", goodGroupPrice=" + goodGroupPrice +
				", createAt=" + createAt +
				", joinState=" + joinState +
				", orderNo='" + orderNo + '\'' +
				'}';
	}

	/***
	 * 活动id
	 */
	private int activityId;

	/**
	 * 团id
	 */
	private long groupId;
	
	
	private String userNick;
	
	private String userIcon;
	private String userId;

	/**
	 * 0团长,1团员
	 */
	private int groupRole;
	
	private String openId;
	
	
	/***
	 * 商品id
	 */
	private String goodId;
	
	/***
	 * 商品specid
	 */
	private String goodSpecId;

	public double getGoodGroupPrice() {
		return goodGroupPrice;
	}

	public void setGoodGroupPrice(double goodGroupPrice) {
		this.goodGroupPrice = goodGroupPrice;
	}

	/***
	 * 拼团价格
	 */
	private double goodGroupPrice;
	
	
	
	/**
	 * 创建时间
	 */
	private Date createAt;
	
	
	/**
	 * 参团状态,0 成功  ,1 失败
	 */
	private int joinState;

	
	private  String orderNo;
	/**
	 * 0微信,1容易逛
	 */
	private int userType;
	
	

	public int getGroupRole() {
		return groupRole;
	}


	public void setGroupRole(int groupRole) {
		this.groupRole = groupRole;
	}


	public String getOpenId() {
		return openId;
	}


	public void setOpenId(String openId) {
		this.openId = openId;
	}


	public long getGroupId() {
		return groupId;
	}


	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}


	public String getUserName() {
		return userNick;
	}


	public void setUserName(String userName) {
		this.userNick = userName;
	}


	public String getUserIcon() {
		return userIcon;
	}


	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}


	public String getGoodId() {
		return goodId;
	}


	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}


	public String getGoodSpecId() {
		return goodSpecId;
	}


	public void setGoodSpecId(String goodSpecId) {
		this.goodSpecId = goodSpecId;
	}


	public Date getCreateAt() {
		return createAt;
	}


	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}


	public int getJoinState() {
		return joinState;
	}


	public void setJoinState(int joinState) {
		this.joinState = joinState;
	}


	public int getActivityId() {
		return activityId;
	}


	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}


	public String getUserNick() {
		return userNick;
	}


	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}





	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}
}
