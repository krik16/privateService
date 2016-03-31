package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerSimpleVO implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 关联的摩生活用户昵称(mongodb.user)
     */
    private String nickname;

    /**
     * 关联的摩生活用户头像(mongodb.user)
     */
    private String headImg;

    /**
     * 是否为专属导购
     */
    private boolean belong;

    /**
     * 备注名
     */
    private String memoName;


    /**
     * 容易逛用户ID
     */
    private String userId;

    /**
     * 容易逛用户imId
     */
    private String imId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public boolean isBelong() {
        return belong;
    }

    public void setBelong(boolean belong) {
        this.belong = belong;
    }

    public String getMemoName() {
        return memoName;
    }

    public void setMemoName(String memoName) {
        this.memoName = memoName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getImId() {
        return imId;
    }

    public void setImId(String imId) {
        this.imId = imId;
    }
}
