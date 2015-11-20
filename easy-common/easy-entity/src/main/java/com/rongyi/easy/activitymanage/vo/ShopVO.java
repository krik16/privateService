package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/11/2013:53
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class ShopVO implements Serializable {
    private String shopId;
    private String shopName;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("shopId", shopId)
                .append("shopName", shopName)
                .toString();
    }
}
