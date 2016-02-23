package com.rongyi.easy.malllife.param;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/11/30
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/11/30              1.0            创建文件
 *
 */

import java.io.Serializable;

public class LogParam implements Serializable {

    private static final long serialVersionUID = 1L;

   private  String page;//[页面]
    private  String  forum;//[版块]
    private  String position;//[位置]
    private  String content;//[内容]
    private  String clickNum;//[点击量]
    private  String type;//[展示、点击、debug类型等]
    private  String timeStamp;//点击时间戳
    private  String channel;//分享渠道

    private String opRole;// 操作角色

    private String opType;//操作功能类型 createShopCart 创建，操作购物车 orderShopCart 生成购物车订单
    private String userId;//操作人的Id

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClickNum() {
        return clickNum;
    }

    public void setClickNum(String clickNum) {
        this.clickNum = clickNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getOpRole() {
        return opRole;
    }

    public void setOpRole(String opRole) {
        this.opRole = opRole;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
