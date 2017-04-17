package com.rongyi.easy.osm.vo;

import java.io.Serializable;

/**
 * 退款列表
 *
 * @author wangjh7
 * @date 2017-04-15
 **/
public class RefundFormVO implements Serializable {
    private Integer id;
    // 买家名称
    private String buyerName;
    // 买家手机号码
    private String buyerPhone;
    // 商品id
    private String commodityId;
    // 商品规格id
    private String commoditySpecId;
    // 商品规格名称
    private String commoditySpecName;
    // 商品名称
    private String commodityName;
    // 商品图片
    private String commodityImage;
    // 商品编码
    private String commoditySn;
    // 申诉单号
    private String complaintNo;
    // 订单号
    private String orderNo;
    // 退款单号
    private String refundNo;
    // 退款金额（单位：元）
    private String refundAmount;
    // 卖家店铺名称
    private String shopName;
    // 店铺Id
    private String weidianId;
    // 时间
    private String createDate;
    /**
     * 退款状态（0：申请退款 1：退款中 2：拒绝退款 3：已退款 4：待买家发货 5：待卖家收货 6：退款关闭）
     */
    private Integer status;
    /**
     * 退款类型：0：全部 1：仅退款，2：快递退货退款，3：到店退货退款
     */
    private Integer refundTypeId;
    /**
     * 申诉状态（0：全部:1：申诉中、2：申诉成功:3：申诉失败:4：申诉关闭）
     */
    private Integer complaintStatus;
    // 退款原因、关闭原因
    private String remark;

    // 换回字段
    private Integer orderEventId;
    // 申请退款原因ID
    private Integer refundReasonId;

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

    public String getCommoditySn() {
        return commoditySn;
    }

    public void setCommoditySn(String commoditySn) {
        this.commoditySn = commoditySn;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
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

    public String getCommoditySpecName() {
        return commoditySpecName;
    }

    public void setCommoditySpecName(String commoditySpecName) {
        this.commoditySpecName = commoditySpecName;
    }

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    public Integer getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(Integer complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderEventId() {
        return orderEventId;
    }

    public void setOrderEventId(Integer orderEventId) {
        this.orderEventId = orderEventId;
    }

    public Integer getRefundReasonId() {
        return refundReasonId;
    }

    public void setRefundReasonId(Integer refundReasonId) {
        this.refundReasonId = refundReasonId;
    }

    public String getWeidianId() {
        return weidianId;
    }

    public void setWeidianId(String weidianId) {
        this.weidianId = weidianId;
    }

    public Integer getRefundTypeId() {
        return refundTypeId;
    }

    public void setRefundTypeId(Integer refundTypeId) {
        this.refundTypeId = refundTypeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RefundFormVO{" +
                "buyerName='" + buyerName + '\'' +
                ", id=" + id +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", commodityId='" + commodityId + '\'' +
                ", commoditySpecId='" + commoditySpecId + '\'' +
                ", commoditySpecName='" + commoditySpecName + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", commodityImage='" + commodityImage + '\'' +
                ", commoditySn='" + commoditySn + '\'' +
                ", complaintNo='" + complaintNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", refundNo='" + refundNo + '\'' +
                ", refundAmount='" + refundAmount + '\'' +
                ", shopName='" + shopName + '\'' +
                ", weidianId='" + weidianId + '\'' +
                ", createDate='" + createDate + '\'' +
                ", status=" + status +
                ", refundTypeId=" + refundTypeId +
                ", complaintStatus=" + complaintStatus +
                ", remark='" + remark + '\'' +
                ", orderEventId=" + orderEventId +
                ", refundReasonId=" + refundReasonId +
                '}';
    }
}
