package com.rongyi.easy.coupon;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2015/11/28 15:44
 * Package:com.rongyi.easy.coupon
 * Project:easy-market
 */
public class CommoditySpecWebVO implements Serializable {
    private String spec;//规格；
    private String stock;//库存
    private String price; //价格

    public CommoditySpecWebVO() {
    }

    public CommoditySpecWebVO(String spec, String stock, String price) {

        this.spec = spec;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CommoditySpecWebVO{");
        sb.append("spec='").append(spec).append('\'');
        sb.append(", stock=").append(stock);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
