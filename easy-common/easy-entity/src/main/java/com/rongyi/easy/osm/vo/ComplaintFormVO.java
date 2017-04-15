package com.rongyi.easy.osm.vo;

import java.io.Serializable;

/**
 * 申诉列表
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class ComplaintFormVO implements Serializable {
    // 买家名称
    private String buyerName;
    // 买家手机号码
    private String buyerPhone;
    // 商品id
    private String commodityId;
    // 商品规格id
    private String commoditySpecId;
    // 商品名称
    private String commodityName;
    // 申诉单号
    private String complaintNo;
    // 订单号
    private String orderNo;
    // 退款单号
    private String refundNo;
    // 退款金额（单位：元）
    private String refundAmount;
    private String remark;
    private String imageUrl;
    // 卖家店铺id
    private String shopId;
    // 卖家店铺名称
    private String shopName;
    // 申诉时间
    private String createDate;
    // 处理人
    private String resultBy;
    // 处理结果，原因
    private String resultRemark;
    // 卖家处理状态：2：申诉成功、3：申诉失败
    private int resultStatus;
    // 买家申诉状态：1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭
    private int status;

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommoditySpecId() {
        return commoditySpecId;
    }

    public void setCommoditySpecId(String commoditySpecId) {
        this.commoditySpecId = commoditySpecId;
    }

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResultBy() {
        return resultBy;
    }

    public void setResultBy(String resultBy) {
        this.resultBy = resultBy;
    }

    public String getResultRemark() {
        return resultRemark;
    }

    public void setResultRemark(String resultRemark) {
        this.resultRemark = resultRemark;
    }

    public int getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(int resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "ComplaintFormVO{" +
                "buyerName='" + buyerName + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", commodityId='" + commodityId + '\'' +
                ", commoditySpecId='" + commoditySpecId + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", complaintNo='" + complaintNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", refundNo='" + refundNo + '\'' +
                ", refundAmount='" + refundAmount + '\'' +
                ", remark='" + remark + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", shopId='" + shopId + '\'' +
                ", shopName='" + shopName + '\'' +
                ", createDate='" + createDate + '\'' +
                ", resultBy='" + resultBy + '\'' +
                ", resultRemark='" + resultRemark + '\'' +
                ", resultStatus=" + resultStatus +
                ", status=" + status +
                '}';
    }
}
