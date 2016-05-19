package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class CouponOrderQueryParam implements Serializable
{
	private static final long serialVersionUID = 1L;
	String orderStatus;//订单状态
    String createOrderBegin;//订单创建开始时间
    String createOrderEnd;//订单创建结束时间
    String orderNo;//订单编码
    String couponId;//卡券Id
    String couponName;//卡券名称
    String buyerAccount;//用户账户
    String currentPage;//当前页
    String sizePerPage;//每页数量
    String couponStatus;//卡券状态

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateOrderBegin() {
        return createOrderBegin;
    }

    public void setCreateOrderBegin(String createOrderBegin) {
        this.createOrderBegin = createOrderBegin;
    }

    public String getCreateOrderEnd() {
        return createOrderEnd;
    }

    public void setCreateOrderEnd(String createOrderEnd) {
        this.createOrderEnd = createOrderEnd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getSizePerPage() {
        return sizePerPage;
    }

    public void setSizePerPage(String sizePerPage) {
        this.sizePerPage = sizePerPage;
    }

    public String toString() {
        return "OsmOrderQueryParam=[orderStatus="+orderStatus+",createOrderBegin="+createOrderBegin+",createOrderEnd="+createOrderEnd+"," +
                "orderNo="+orderNo+",couponId="+couponId+",couponName="+couponName+",buyerAccount="+buyerAccount+"," +
                "currentPage="+currentPage+",sizePerPage="+sizePerPage+"]";
    }
}
