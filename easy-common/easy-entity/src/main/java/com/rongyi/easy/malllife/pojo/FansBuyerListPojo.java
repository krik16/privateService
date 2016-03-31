package com.rongyi.easy.malllife.pojo;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  我的买手列表
 * time:  2015/10/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/20              1.0            创建文件
 *
 */

import java.io.Serializable;

public class FansBuyerListPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;//用户（买手id)

    private String  userNickName;//买手呢称

    private String  userName; //名称

    private String  userLogo;//卖家logo

    private String  userDesc;//简介

    private Boolean isFans=true;//false 未关注；ture 已关注

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public Boolean getIsFans() {
        return isFans;
    }

    public void setIsFans(Boolean isFans) {
        this.isFans = isFans;
    }
}
