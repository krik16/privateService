package com.rongyi.easy.roa.vo.distributor;

import java.io.Serializable;

public class UserCashAccountVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2060098618220500503L;
	private Integer bankId;//银行id
	private String bankCardId;//银行卡号
	private String bankName;//银行名称  开户银行
	private String bankUserName;//持卡人姓名
	private Integer type;//资金类型
	private Integer id;//表id
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UserCashAccountVO [bankId=" + bankId + ", bankCardId="
				+ bankCardId + ", bankName=" + bankName + ", bankUserName="
				+ bankUserName + ", type=" + type + ", id=" + id + "]";
	}
		
}
