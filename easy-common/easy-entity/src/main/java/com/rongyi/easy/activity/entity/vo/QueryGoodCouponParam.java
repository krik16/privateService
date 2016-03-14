package com.rongyi.easy.activity.entity.vo;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activity.entity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/16
 * TIME : 10:48
 * ideaworkspace.
 */
public class QueryGoodCouponParam implements Serializable {
    private static final Integer CURRENTPAGE = 1;
    private static final Integer PAGESIZE = 10;
    private static final String ORDER_BY_CLAUSE = "create_at DESC";
    /**
     * 卡券或者商品id
     */
    private String goodsId;
    /**
     * 商品类型  0 红包  1 是代金券 2是抵扣券 3是商品
     */
    private Integer type;

    /**
     * 名称
     */
    private String name;
    /**
     * 活动规则id
     */
    private Integer activityRuleId;
    /**
     * 当前页 从1 开始
     */
    private Integer currentPage = CURRENTPAGE;
    /**
     * 分页数
     */
    private Integer pageSize= PAGESIZE;

    /**
     * 当前页
     */
    private Integer offset;

    /**
     * 排序字段
     */
    private String orderByClause = ORDER_BY_CLAUSE;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActivityRuleId() {
        return activityRuleId;
    }

    public void setActivityRuleId(Integer activityRuleId) {
        this.activityRuleId = activityRuleId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        offset = (this.currentPage -1) * this.pageSize;
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "QueryGoodCouponParam{" +
                "goodsId='" + goodsId + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", activityRuleId=" + activityRuleId +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", offset=" + offset +
                ", orderByClause='" + orderByClause + '\'' +
                '}';
    }
}
