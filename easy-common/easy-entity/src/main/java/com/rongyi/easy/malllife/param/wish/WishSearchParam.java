package com.rongyi.easy.malllife.param.wish;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangyang on 2016/8/25.
 */
public class WishSearchParam implements Serializable {

    private Integer id;
    private String response;

    private String goodsName;//商品名称
    private String brandName;//品牌名称
    private Date endTime;//截至结束时间
    private String phone;//电话
    private Date startTime;//截至开始时间
    private Integer status;//0全部1回复2未回复
    private Integer pageSize;//
    private Integer currentPage;//
    private String userId;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("response", response)
                .append("goodsName", goodsName)
                .append("endTime", endTime)
                .append("phone", phone)
                .append("startTime", startTime)
                .append("status", status)
                .append("pageSize", pageSize)
                .append("currentPage", currentPage)
                .append("userId", userId)
                .toString();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
