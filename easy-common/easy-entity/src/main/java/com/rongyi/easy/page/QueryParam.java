package com.rongyi.easy.page;

import java.util.List;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:19.
 */
public class QueryParam {
    /**
     * 查询的过滤集合
     */
    private List<QueryFilter> queryFilters;
    /**
     * 查询的排序集合
     */
    private List<QueryOrder> queryOrders;
    /**
     * 当前页
     */
    private int currentPage;
    /**
     * 当前页大小
     */
    private int pageSize;

    public List<QueryFilter> getQueryFilters() {
        return queryFilters;
    }

    public void setQueryFilters(List<QueryFilter> queryFilters) {
        this.queryFilters = queryFilters;
    }

    public List<QueryOrder> getQueryOrders() {
        return queryOrders;
    }

    public void setQueryOrders(List<QueryOrder> queryOrders) {
        this.queryOrders = queryOrders;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
