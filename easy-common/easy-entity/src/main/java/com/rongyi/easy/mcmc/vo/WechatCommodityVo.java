package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xuying on 2017/1/19.
 */
public class WechatCommodityVo implements Serializable{

    private String commodityId;

    private String commodityName;

    private String cuerrentPrice;

    private String picUrl;


    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCuerrentPrice() {
        return cuerrentPrice;
    }

    public void setCuerrentPrice(String cuerrentPrice) {
        this.cuerrentPrice = cuerrentPrice;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }



    @Override
    public String toString() {
        return "WechatCommodityVo{" +
                "commodityId=" + commodityId +
                ", commodityName=" + commodityName +
                ", cuerrentPrice=" + cuerrentPrice +
                ", picUrl=" + picUrl +
                '}';
    }
}
