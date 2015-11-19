package com.rongyi.easy.coupon.vo;

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
     * 原价
     */
    private Double origPrice;

    /**
     * 现价
     */
    private Double currPrice;

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

    public Double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Double origPrice) {
        this.origPrice = origPrice;
    }

    public Double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Double currPrice) {
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

}
