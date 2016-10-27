package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2016/10/27.
 */
public class ViewControllerUpVo implements Serializable{

    private  String name;
    /**
     * 活动开始时间
     */
    private Date startAt;

    /**
     * 活动结束时间
     */
    private Date endAt;

    private  Integer activityTotalCount;

    private Integer totalPV;

    private Integer totalUV;


    private Integer totalNum;//订单数

    private Integer totaltradeNum;//成交量

    private BigDecimal totalTradeAmount;//成交金额

    private Integer totalchengTuanCount;

    private Integer totalFailChengTuanCount;

    private List<CommodityViewCon> commodityViewConList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getActivityTotalCount() {
        return activityTotalCount;
    }

    public void setActivityTotalCount(Integer activityTotalCount) {
        this.activityTotalCount = activityTotalCount;
    }

    public Integer getTotalPV() {
        return totalPV;
    }

    public void setTotalPV(Integer totalPV) {
        this.totalPV = totalPV;
    }

    public Integer getTotalUV() {
        return totalUV;
    }

    public void setTotalUV(Integer totalUV) {
        this.totalUV = totalUV;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotaltradeNum() {
        return totaltradeNum;
    }

    public void setTotaltradeNum(Integer totaltradeNum) {
        this.totaltradeNum = totaltradeNum;
    }

    public BigDecimal getTotalTradeAmount() {
        return totalTradeAmount;
    }

    public void setTotalTradeAmount(BigDecimal totalTradeAmount) {
        this.totalTradeAmount = totalTradeAmount;
    }

    public Integer getTotalchengTuanCount() {
        return totalchengTuanCount;
    }

    public void setTotalchengTuanCount(Integer totalchengTuanCount) {
        this.totalchengTuanCount = totalchengTuanCount;
    }

    public Integer getTotalFailChengTuanCount() {
        return totalFailChengTuanCount;
    }

    public void setTotalFailChengTuanCount(Integer totalFailChengTuanCount) {
        this.totalFailChengTuanCount = totalFailChengTuanCount;
    }

    public List<CommodityViewCon> getCommodityViewConList() {
        return commodityViewConList;
    }

    public void setCommodityViewConList(List<CommodityViewCon> commodityViewConList) {
        this.commodityViewConList = commodityViewConList;
    }
}
