package com.rongyi.easy.content_v2.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/5/6.
 */
public class ContentParam implements Serializable{
    private static final Integer CURRENTPAGE = 1;
    private static final Integer PAGESIZE = 10;
    /**for*/
    private String forumCode;
    /**省份id 0代表查询全国的*/
    private String provId;
    /**城市id 0代表查询全国的*/
    private String cityId;
    /**状态 0待发布、1已发布、2已关闭 3代表全部 4已结束*/
    private Integer status;
    /**当前页 默认1*/
    private Integer currentPage = CURRENTPAGE;

    private Integer pageSize = PAGESIZE;

    private Integer offset;

    public Integer getOffset() {
        offset = (this.currentPage -1) * this.pageSize;
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getForumCode() {
        return forumCode;
    }

    public void setForumCode(String forumCode) {
        this.forumCode = forumCode;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("forumCode", forumCode)
                .append("provId", provId)
                .append("cityId", cityId)
                .append("status", status)
                .append("cityId", cityId)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("offset", offset)
                .toString();
    }
}
