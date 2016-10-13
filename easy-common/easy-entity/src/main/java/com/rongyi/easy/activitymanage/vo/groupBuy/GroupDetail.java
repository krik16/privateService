package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;
import java.util.Date;

public class GroupDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8643031504146087289L;
	
	
	/***
	 * 活动id
	 */
	private int activityId;

	/**
	 * 团id
	 */
	private int groupId;
	
	
	private String userNick;
	
	private String userIcon;
	private String userId;
	
	
	/***
	 * 商品id
	 */
	private String goodId;
	
	/***
	 * 商品specid
	 */
	private String goodSpecId;
	
	
	/**
	 * 创建时间
	 */
	private Date createAt;
	
	
	/**
	 * 参团状态,0 成功  ,1 失败
	 */
	private int joinState;


	public int getGroupId() {
		return groupId;
	}


	public void setGroupId(int groupId) {
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
	
	
	
	
	
	
}
