package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;

/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 查出的和用户相关的信息VO
 * time ：2015年6月2日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 * 张争平                                  2015年6月2日                        1.0           创建文件
 */
public class MerchantAccountLinkVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;//用户id
	private String userLogo;//头像
	private String account;//账号
	private String name;//姓名
	private String nickName;//昵称
	private Integer roleId;//类型 (角色名称)
	private Integer mallId;//商场名称
	private Integer shopId;//店铺名称
	private Boolean cashAccountStatus;//提现账号状态  0 正常  1 冻结 2 全部
	private Integer status;//是否禁用 0正常 1停用
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getMallId() {
		return mallId;
	}
	public void setMallId(Integer mallId) {
		this.mallId = mallId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public Boolean getCashAccountStatus() {
		return cashAccountStatus;
	}
	public void setCashAccountStatus(Boolean cashAccountStatus) {
		this.cashAccountStatus = cashAccountStatus;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	
}
