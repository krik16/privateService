package com.rongyi.easy.va.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
	/** 冻结原因 */
	private String stopReason;// false (0)未冻结
	/** 冻结时间 */
	private Date stopAt;// false (0)未冻结
	private String drawPassword;//提现密码

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

	public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public Date getStopAt() {
		return stopAt;
	}

	public void setStopAt(Date stopAt) {
		this.stopAt = stopAt;
	}

	public String getDrawPassword() {
		return drawPassword;
	}

	public void setDrawPassword(String drawPassword) {
		this.drawPassword = drawPassword;
	}

	@Override
	public String toString() {
		return "VirtualAccountEntity{" +
				"id=" + id +
				", userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", shopId='" + shopId + '\'' +
				", shopName='" + shopName + '\'' +
				", balance=" + balance +
				", alipayAccount='" + alipayAccount + '\'' +
				", isAuthenticated=" + isAuthenticated +
				", isSuspended=" + isSuspended +
				", stopReason='" + stopReason + '\'' +
				", stopAt=" + stopAt +
				", drawPassword='" + drawPassword + '\'' +
				'}';
	}
}
