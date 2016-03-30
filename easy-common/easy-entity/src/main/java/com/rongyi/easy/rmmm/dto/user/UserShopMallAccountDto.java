package com.rongyi.easy.rmmm.dto.user;

import java.io.Serializable;

/*
 * Copyright (C);上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  卖家用户_店铺_商场_账户信息
 * time:  2015/5/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/13              1.0            创建文件
 *
 */
public class UserShopMallAccountDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;//用户Id
    private String userPhone;
    private String userName;
    private Integer userStatus;// 1:通过，2：审核中，3：删除
    private String accountName;//支付账号名称
    private String accountCode;//支付账号
    private Integer accountType;//类型1:支付宝;2：银行卡
    private Integer shopId;//店铺ID
    private String  shopName;
    private Integer mallId;//商场ID
    private String mallName;

    private String shopMid;

    private String mallMid;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }
}
