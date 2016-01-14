package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/11/28 16:07
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class SaleCommodityTopVO implements Serializable {
    /**商品id*/
    private String commodityId;
    /**商品图片*/
    private String commodityPic;
    /**商品名称*/
    private String commodityName;
    /**商品库存*/
    private Integer commodityStock;
    /**店铺id*/
    private String shopMid;
    /**排序*/
    private Integer orderPosition;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityPic() {
        return commodityPic;
    }

    public void setCommodityPic(String commodityPic) {
        this.commodityPic = commodityPic;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(Integer commodityStock) {
        this.commodityStock = commodityStock;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public Integer getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(Integer orderPosition) {
        this.orderPosition = orderPosition;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("commodityId", commodityId)
                .append("commodityPic", commodityPic)
                .append("commodityName", commodityName)
                .append("commodityStock", commodityStock)
                .append("shopMid", shopMid)
                .append("orderPosition", orderPosition)
                .toString();
    }
}
