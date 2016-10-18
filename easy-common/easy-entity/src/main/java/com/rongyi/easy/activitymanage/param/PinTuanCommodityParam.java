package com.rongyi.easy.activitymanage.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuying on 2016/10/17.
 */
public class PinTuanCommodityParam extends MalllifeBaseParam implements Serializable{

    private String commodityCode;

    private String commodityName;

    private String categoryId;

    private Integer startStock;

    private Integer endStock;

    private Date startAt;

    private Date endAt;

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getStartStock() {
        return startStock;
    }

    public void setStartStock(Integer startStock) {
        this.startStock = startStock;
    }

    public Integer getEndStock() {
        return endStock;
    }

    public void setEndStock(Integer endStock) {
        this.endStock = endStock;
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
}
