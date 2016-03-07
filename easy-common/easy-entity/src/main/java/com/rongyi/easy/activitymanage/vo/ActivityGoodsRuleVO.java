package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 卡券及商品类型活动规则VO
 * Created by Leon on 2016/1/28.
 */
public class ActivityGoodsRuleVO implements Serializable {

    /**
     * PK
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 库存扣除方式:下单减库存[0],支付减库存[1]
     */
    private Integer stockDeductType;

    /**
     * 库存修改方式:只可增不可减[0] 不可增不可减[1]
     */
    private Integer stockUpdateType;

    /**
     * 运费策略是否包邮:否[false] 是[true]
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
                .toString();
    }
}
