package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/9/21.
 */
public class SearchSelfGoods implements Serializable {

    private String goodsCat;//商品分类
    private String goodsId;//商品id
    private String goodsName;//商品名称
    private Integer stockEnd;
    private Integer stockStart;
    private Integer currentPage;
    private Integer pageSize;
    private String shopName;
    private Integer activityId;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("goodsCat", goodsCat)
                .append("goodsId", goodsId)
                .append("goodsName", goodsName)
                .append("stockEnd", stockEnd)
                .append("stockStart", stockStart)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("shopName", shopName)
                .append("activityId", activityId)
                .toString();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public String getGoodsCat() {
        return goodsCat;
    }

    public void setGoodsCat(String goodsCat) {
        this.goodsCat = goodsCat;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getStockEnd() {
        return stockEnd;
    }

    public void setStockEnd(Integer stockEnd) {
        this.stockEnd = stockEnd;
    }

    public Integer getStockStart() {
        return stockStart;
    }

    public void setStockStart(Integer stockStart) {
        this.stockStart = stockStart;
    }
}
