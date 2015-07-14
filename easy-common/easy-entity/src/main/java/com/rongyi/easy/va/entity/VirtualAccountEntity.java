package com.rongyi.easy.va.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class VirtualAccountEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	/** 用户Id */
	private String userId;

	/** 用户名 */
	private String userName;

	/** 店铺Id */
	private String shopId;

	/** 店铺名 */
	private String shopName;

	/** 账户余额 */
	private BigDecimal balance;

	private String alipayAccount;

	/** 已认证 */
	private Boolean isAuthenticated;

	/** 是否冻结 */
	private Boolean isSuspended;// false (0)未冻结

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getAlipayAccount() {
		return alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public Boolean getIsAuthenticated() {
		return isAuthenticated;
	}

	public void setIsAuthenticated(Boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	public Boolean getIsSuspended() {
		return isSuspended;
	}

	public void setIsSuspended(Boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

}
