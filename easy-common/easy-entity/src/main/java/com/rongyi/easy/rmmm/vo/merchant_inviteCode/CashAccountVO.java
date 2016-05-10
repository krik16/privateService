package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;

public class CashAccountVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer bankId;//银行id
	private String bankCardId;//银行卡号
	private String bankName;//银行名称  开户银行
	private String bankUserName;//持卡人姓名
	private int isDefault = 1 ;// 是否为默认资金账号 0是1否
	
	
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	public String getBankCardId() {
		return bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankUserName() {
		return bankUserName;
	}
	public void setBankUserName(String bankUserName) {
		this.bankUserName = bankUserName;
	}
	public int getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}
	
}
