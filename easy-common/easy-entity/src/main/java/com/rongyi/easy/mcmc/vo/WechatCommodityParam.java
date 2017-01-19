package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xuying on 2017/1/19.
 */
public class WechatCommodityParam implements Serializable{

    private String shopMid;

    private Integer customCategoryId;

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public Integer getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(Integer customCategoryId) {
        this.customCategoryId = customCategoryId;
    }

    @Override
    public String toString() {
        return "WechatCommodityParam{" +
                "customCategoryId=" + customCategoryId +
                ", customCategoryName=" + shopMid +
                '}';
    }
}
