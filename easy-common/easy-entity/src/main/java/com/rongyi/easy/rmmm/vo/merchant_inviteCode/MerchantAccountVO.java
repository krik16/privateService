package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 商家账号列表VO
 * time ：2015年5月27日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 *   张争平                           2015年5月27日                        1.0            创建文件
 */
public class MerchantAccountVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//用户id
	private String userLogo;//头像
	private String account;//账号
	private String name;//姓名
	private String cardId;//身份证
	private String nickName;//昵称
	private Integer roleType;//类型 (角色名称) 1店长  2导购
	private String mallName;//商场名称
	private String mallMId;//商场mongo id
	private String shopName;//店铺名称
	private String shopMId;//店铺mongo id
	private Integer cashAccountStatus;//提现账号状态  0 正常  1 冻结 2 全部
	private Integer status;//是否禁用 0正常 1停用
	private Integer shopProperties;//商场性质 1 商场店铺 2 街边店
	/** 账户余额 */
	private BigDecimal balance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getRoleType() {
		return roleType;
	}
	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Integer getCashAccountStatus() {
		return cashAccountStatus;
	}
	public void setCashAccountStatus(Integer cashAccountStatus) {
		this.cashAccountStatus = cashAccountStatus;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
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
	public Integer getShopProperties() {
		return shopProperties;
	}
	public void setShopProperties(Integer shopProperties) {
		this.shopProperties = shopProperties;
	}
	public String getMallMId() {
		return mallMId;
	}
	public void setMallMId(String mallMId) {
		this.mallMId = mallMId;
	}
	public String getShopMId() {
		return shopMId;
	}
	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}
	
}
