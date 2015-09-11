package com.rongyi.easy.rmmm.param.user;

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;
import java.util.List;

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
public class UserManagerParam extends BaseParam implements Serializable{

    private static final long serialVersionUID = 1L;

    private String userLogo;//用户头像
    private String  phone; //验证号码是否可注册
    private String  checkCode;//验证码",
    private String nickName;//昵称 验证唯一
    private String  uuId;  //":"设备ID"；//注册时验证,
    private String  invitCode;//":"邀请码" //验证判断
    private String  pswd;  //":"密码"
    private AccountParam account;//账号信息

    private String shopId;//商铺Id
    private String mallId;//商场Id
    private String brandId;//品牌Id
    private String userName;//用户姓名
    private String cardId;//身份证号
    private Integer type = 0;
    private Integer roleType=2;//角色类型
    private List<AccountParam> accountList;//账号信息



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public String getInvitCode() {
        return invitCode;
    }

    public void setInvitCode(String invitCode) {
        this.invitCode = invitCode;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public AccountParam getAccount() {
        return account;
    }

    public void setAccount(AccountParam account) {
        this.account = account;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public String getUserLogo() {
		return userLogo;
	}

	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}

	public List<AccountParam> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<AccountParam> accountList) {
		this.accountList = accountList;
	}
    
}
