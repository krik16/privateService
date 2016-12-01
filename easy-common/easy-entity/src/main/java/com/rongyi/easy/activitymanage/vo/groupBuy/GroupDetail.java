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
	private Integer activityId;
	/**
	 * 团id
	 */
	private Long groupId;
	private String userNick;//用户昵称(有特殊字符,存的是编码后的)
	private String userIcon; //用户头像全地址 
	private String userId;//用户id
	/**
	 * 0团长,1团员
	 */
	private Integer groupRole;
	private String openId;//open id
	private String phone;//用户手机号码
	/***
	 * 商品id
	 */
	private String goodId;
	/***
	 * 商品specid
	 */
	private String goodSpecId;
	/***
	 * 拼团价格
	 */
	private Double price;
	/**
	 * 创建时间
	 */
	private Date createAt;
	/**
	 * 参团状态,0 成功  ,1 失败
	 */
	private Integer joinState;
	private  String orderNo;//订单号
	/**
	 * 0微信,1容易逛
	 */
	private Integer userType;
	private Integer id;
	private String userName;//姓名 
	private String userPhone;//用户手机号码
	private String userPosition;//用户职位
	private String userCompany;//用户公司简称


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}

	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getGroupRole() {
		return groupRole;
	}

	public void setGroupRole(Integer groupRole) {
		this.groupRole = groupRole;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getJoinState() {
		return joinState;
	}

	public void setJoinState(Integer joinState) {
		this.joinState = joinState;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

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
				", phone='" + phone + '\'' +
				", goodId='" + goodId + '\'' +
				", goodSpecId='" + goodSpecId + '\'' +
				", price=" + price +
				", createAt=" + createAt +
				", joinState=" + joinState +
				", orderNo='" + orderNo + '\'' +
				", userType=" + userType +
				", userName=" + userName +
				", userPhone=" + userPhone +
				", userPosition=" + userPosition +
				", userCompany=" + userCompany +
				", id=" + id +
				'}';
	}
}
