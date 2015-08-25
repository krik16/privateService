package com.rongyi.easy.page;

import com.rongyi.core.constant.Constants;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Descriptions:通用查询参数
 * Created by 袁波
 * Created at 2015/7/21 17:19.
 */
public class QueryParam implements Serializable{
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
     * 查询的表集合
     */
    private List<Form> fromList;
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

    public QueryParam(List<QueryFilter> queryFilters, List<QueryOrder> queryOrders) {
        this.queryFilters = queryFilters;
        this.queryOrders = queryOrders;
    }
    public QueryParam(List<QueryFilter> queryFilters) {
        this.queryFilters = queryFilters;
        List<QueryOrder> queryOrders=new ArrayList<>();
        queryOrders.add(new QueryOrder("-create_at"));
        this.queryOrders = queryOrders;
    }

    public QueryParam(List<QueryFilter> queryFilters, List<QueryOrder> queryOrders, int currentPage) {
        this.queryFilters = queryFilters;
        this.queryOrders = queryOrders;
        this.currentPage = currentPage;
    }

    public QueryParam(List<QueryFilter> queryFilters, List<QueryOrder> queryOrders, int currentPage, int pageSize) {
        this.queryFilters = queryFilters;
        this.queryOrders = queryOrders;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }
    public QueryParam(List<QueryFilter> queryFilters, List<QueryOrder> queryOrders, List<Form> fromList) {

        this.queryFilters = queryFilters;
        this.queryOrders = queryOrders;
        this.fromList = fromList;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
            "pageSize=" + this.getPageSize() +
            ", offset=" + this.getOffset() +
            ", queryOrders=" + queryOrders +
            ", currentPage=" + this.getCurrentPage() +
            ", queryFilters=" + queryFilters +
            '}';
    }

    public QueryParam() {
    }

    public List<Form> getFromList() {
        return fromList;
    }

    public void setFromList(List<Form> fromList) {
        this.fromList = fromList;
    }
}
