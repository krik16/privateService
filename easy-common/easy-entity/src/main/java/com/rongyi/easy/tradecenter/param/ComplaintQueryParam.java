package com.rongyi.easy.tradecenter.param;

import com.rongyi.easy.tradecenter.BaseQueryParam;

import java.util.Date;
import java.util.List;

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
    private String chiefId;
    private List<String> buyerIds;
    private List<String> shopIds;
    private List<String> guideIds;

    public List<String> getBuyerIds() {
        return buyerIds;
    }

    public void setBuyerIds(List<String> buyerIds) {
        this.buyerIds = buyerIds;
    }

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

    public String getChiefId() {
        return chiefId;
    }

    public void setChiefId(String chiefId) {
        this.chiefId = chiefId;
    }

    public List<String> getGuideIds() {
        return guideIds;
    }

    public void setGuideIds(List<String> guideIds) {
        this.guideIds = guideIds;
    }

    public List<String> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    @Override
    public String toString() {
        return "ComplaintQueryParam{" +
                "buyerIds=" + buyerIds +
                ", complaintNo='" + complaintNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", refundNo='" + refundNo + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", chiefId='" + chiefId + '\'' +
                ", shopIds=" + shopIds +
                ", guideIds=" + guideIds +
                "} " + super.toString();
    }
}
