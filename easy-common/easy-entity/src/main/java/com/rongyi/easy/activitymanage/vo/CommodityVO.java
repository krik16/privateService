package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/11/22 22:41
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class CommodityVO implements Serializable {
    private String commodityId;
    private String pic;
    /**商品的现标题*/
    private String title;
    private String currentTitle;
    private Integer orderPosition;
    private Integer stockCount;
    private Integer rySubsidy;
    private Integer activityPrice;



    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrentTitle() {
        return currentTitle;
    }

    public void setCurrentTitle(String currentTitle) {
        this.currentTitle = currentTitle;
    }

    public Integer getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(Integer orderPosition) {
        this.orderPosition = orderPosition;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getRySubsidy() {
        return rySubsidy;
    }

    public void setRySubsidy(Integer rySubsidy) {
        this.rySubsidy = rySubsidy;
    }

    public Integer getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Integer activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("commodityId", commodityId)
                .append("pic", pic)
                .append("title", title)
                .append("currentTitle", currentTitle)
                .append("orderPosition", orderPosition)
                .append("stockCount", stockCount)
                .append("rySubsidy", rySubsidy)
                .append("activityPrice", activityPrice)
                .toString();
    }
}
