package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

/**
 * Created by lijing on 2015/10/20.
 */
public class QuickDetailVO implements Serializable {
    /**
     * 图片
     */
    private String picName;
    /**
     * 标题
     */
    private String title;
    /**类型
     *商场    1
     店铺    2
     文章    7
     商品    4
     代金券  5
     直播    12（new）
     特卖    13（new）
     外链    9
     */
    private String quickType;
    /**外链值*/
    private String quickTypeVal;

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuickType() {
        return quickType;
    }

    public void setQuickType(String quickType) {
        this.quickType = quickType;
    }

    public String getQuickTypeVal() {
        return quickTypeVal;
    }

    public void setQuickTypeVal(String quickTypeVal) {
        this.quickTypeVal = quickTypeVal;
    }

    @Override
    public String toString() {
        return "QuickDetailVO{" +
                "picName='" + picName + '\'' +
                ", title='" + title + '\'' +
                ", quickType='" + quickType + '\'' +
                ", quickTypeVal='" + quickTypeVal + '\'' +
                '}';
    }
}
