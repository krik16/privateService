package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/24
 * TIME : 13:47
 * ideaworkspace.
 */
public class AllShopVO implements Serializable {
    private String shopId;

    private String shopName;

    private String address;

    private String mallId;

    private String mallName;
    /**
     * 判断此店铺是否关联了特卖      0表示没有  1表示关联了
     */
    private Integer isRelateSale = 0;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public Integer getIsRelateSale() {
        return isRelateSale;
    }

    public void setIsRelateSale(Integer isRelateSale) {
        this.isRelateSale = isRelateSale;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("shopId", shopId)
                .append("shopName", shopName)
                .append("address", address)
                .append("mallId", mallId)
                .append("mallName", mallName)
                .append("isRelateSale", isRelateSale)
                .toString();
    }
}
