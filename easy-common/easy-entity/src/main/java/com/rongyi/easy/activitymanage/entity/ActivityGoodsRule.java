package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品及卡券类型活动规则
 */
public class ActivityGoodsRule implements Serializable {
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 库存扣除方式:支付减库存[0],下单减库存[1]
     */
    private Integer stockDeductType;

    /**
     * 库存修改方式:只可增不可减[0] 不可增不可减[1] 可增亦可减[2]
     */
    private Integer stockUpdateType;

    /**
     * 运费策略是否包邮:否[0] 是[1]
     */
    private Boolean isShipping;

    /**
     * 活动限购数量,0表示不限制
     */
    private Integer limitCount;

    /**
     * 订单取消时间，超过多少时间订单自动取消
     */
    private Integer cancelTime;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改时间
     */
    private Date updateAt;

    /**
     * 拼单折扣
     */
    private String discount;

    /**
     * 线下折扣
     */
    private String offlineDiscount;

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getOfflineDiscount() {
        return offlineDiscount;
    }

    public void setOfflineDiscount(String offlineDiscount) {
        this.offlineDiscount = offlineDiscount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getStockDeductType() {
        return stockDeductType;
    }

    public void setStockDeductType(Integer stockDeductType) {
        this.stockDeductType = stockDeductType;
    }

    public Integer getStockUpdateType() {
        return stockUpdateType;
    }

    public void setStockUpdateType(Integer stockUpdateType) {
        this.stockUpdateType = stockUpdateType;
    }

    public Boolean getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(Boolean isShipping) {
        this.isShipping = isShipping;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("stockDeductType", stockDeductType)
                .append("stockUpdateType", stockUpdateType)
                .append("isShipping", isShipping)
                .append("limitCount", limitCount)
                .append("cancelTime", cancelTime)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("discount", discount)
                .append("offlineDiscount", offlineDiscount)
                .toString();
    }
}