package com.rongyi.easy.notice.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class MSNoticeParam implements Serializable {

    private String shopId;
    /**
     * 状态：1：审核中(包括待审核和审核未通过)；2：发布中(审核通过且发布时间未过期)；3：已过期(审核通过且发布时间过期)；
     */
    private Integer status;

    /**
     * 默认为第一页
     */
    private Integer currentPage;

    /**
     * 默认页数为10
     */
    private Integer pageSize;

    public MSNoticeParam() {
    }

    public MSNoticeParam(String shopId, Integer status, Integer currentPage, Integer pageSize) {
        this.shopId = shopId;
        this.status = status;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPageSize() {
        return pageSize == null ? 10 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("shopId", shopId).append("status", status).append("currentPage", currentPage).append("pageSize", pageSize).toString();
    }

    public Integer getCurrentPage() {
        return currentPage == null ? 1 : currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
