package com.rongyi.easy.roa.vo.distributor;

import java.io.Serializable;

public class UserAlipyVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4169724064144051619L;
	private Integer id;//
	/** 银行账户或支付宝账号 */
    private String accountCode;
    /** 支付宝姓名/储蓄卡人姓名 */
    private String accountName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	@Override
	public String toString() {
		return "UserAlipyVO [id=" + id + ", accountCode=" + accountCode
				+ ", accountName=" + accountName + "]";
	}
	
}
