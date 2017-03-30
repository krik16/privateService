package com.rongyi.easy.rpb.param;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/29.
 */
public class PaymentOrderParam implements Serializable {
    private String orderNo;//订单编号
    private Integer payChannel;//支付方式
    private String startTime;//支付开始时间
    private String endTime;//支付结束时间
    private String ryMchId;//容易商户号
    private Integer currentPage;//当前页
    private Integer pageSize;//每页记录数
    private Integer startIndex;//

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRyMchId() {
        return ryMchId;
    }

    public void setRyMchId(String ryMchId) {
        this.ryMchId = ryMchId;
    }

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

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = (this.currentPage-1)* this.pageSize;
    }
}
