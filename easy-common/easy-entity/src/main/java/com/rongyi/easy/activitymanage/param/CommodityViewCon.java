package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by xuying on 2016/10/20.
 */
public class CommodityViewCon implements Serializable{

    private String commodityId;

    private String commodityName;

    private Integer PV;

    private Integer UV;


    private Integer num;//订单数

    private Integer tradeNum;//成交量

    private BigDecimal tradeAmount;//成交金额

    private Integer chengTuanCount;

    private Integer failChengTuanCount;

    private String stock;

    private List<Integer> activityPrice;

    private String commodityPic;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getPV() {
        return PV;
    }

    public void setPV(Integer PV) {
        this.PV = PV;
    }

    public Integer getUV() {
        return UV;
    }

    public void setUV(Integer UV) {
        this.UV = UV;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(Integer tradeNum) {
        this.tradeNum = tradeNum;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Integer getChengTuanCount() {
        return chengTuanCount;
    }

    public void setChengTuanCount(Integer chengTuanCount) {
        this.chengTuanCount = chengTuanCount;
    }

    public Integer getFailChengTuanCount() {
        return failChengTuanCount;
    }

    public void setFailChengTuanCount(Integer failChengTuanCount) {
        this.failChengTuanCount = failChengTuanCount;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public List<Integer> getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(List<Integer> activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
