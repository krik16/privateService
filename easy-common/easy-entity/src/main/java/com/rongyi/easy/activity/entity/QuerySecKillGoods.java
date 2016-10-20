package com.rongyi.easy.activity.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/9/21.
 */
public class QuerySecKillGoods implements Serializable {

    private Integer activityId;//活动id
    private String goodsId;//商品id
    private String name;//商品名称
    private String shopName;//店铺名称
    private Integer currentPage = 1;
    private Integer pageSize = 10;
    private Integer status;
    private String goodsCode;


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("name", name)
                .append("shopName", shopName)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("status", status)
                .append("goodsCode", goodsCode)
                .toString();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
