package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;

public class AccountSearchParam implements Serializable {
	
	private static final long serialVersionUID = -4855305307781509440L;
	
	private String userAccount;//账户名
	private String phone;
	private Integer industryId;
	private Integer industryVersionId;
	private Integer isChief;//是否主账号
	private Integer identity;//身份类型:0集团管理员、1商场管理员、5店铺（导购）
	private String relId;//商户id
	private Integer cashStatus;//资金状态: 0正常  1冻结
	private Integer disableStatus;	//0待审核  1启用  2停用  3未通过
	private int currentPage = 0;//当前页
	private int pageSize =0;//总页数
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public Integer getCashStatus() {
		return cashStatus;
	}
	public void setCashStatus(Integer cashStatus) {
		this.cashStatus = cashStatus;
	}
	public Integer getDisableStatus() {
		return disableStatus;
	}
	public void setDisableStatus(Integer disableStatus) {
		this.disableStatus = disableStatus;
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
	
}
