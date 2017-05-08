package com.rongyi.easy.ryoms.param.buyer;

import com.rongyi.easy.bsoms.param.BaseParam;


public class BuyerListParam extends BaseParam{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2950649397011978868L;
	private String userAccount;//买手账号
	private String phone;//手机号
	private Integer status;//账户状态(0:启用,1:停用,2:未认证,3:待审核,4:未通过)
	private Integer fundsStatus;//资金状态：(0:正常,1:冻结,全部传空值)
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getFundsStatus() {
		return fundsStatus;
	}
	public void setFundsStatus(Integer fundsStatus) {
		this.fundsStatus = fundsStatus;
	}
	@Override
	public String toString() {
		return "BuyerListParam [userAccount=" + userAccount + ", phone="
				+ phone + ", status=" + status + ", fundsStatus=" + fundsStatus
				+ "]";
	}
	
	
}
