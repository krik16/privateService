package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;
import java.util.Date;

public class AccountSearchVO implements Serializable{

	private static final long serialVersionUID = 657842639354511268L;

	private Integer id;
	private String userAccount ;//  用户账号
	private String userName;//用户姓名
	private String userPhone;
	private Integer identity;//身份类型
	private Integer industryId;
	private String industryName;
	private Integer industryVersionId;
	private String industryVersionName;
	private String marchantName;
	private Integer isDisabled;
	private Integer userStatus;
	private Integer searchStatus;//0待审核  1启用  2停用  3未通过
	private Integer cashStatus;//资金状态: 0正常  1冻结
	private Integer isChief;
	
	private Integer optEdit;//0不显示修改 、1显示修改
	private Integer optVerify;//0不显示审核、1显示审核
	private Integer optSuspended;//0不显示冻结或解冻、1显示冻结或解冻
	private Integer optStatus;//0不显示停用或启用、1显示停用或启用
	private Integer showAuthDetail;
	private Date virtualAccountStopAt;
	private String virtualAccountStopReason;
	private Date stopAt;
	private String stopReason;
	
	public Date getStopAt() {
		return stopAt;
	}
	public void setStopAt(Date stopAt) {
		this.stopAt = stopAt;
	}
	public String getStopReason() {
		return stopReason;
	}
	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}
	public Date getVirtualAccountStopAt() {
		return virtualAccountStopAt;
	}
	public void setVirtualAccountStopAt(Date virtualAccountStopAt) {
		this.virtualAccountStopAt = virtualAccountStopAt;
	}
	public String getVirtualAccountStopReason() {
		return virtualAccountStopReason;
	}
	public void setVirtualAccountStopReason(String virtualAccountStopReason) {
		this.virtualAccountStopReason = virtualAccountStopReason;
	}
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public Integer getIndustryVersionId() {
		return industryVersionId;
	}
	public void setIndustryVersionId(Integer industryVersionId) {
		this.industryVersionId = industryVersionId;
	}
	public String getIndustryVersionName() {
		return industryVersionName;
	}
	public void setIndustryVersionName(String industryVersionName) {
		this.industryVersionName = industryVersionName;
	}
	public String getMarchantName() {
		return marchantName;
	}
	public void setMarchantName(String marchantName) {
		this.marchantName = marchantName;
	}
	public Integer getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(Integer isDisabled) {
		this.isDisabled = isDisabled;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getSearchStatus() {
		return searchStatus;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public void setSearchStatus(Integer searchStatus) {
		this.searchStatus = searchStatus;
	}
	public Integer getCashStatus() {
		return cashStatus;
	}
	public void setCashStatus(Integer cashStatus) {
		this.cashStatus = cashStatus;
	}
	public Integer getIsChief() {
		return isChief;
	}
	public void setIsChief(Integer isChief) {
		this.isChief = isChief;
	}
	public Integer getOptEdit() {
		return optEdit;
	}
	public void setOptEdit(Integer optEdit) {
		this.optEdit = optEdit;
	}
	public Integer getOptVerify() {
		return optVerify;
	}
	public void setOptVerify(Integer optVerify) {
		this.optVerify = optVerify;
	}
	public Integer getOptSuspended() {
		return optSuspended;
	}
	public void setOptSuspended(Integer optSuspended) {
		this.optSuspended = optSuspended;
	}
	public Integer getOptStatus() {
		return optStatus;
	}
	public void setOptStatus(Integer optStatus) {
		this.optStatus = optStatus;
	}
	public Integer getShowAuthDetail() {
		return showAuthDetail;
	}
	public void setShowAuthDetail(Integer showAuthDetail) {
		this.showAuthDetail = showAuthDetail;
	}
	
}
