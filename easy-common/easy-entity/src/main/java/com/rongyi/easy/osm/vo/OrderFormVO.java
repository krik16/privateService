package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.OrderFormEntity;

import java.io.Serializable;

/**
 * Created by hebo on 2015/12/31.
 * 中订单VO
 */
public class OrderFormVO extends OrderFormEntity implements Serializable{

    private String orderCartNo;//购物车订单号
    /**
     * 商品编码
     */
    private String commodityMid;
    /**
     * 购买数量
     */
    private Integer quantity;
    /**
     * 商品规格id
     */
    private String commoditySpecMid;

    private Double unitPrice;

    public String getOrderCartNo() {
        return orderCartNo;
    }

    public void setOrderCartNo(String orderCartNo) {
        this.orderCartNo = orderCartNo;
    }

    public String getCommodityMid() {
        return commodityMid;
    }

    public void setCommodityMid(String commodityMid) {
        this.commodityMid = commodityMid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCommoditySpecMid() {
        return commoditySpecMid;
    }

    public void setCommoditySpecMid(String commoditySpecMid) {
        this.commoditySpecMid = commoditySpecMid;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
