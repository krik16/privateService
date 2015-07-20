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
     * todo 是否为专属导购
     */
    private boolean belong;

    /**
     * 备注名
     */
    private String memoName;

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
}
