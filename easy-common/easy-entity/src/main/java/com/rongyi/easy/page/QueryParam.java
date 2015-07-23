package com.rongyi.easy.page;

import com.rongyi.core.constant.Constants;

import java.util.List;

/**
 * Descriptions:通用查询参数
 * Created by 袁波
 * Created at 2015/7/21 17:19.
 */
public class QueryParam {
    private static final int PAGESIZE=10;
    private static final int CURRENTPAGE=1;
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

    /**
     * 开始查询记录 对应 (limit 0,10)中的 0
     */
    private int offset;

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
        if(currentPage==0){
            currentPage=CURRENTPAGE;
        }
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        if(pageSize==0){
            pageSize=PAGESIZE;
        }
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return  (this.getCurrentPage()-1)*this.getPageSize();
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
