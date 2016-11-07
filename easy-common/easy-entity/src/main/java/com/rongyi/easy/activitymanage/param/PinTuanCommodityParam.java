package com.rongyi.easy.activitymanage.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

    private String activityId;

    private String mallId;

    private List<ObjectId> commodityIds;

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

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public List<ObjectId> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<ObjectId> commodityIds) {
        this.commodityIds = commodityIds;
    }

    @Override
    public String toString() {
        return "PinTuanCommodityParam{" +
                "commodityCode='" + commodityCode + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", startStock=" + startStock +
                ", endStock=" + endStock +
                ", startAt=" + startAt +
                ", endAt=" + endAt +
                ", mallId=" + mallId +
                ", activityId='" + activityId + '\'' +
                '}';
    }
}
