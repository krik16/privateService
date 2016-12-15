package com.rongyi.easy.ryoms.user.vo;

import java.io.Serializable;

/**
 * 买手详情支付宝信息
 * @author user
 *
 */
public class BuyerAlipyVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2581232783807764863L;
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
		return "BuyerAlipyVO [id=" + id + ", accountCode=" + accountCode
				+ ", accountName=" + accountName + "]";
	}
    
    
}
