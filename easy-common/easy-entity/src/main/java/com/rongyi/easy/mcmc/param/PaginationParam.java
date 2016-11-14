package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 *  分页参数
 *
 * @author yaoyiwei
 * @date 2016-11-14
 * @version 1.0
 *
 */
public class PaginationParam implements Serializable {

    private Integer currentPage = 1;
    private Integer pageSize = 20;

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
        return "PaginationParam{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
