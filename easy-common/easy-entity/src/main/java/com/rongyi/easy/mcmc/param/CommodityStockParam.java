package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2017/3/10.
 */
public class CommodityStockParam implements Serializable {

    private String commodityId;
    private Integer stock;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "CommodityStockParam{" +
                "commodityId='" + commodityId + '\'' +
                ", stock=" + stock +
                '}';
    }
}
