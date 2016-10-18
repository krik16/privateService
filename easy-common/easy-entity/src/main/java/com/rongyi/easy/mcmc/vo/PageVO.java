package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2016/10/18.
 */
public class PageVO implements Serializable {

    private Integer totalPage;
    private Integer pageSize;
    private Integer currentPage;
    private Integer nextFrom;
    private Integer totalCount;

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getNextFrom() {
        return nextFrom;
    }

    public void setNextFrom(Integer nextFrom) {
        this.nextFrom = nextFrom;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "PageVO{" +
                "totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", nextFrom=" + nextFrom +
                ", totalCount=" + totalCount +
                '}';
    }
}
