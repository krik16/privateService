package com.rongyi.easy.coupon.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 代金券VO
 * Created by lqy on 2015/11/19.
 */
public class VoucherVO implements Serializable {

    /**
     * 代金券id
     */
    private String voucherId;

    /**
     * 代金券名称
     */
    private String voucherName;

    /**
     * 原价(分)
     */
    private Integer origPrice;

    /**
     * 现价(分)
     */
    private Integer currPrice;

    /**
     * 券码发行量
     */
    private Integer totalCount;

    /**
     * 库存量
     */
    private Integer stockCount;

    /**
     * 销量
     */
    private Integer soldCount;

    /**
     * 图片 取详情图的第一张
     */
    private String picUrl;

    /**
     * 代金券所关联的第一家店铺id
     */
    private String shopId;

    /**
     * 每人限购数量
     */
    private Integer limitCount;

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getVoucherName() {
        return voucherName;
    }

    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public Integer getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Integer currPrice) {
        this.currPrice = currPrice;
    }

    public Integer getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("voucherId", voucherId)
                .append("voucherName", voucherName)
                .append("origPrice", origPrice)
                .append("currPrice", currPrice)
                .append("totalCount", totalCount)
                .append("stockCount", stockCount)
                .append("soldCount", soldCount)
                .append("picUrl", picUrl)
                .append("shopId", shopId)
                .append("limitCount", limitCount)
                .toString();
    }
}
