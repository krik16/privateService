package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * 秒杀的商品
 * User:lijing
 * DATE : 2016/2/19
 * TIME : 14:20
 * ideaworkspace.
 */
public class SeckillCommodityVO implements Serializable {
    /**
     * 商品或者卡券Id
     *
     */
    private String couponId;

    private Integer type;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 当前价格
     */
    private String currentPrice;
    /**
     * 原来价格
     */
    private String originalPrice;
    /**
     * 商品库存
     */
    private Integer stockCount;
    /**
     * 店铺的名称
     */
    private String shopName;
    /**
     * 图片
     */
    private String pic;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("couponId", couponId)
                .append("type", type)
                .append("name", name)
                .append("currentPrice", currentPrice)
                .append("originalPrice", originalPrice)
                .append("stockCount", stockCount)
                .append("shopName", shopName)
                .append("pic", pic)
                .toString();
    }
}
