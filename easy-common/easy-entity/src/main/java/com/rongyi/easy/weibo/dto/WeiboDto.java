package com.rongyi.easy.weibo.dto;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/5/10    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class WeiboDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private  String uid;//uid
    private  String id;//用户ID
    private  String tokenStr;//连接token
    private  String nickName;//呢称
    private  String logoUrl ;  //头像URL


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTokenStr() {
        return tokenStr;
    }

    public void setTokenStr(String tokenStr) {
        this.tokenStr = tokenStr;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
