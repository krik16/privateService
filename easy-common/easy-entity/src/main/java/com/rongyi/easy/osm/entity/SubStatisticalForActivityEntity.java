package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 分统计-活动
 *
 * @author wangjh7
 * @date 2017-05-02
 **/
public class SubStatisticalForActivityEntity implements Serializable {
    // 商品Id
    private String commodityId;
    // 商品规格
    private String getCommoditySpecId;
    // 下单数
    private Integer count;
    // 成交数
    private Integer volume;
    // 成交额
    private Float payAmount;
    // 下单日期
    private Date createDate;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getGetCommoditySpecId() {
        return getCommoditySpecId;
    }

    public void setGetCommoditySpecId(String getCommoditySpecId) {
        this.getCommoditySpecId = getCommoditySpecId;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Float payAmount) {
        this.payAmount = payAmount;
    }

    @Override
    public String toString() {
        return "SubStatisticalForActivityEntity{" +
                "commodityId='" + commodityId + '\'' +
                ", getCommoditySpecId='" + getCommoditySpecId + '\'' +
                ", count=" + count +
                ", volume=" + volume +
                ", payAmount=" + payAmount +
                ", createDate=" + createDate +
                '}';
    }
}
