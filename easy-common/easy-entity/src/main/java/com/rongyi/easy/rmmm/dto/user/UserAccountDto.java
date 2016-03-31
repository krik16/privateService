package com.rongyi.easy.rmmm.dto.user;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/21
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/21              1.0            创建文件
 *
 */
public class UserAccountDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String bankLogo;// 银行logo
	private Integer bankId;// 银行Id
	private String type;// ":账号类型：1:支付宝2银行账号
	private String accountCode;// "支付宝账号/卡号
	private String bankName;// ":开户行名称
	private String accountName; // ":支付宝姓名/储蓄卡人姓名
	private String bankType;// 1表示银行储蓄卡，2表示信用卡
	private String isDisabled;// 账户是否被禁用0正常 1禁用
	private String userIsDisabled;// 登录账号是否被禁用0正常 1禁用
	private String userPhone;// 卖家手机号
	private String username;// 卖家姓名

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankLogo() {
		return bankLogo;
	}

	public void setBankLogo(String bankLogo) {
		this.bankLogo = bankLogo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getUserIsDisabled() {
		return userIsDisabled;
	}

	public void setUserIsDisabled(String userIsDisabled) {
		this.userIsDisabled = userIsDisabled;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
