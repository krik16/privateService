package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;

public class AccountSearchParam implements Serializable {
	
	private static final long serialVersionUID = -4855305307781509440L;
	
	private String userAccount;//账户名
	private String userPhone;
	private Integer industryId;
	private Integer industryVersionId;
	private Integer isChief;//是否主账号
	private Integer identity;//身份类型:0集团管理员、1商场管理员、5店铺（导购）
	private String relId;//商户id
	private Integer isSuspended;//资金状态: 0正常  1冻结
	private Integer searchStatus;	//0待审核  1启用  2停用  3未通过
	private int currentPage = 0;//当前页
	private int pageSize = 10;//总页数
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
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
	public String getRelId() {
		return relId;
	}
	public void setRelId(String relId) {
		this.relId = relId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
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
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "AccountSearchParam [userAccount=" + userAccount + ", userPhone=" + userPhone + ", industryId="
				+ industryId + ", industryVersionId=" + industryVersionId + ", isChief=" + isChief + ", identity="
				+ identity + ", relId=" + relId + ", isSuspended=" + isSuspended + ", searchStatus=" + searchStatus
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize + "]";
	}
	
}
