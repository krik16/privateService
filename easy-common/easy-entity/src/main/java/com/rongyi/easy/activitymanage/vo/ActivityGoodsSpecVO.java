package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by Leon on 2016/2/12.
 */
public class ActivityGoodsSpecVO implements Serializable {

    /**
     * 规格id
     */
    private String specId;

    /**
     * 商品现有库存
     */
    private Integer currCount;

    /**
     * 参与库存
     */
    private Integer joinCount;

    /**
     * 活动商品剩余库存
     */
    private Integer stockCount;

    /**
     * 商品现价
     */
    private String currPrice;

    /**
     * 活动价
     */
    private String activityPrice;

    /**
     * 商品规格信息，例如大小、尺码、颜色
     */
    private String specInfo;

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public Integer getCurrCount() {
        return currCount;
    }

    public void setCurrCount(Integer currCount) {
        this.currCount = currCount;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(String currPrice) {
        this.currPrice = currPrice;
    }

    public String getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getSpecInfo() {
        return specInfo;
    }

    public void setSpecInfo(String specInfo) {
        this.specInfo = specInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("specId", specId)
                .append("currCount", currCount)
                .append("joinCount", joinCount)
                .append("stockCount", stockCount)
                .append("currPrice", currPrice)
                .append("activityPrice", activityPrice)
                .append("specInfo", specInfo)
                .toString();
    }
}
