package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2017/1/19.
 */
public class WechatCommodityParam implements Serializable{

    private String shopMid;

    private String customCategoryId;

    private String serviceId;

    private Integer currentPage;

    private Integer pageSize;

    private List<String>  totalCommodityIds;


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(String customCategoryId) {
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

    public List<String> getTotalCommodityIds() {
        return totalCommodityIds;
    }

    public void setTotalCommodityIds(List<String> totalCommodityIds) {
        this.totalCommodityIds = totalCommodityIds;
    }

    @Override
    public String toString() {
        return "WechatCommodityParam{" +
                "customCategoryId=" + customCategoryId +
                ", shopMid=" + shopMid +
                ", serviceId=" + serviceId +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
