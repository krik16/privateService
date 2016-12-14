package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/20              1.0            创建文件
 *
 */
public class AccountParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  type;//账号类型： 1:支付宝2银行账号
    private String  accountCode;//支付宝账号/卡号
    private String bankId;//开户行ID
    private String  accountName;//支付宝姓名/储蓄卡人姓名
    private Integer userId;
    private Integer id;
    /** 是否为默认资金账号  0是  1否  **/
    private Integer isDefault;
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

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
}
