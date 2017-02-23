package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xuying on 2017/1/19.
 */
public class WechatCommodityParam implements Serializable{

    private String shopMid;

    private Integer customCategoryId;

    private Integer currentPage;

    private Integer pageSize;

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public Integer getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(Integer customCategoryId) {
        this.customCategoryId = customCategoryId;
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

    @Override
    public String toString() {
        return "WechatCommodityParam{" +
                "customCategoryId=" + customCategoryId +
                ", shopMid=" + shopMid +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
