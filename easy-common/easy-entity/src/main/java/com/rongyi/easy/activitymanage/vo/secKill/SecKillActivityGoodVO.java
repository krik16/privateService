package com.rongyi.easy.activitymanage.vo.secKill;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author chenjun
 * @date 2017/5/2 11:06
 */
public class SecKillActivityGoodVO implements Serializable{

    private static final long serialVersionUID = 1161397220809932455L;

    private int activityCommodityId;//活动商品主键id
    private int activityCommodityStatus;//2:审核通过，6 商品下线 7活动结束
    private int activityCommodityStock;//剩余库存
    private int activityCommodityTotalStock;//总库存
    private double activityPrice;//总库存
    private double commodityCPriceMax;//商品最高现价
    private double commodityOPriceMax;//商品最高原价
    private String commodityId;//分享描述
    private String commodityName;//分享描述
    private String commodityPic;//商品图片

    public int getActivityCommodityId() {
        return activityCommodityId;
    }

    public void setActivityCommodityId(int activityCommodityId) {
        this.activityCommodityId = activityCommodityId;
    }

    public int getActivityCommodityStatus() {
        return activityCommodityStatus;
    }

    public void setActivityCommodityStatus(int activityCommodityStatus) {
        this.activityCommodityStatus = activityCommodityStatus;
    }

    public int getActivityCommodityStock() {
        return activityCommodityStock;
    }

    public void setActivityCommodityStock(int activityCommodityStock) {
        this.activityCommodityStock = activityCommodityStock;
    }

    public int getActivityCommodityTotalStock() {
        return activityCommodityTotalStock;
    }

    public void setActivityCommodityTotalStock(int activityCommodityTotalStock) {
        this.activityCommodityTotalStock = activityCommodityTotalStock;
    }

    public double getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(double activityPrice) {
        this.activityPrice = activityPrice;
    }

    public double getCommodityCPriceMax() {
        return commodityCPriceMax;
    }

    public void setCommodityCPriceMax(double commodityCPriceMax) {
        this.commodityCPriceMax = commodityCPriceMax;
    }

    public double getCommodityOPriceMax() {
        return commodityOPriceMax;
    }

    public void setCommodityOPriceMax(double commodityOPriceMax) {
        this.commodityOPriceMax = commodityOPriceMax;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityPic() {
        return commodityPic;
    }

    public void setCommodityPic(String commodityPic) {
        this.commodityPic = commodityPic;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
