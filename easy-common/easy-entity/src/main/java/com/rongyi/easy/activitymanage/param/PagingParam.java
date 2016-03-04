package com.rongyi.easy.activitymanage.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.param easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/25
 * TIME : 14:18
 * easy-api.
 */
public class PagingParam implements Serializable {
    /**当前页 从1 开始*/
    private Integer currentPage;
    /**每页数量   */
    private Integer pageSize;

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

    public Integer getOffset() {
        if (currentPage == null || currentPage < 1 || pageSize == null || pageSize < 1) {
            return null;
        }
        return  (currentPage -1) * pageSize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .toString();
    }
}
