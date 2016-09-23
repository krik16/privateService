package com.rongyi.easy.activitymanage.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

/**
 * Created by Leon on 2016/2/11.
 */
public class ActivityGoodsParam extends PagingParam {

    /**
     * PK
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * shop
     */
    private String shopId;

    /**
     * 状态
     */
    private Integer status;

    private List<Integer> ids;

    private String orderByClause = "create_at desc";

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("status", status)
                .append("ids", ids)
                .append("shopId", shopId)
                .append("orderByClause", orderByClause)
                .toString();
    }
}
