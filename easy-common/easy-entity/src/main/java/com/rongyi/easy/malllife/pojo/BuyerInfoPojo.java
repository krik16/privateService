package com.rongyi.easy.malllife.pojo;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  买手信息表
 * time:  2015/10/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/20              1.0            创建文件
 *
 */

import java.io.Serializable;

public class BuyerInfoPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId; //买手ID
    
    //商家类型：0商场、1品牌、2买手
    private Integer userType;//卖家类型

    private String  userLogo;//卖家logo

    private String  userPhone;//手机号

    private String  userNickName;//买手呢称

    private String  userName; //名称

    private String  shareCode; //邀请码

    private String  userDesc;//简介

    private String  imUser;//环信号

    private Integer userFansCount;//粉丝数

    private Boolean isFans;//false 未关注；ture 已关注


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShareCode() {
        return shareCode;
    }

    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public Integer getUserFansCount() {
        return userFansCount;
    }

    public void setUserFansCount(Integer userFansCount) {
        this.userFansCount = userFansCount;
    }

    public Boolean getIsFans() {
        return isFans;
    }

    public void setIsFans(Boolean isFans) {
        this.isFans = isFans;
    }

    public String getImUser() {
        return imUser;
    }

    public void setImUser(String imUser) {
        this.imUser = imUser;
    }
}
