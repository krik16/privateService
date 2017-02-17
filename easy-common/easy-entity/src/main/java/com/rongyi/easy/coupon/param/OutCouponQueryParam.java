package com.rongyi.easy.coupon.param;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2017/2/6 16:21
 * Package:com.rongyi.coupon.web.dto
 * Project:message-center
 */
public class OutCouponQueryParam implements Serializable{
    private Integer currentPage;
    private Integer pageSize;
    private String endAt;
    private String id;
    private String name;
    //1：品牌；2：商场；3：店铺
    private Integer relatedType;
    private String startAt;
    //空表示全部，0：待发布；1：进行中；2：已结束；3：已下架
    private Integer status;
    //0:有效数开始时间；1：有效期结束时间
    private Integer dateType;

    private Integer start;

    /**
     * 是否是关联弹框需要的卡券列表；
     */
    private Integer isRelate;

    public Integer getIsRelate() {
        return isRelate;
    }

    public void setIsRelate(Integer isRelate) {
        this.isRelate = isRelate;
    }

    public Integer getStart() {
        return pageSize==null?null:((currentPage-1)*pageSize);
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCurrentPage() {
        return currentPage==null?1:currentPage;
    }

    public Integer getDateType() {
        return dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
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

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OutCouponQueryParam{");
        sb.append("currentPage=").append(currentPage);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", endAt='").append(endAt).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", relatedType=").append(relatedType);
        sb.append(", startAt='").append(startAt).append('\'');
        sb.append(", status=").append(status);
        sb.append(", dateType=").append(dateType);
        sb.append(", start=").append(start);
        sb.append(", isRelate=").append(isRelate);
        sb.append('}');
        return sb.toString();
    }
}
