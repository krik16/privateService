package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/4/6
 * TIME : 10:37
 * ideaworkspace.
 */
public class SaleFlashCommodityVO implements Serializable {
    private Integer id;
    /**
     * 商品id
     */
    private String commodityId;
    /**
     * 商品标题
     */
    private String commodityTitle;
    /**
     * 商品图片
     */
    private String commodityPic;
    /**
     * 商品库存
     */
    private Integer commodityStock;
    /**
     * 店铺id
     */
    private String shopId;
    /**
     * 店铺名称
     */
    private String shopName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityTitle() {
        return commodityTitle;
    }

    public void setCommodityTitle(String commodityTitle) {
        this.commodityTitle = commodityTitle;
    }

    public String getCommodityPic() {
        return commodityPic;
    }

    public void setCommodityPic(String commodityPic) {
        this.commodityPic = commodityPic;
    }

    public Integer getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(Integer commodityStock) {
        this.commodityStock = commodityStock;
    }

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
                .append("id", id)
                .append("commodityId", commodityId)
                .append("commodityTitle", commodityTitle)
                .append("commodityPic", commodityPic)
                .append("commodityStock", commodityStock)
                .append("shopId", shopId)
                .append("shopName", shopName)
                .toString();
    }
}
