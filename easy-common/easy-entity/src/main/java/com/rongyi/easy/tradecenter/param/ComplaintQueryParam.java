package com.rongyi.easy.tradecenter.param;

import com.rongyi.easy.tradecenter.BaseQueryParam;

import java.util.Date;

/**
 * 申诉查询参数
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class ComplaintQueryParam extends BaseQueryParam {
    private String complaintNo;
    private String orderNo;
    private String refundNo;
    private String commodityName;
    private String shopName;
    private String buyerName;
    private Date startDate;
    private Date endDate;
    // 申诉状态（0：全部:1：申诉中、2：申诉成功:3：申诉失败:4：申诉关闭）
    private Integer status;

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ComplaintQueryParam{" +
                "buyerName='" + buyerName + '\'' +
                ", complaintNo='" + complaintNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", refundNo='" + refundNo + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                "} " + super.toString();
    }
}
