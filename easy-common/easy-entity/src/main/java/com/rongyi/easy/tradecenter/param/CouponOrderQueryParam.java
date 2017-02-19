package com.rongyi.easy.tradecenter.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class CouponOrderQueryParam implements Serializable
{
	private static final long serialVersionUID = 1L;
	String orderStatus;//订单状态    0：待付款、1：已完成、2：已取消(下单减库存订单超时）、3：已删除
    String createOrderBegin;//订单创建开始时间
    String createOrderEnd;//订单创建结束时间
    String orderNo;//订单编码
    String couponId;//卡券Id
    String couponName;//卡券名称
    String buyerAccount;//用户账户
    String currentPage;//当前页
    String sizePerPage;//每页数量
    String couponStatus;//卡券状态
    Integer orderSource;//购买终端 0微商城（商家微商城），1容易逛(包括容易逛app、容易逛微商城、容易逛小程序)，2为终端机，3其他

    private List<String> totalCouponIds;
    private List<String> couponIds;

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

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public List<String> getTotalCouponIds() {
        return totalCouponIds;
    }

    public void setTotalCouponIds(List<String> totalCouponIds) {
        this.totalCouponIds = totalCouponIds;
    }

    public List<String> getCouponIds() {
        return couponIds;
    }

    public void setCouponIds(List<String> couponIds) {
        this.couponIds = couponIds;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
