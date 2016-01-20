package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class UserExclusiveGuideVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//导购id
	private String userLogo;//导购头像
	private String userName;//导购姓名
	private String userNickName;//导购昵称
	private String userPhone;//导购电话号码
	private Integer shopId;//店铺id
	private Double userScore;//导购评分
	private String shopName;//店铺名称
	private String shopMId;//店铺mongoId
	private String userImId;//导购环信id
	private Boolean online;//true 在线  false 离线
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public Double getUserScore() {
		return userScore;
	}
	public void setUserScore(Double userScore) {
		this.userScore = userScore;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getUserImId() {
		return userImId;
	}
	public void setUserImId(String userImId) {
		this.userImId = userImId;
	}
	public String getShopMId() {
		return shopMId;
	}
	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}
	public Boolean getOnline() {
		return online;
	}
	public void setOnline(Boolean online) {
		this.online = online;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
}
