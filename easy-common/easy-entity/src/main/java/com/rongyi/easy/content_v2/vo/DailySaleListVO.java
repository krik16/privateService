package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lijing on 2015/12/26 15:46
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class DailySaleListVO implements Serializable {
    /**类型*/
    private Integer type;
    /**类型值*/
    private String typeVal;
    /**
     * 每日秒杀的标签 如果是今天限时时间 如果是明天显示未开始
     */
    private String label;
    /**名称*/
    private String title;
    /**原价*/
    private String origPrice;
    /**现价*/
    private String currPrice;
    /**开始时间*/
    private Date publishBeginAt;
    /**结束时间*/
    private Date publishEndAt;
    /**图片*/
    private String dailyPic;
    /**库存量*/
    private Integer stockCount;

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(String origPrice) {
        this.origPrice = origPrice;
    }

    public String getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(String currPrice) {
        this.currPrice = currPrice;
    }

    public Long getPublishBeginAt() {
        return this.publishBeginAt != null ? this.publishBeginAt.getTime() : 0L;
    }

    public void setPublishBeginAt(Date publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public Long getPublishEndAt() {
        return this.publishEndAt != null ? this.publishEndAt.getTime() : 0L;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public String getDailyPic() {
        return dailyPic;
    }

    public void setDailyPic(String dailyPic) {
        this.dailyPic = dailyPic;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("label", label)
                .append("title", title)
                .append("origPrice", origPrice)
                .append("currPrice", currPrice)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .append("dailyPic", dailyPic)
                .append("stockCount", stockCount)
                .toString();
    }
}
