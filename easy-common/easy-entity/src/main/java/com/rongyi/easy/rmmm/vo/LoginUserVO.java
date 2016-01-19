package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.huanxin.HuanXinConfig;

import java.io.Serializable;
import java.util.List;

public class LoginUserVO implements Serializable{
	Integer userId;
	String jsessionid;
	String permission;
	String huanXiImId;
	String status;
	String shopId;
	 String nickname;//昵称
	 String phone;//手机号
	// String password;//密码
	 String name;//姓名
	 String logo;//头像url
	String shopMId;//商铺MID
	String sharCode;
	List<Integer> identityType; //角色列表
	String currentId;//当前角色状态

	private Integer isDisabled=0; //0 默认,禁用 1 用于标识非当前状态登录账号的状态


	private String appCode= HuanXinConfig.IMCODE_SECOND;

	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getHuanXiImId() {
		return huanXiImId;
	}
	public void setHuanXiImId(String huanXiImId) {
		this.huanXiImId = huanXiImId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}


	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getShopMId() {
		return shopMId;
	}

	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getSharCode() {
		return sharCode;
	}

	public void setSharCode(String sharCode) {
		this.sharCode = sharCode;
	}

	public List<Integer> getIdentityType() {
		return identityType;
	}

	public void setIdentityType(List<Integer> identityType) {
		this.identityType = identityType;
	}

	public String getCurrentId() {
		return currentId;
	}

	public void setCurrentId(String currentId) {
		this.currentId = currentId;
	}

	public Integer getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Integer isDisabled) {
		this.isDisabled = isDisabled;
	}
}
