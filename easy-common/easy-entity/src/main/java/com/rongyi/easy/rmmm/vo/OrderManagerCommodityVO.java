package com.rongyi.easy.rmmm.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author chenjun
 * @date 2017/2/7 17:38
 */
public class OrderManagerCommodityVO  implements Serializable {

    private String commodityName;//商品名
    private String commodityNo;//商品编码
    private String commoditySpec;//商品规格，多个以”,”分隔
    private String commodityCategory;//商品分类
    private String commodityNum;//商品数量
    private String unitPrice;//商品单价 元
    private String id;//商品id
    private String mallName;
    private String shopName;
    private String orderCartNo;//母订单号
    private String orderNo;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo;
    }

    public String getCommoditySpec() {
        return commoditySpec;
    }

    public void setCommoditySpec(String commoditySpec) {
        this.commoditySpec = commoditySpec;
    }

    public String getCommodityCategory() {
        return commodityCategory;
    }

    public void setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
    }

    public String getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(String commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOrderCartNo() {
        return orderCartNo;
    }

    public void setOrderCartNo(String orderCartNo) {
        this.orderCartNo = orderCartNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
