package com.rongyi.easy.solr.param;

import java.io.Serializable;

/**
 * Created by xgq on 2015/10/30.
 */
public class CommodityBrandSearchParam implements Serializable {
    private String categoryId;
    private Integer currentPage; //当前页数,从1开始
    private Integer pageSize;//每页显示数

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
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
}
