package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/10/30.
 */
public class CommodityBrandPageBuyerVO implements Serializable {
    private int totalPage;
    private int pageSize;
    private int currentPage;
    private List<CommodityBrandBuyerVO> commodityBrandList;

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<CommodityBrandBuyerVO> getCommodityBrandList() {
        return commodityBrandList;
    }

    public void setCommodityBrandList(List<CommodityBrandBuyerVO> commodityBrandList) {
        this.commodityBrandList = commodityBrandList;
    }
}
