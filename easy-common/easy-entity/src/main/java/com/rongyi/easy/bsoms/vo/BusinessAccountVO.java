package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;

public class BusinessAccountVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;//用户id
	private String account;//用户账号
	private String userName;//用户姓名
	private Integer type;//商家类型
	private Integer identity;//身份类型
	private String groupName;//集团名称
	private String ownerName;//品牌名
	private String mallName;//商场名
	private Integer accountStatus;//账号状态：是否禁用0正常 1禁用'
	private Integer isSuspended;//是否冻结
	private Integer cashAccountStatus;//账户资金状态：0正常  1冻结
	private Integer createSource;//账号来源：0大运营、1商家后台
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public Integer getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Integer getIsSuspended() {
		return isSuspended;
	}
	public void setIsSuspended(Integer isSuspended) {
		this.isSuspended = isSuspended;
	}
	public Integer getCashAccountStatus() {
		return cashAccountStatus;
	}
	public void setCashAccountStatus(Integer cashAccountStatus) {
		this.cashAccountStatus = cashAccountStatus;
	}
	public Integer getCreateSource() {
		return createSource;
	}
	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}
	@Override
	public String toString() {
		return "BusinessAccountVO [id=" + id + ", account=" + account
				+ ", userName=" + userName + ", type=" + type + ", identity="
				+ identity + ", groupName=" + groupName + ", ownerName="
				+ ownerName + ", mallName=" + mallName + ", accountStatus="
				+ accountStatus + ", isSuspended=" + isSuspended
				+ ", cashAccountStatus=" + cashAccountStatus
				+ ", createSource=" + createSource + "]";
	}
}
