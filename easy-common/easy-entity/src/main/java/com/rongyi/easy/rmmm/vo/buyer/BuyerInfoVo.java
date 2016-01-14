package com.rongyi.easy.rmmm.vo.buyer;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/19
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/19              1.0            创建文件
 *
 */


import java.io.Serializable;

public class BuyerInfoVo implements Serializable {

    private static final long serialVersionUID = 7266627322594910368L;

    /** 主键 */
    private Integer id;
    /** 用户头像logo */
    private String logo; //
    /** 电话号码 */
    private String phone;//手机号
    /** 昵称 */
    private String nickname; //呢称
    private String name;//名称

    /**
     * 卖家评分
     */
    private Double mark;
    private String sharCode;//邀请码
    String currentId;//当前角色状态
    String userDesc;//用户简介

    //商家信息
    private int liveCount; //买手直播场次
    private int commodityCount; //买手手持商品总数
    private int fansCount; //粉丝数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getSharCode() {
        return sharCode;
    }

    public void setSharCode(String sharCode) {
        this.sharCode = sharCode;
    }

    public String getCurrentId() {
        return currentId;
    }

    public void setCurrentId(String currentId) {
        this.currentId = currentId;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public int getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(int liveCount) {
        this.liveCount = liveCount;
    }

    public int getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(int commodityCount) {
        this.commodityCount = commodityCount;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }
}
