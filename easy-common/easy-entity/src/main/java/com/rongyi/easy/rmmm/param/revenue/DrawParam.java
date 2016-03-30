package com.rongyi.easy.rmmm.param.revenue;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 提现param
 * @author hebo
 *
 */
public class DrawParam implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 提现金额 */
	private BigDecimal drawAmount;
	/** 提现账号 */
	private String accountNo;
	/** 提现账号户名 */
	private String accountName;
	/** 提现账号类型  (0：支付宝，1：银行卡) */
	private String accountType;
	
	/** 提现金额 */
	public BigDecimal getDrawAmount() {
		return drawAmount;
	}
	/** 提现金额 */
	public void setDrawAmount(BigDecimal drawAmount) {
		this.drawAmount = drawAmount;
	}
	/** 提现账号 */
	public String getAccountNo() {
		return accountNo;
	}
	/** 提现账号 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/** 提现账号户名 */
	public String getAccountName() {
		return accountName;
	}
	/** 提现账号户名 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	/** 提现账号类型  (0：支付宝，1：银行卡) */
	public String getAccountType() {
		return accountType;
	}
	/** 提现账号类型  (0：支付宝，1：银行卡) */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "DrawParam [drawAmount=" + drawAmount + ", accountNo=" + accountNo + ", accountName=" + accountName
				+ ", accountType=" + accountType + "]";
	}
	
}
