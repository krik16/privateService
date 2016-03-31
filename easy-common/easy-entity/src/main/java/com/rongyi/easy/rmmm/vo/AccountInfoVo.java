package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * 账户信息VO
 * @author ZhangZhengping
 *
 */
public class AccountInfoVo implements Serializable{
	
	private String name;//持卡人姓名or支付宝账户名
	private Integer type;//账号类型   1.支付宝  2.银行卡
	private Integer bankId;//开户银行id
	private String bankName;//开户行名称
	private String cardOrPayNumber;//支付宝账号/银行卡卡号
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardOrPayNumber() {
		return cardOrPayNumber;
	}
	public void setCardOrPayNumber(String cardOrPayNumber) {
		this.cardOrPayNumber = cardOrPayNumber;
	}
	
}
