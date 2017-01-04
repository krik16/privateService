package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2016/11/30.
 */
public class PaginationVO implements Serializable{

    private Integer currentPage;
    private Integer pageSize;
    private Integer totalPage;

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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
