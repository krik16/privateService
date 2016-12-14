package com.rongyi.easy.bsoms.param;

import java.io.Serializable;
import java.util.Date;

public class AccountSearchParam  implements Serializable{
	
	private static final long serialVersionUID = -9070463436023392931L;
	
	private Integer id;
	
	private String userAccount;
	private String userPhone;
	private Integer industryId;
	private Integer industryVersionId;
	private Integer isChief;//是否主账号 1是 0否
	private Integer identity;//0集团管理员、1商场管理员、5导购
	private String merchantId;//商户id
	private Integer userStatus;
	private Integer isSuspended;//资金账户：是否冻结 1是 0否 
	private Integer searchStatus;//0待审核 1未通过 2启动 3停用
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public Integer getIndustryVersionId() {
		return industryVersionId;
	}
	public void setIndustryVersionId(Integer industryVersionId) {
		this.industryVersionId = industryVersionId;
	}
	public Integer getIsChief() {
		return isChief;
	}
	public void setIsChief(Integer isChief) {
		this.isChief = isChief;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getIsSuspended() {
		return isSuspended;
	}
	public void setIsSuspended(Integer isSuspended) {
		this.isSuspended = isSuspended;
	}
	public Integer getSearchStatus() {
		return searchStatus;
	}
	public void setSearchStatus(Integer searchStatus) {
		this.searchStatus = searchStatus;
	}
	@Override
	public String toString() {
		return "AccountSearchParam [id=" + id + ", userAccount=" + userAccount + ", userPhone=" + userPhone
				+ ", industryId=" + industryId + ", industryVersionId=" + industryVersionId + ", isChief=" + isChief
				+ ", identity=" + identity + ", merchantId=" + merchantId + ", userStatus=" + userStatus
				+ ", isSuspended=" + isSuspended + ", searchStatus=" + searchStatus + "]";
	}
	
}
