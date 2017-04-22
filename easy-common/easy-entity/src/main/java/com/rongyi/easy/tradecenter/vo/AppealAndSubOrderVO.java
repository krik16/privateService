package com.rongyi.easy.tradecenter.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author chenjun
 * @date 2017/4/10 20:05
 */
public class AppealAndSubOrderVO implements Serializable{
    private static final long serialVersionUID = -2292061569560215295L;

    private String shopId;// 店铺mysqlId
    private Integer refundStatus;// 退款状态 0：申请退款 1：退款中 2：拒绝退款 3：已退款 4：待买家发货 5：带卖家收货 6：退款关闭
    private Integer complaintStatus;// 维权状态 1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭
    private Integer refundType;// 退款类型 1：仅退款'，3：快递退货退款'，7：到店退货退款'
    private String refundNo;// 退款单号
    private String complaintNo;// 维权单号
    private BigDecimal refundAmount;// 退款金额
    private BigDecimal refundExpressAmount;// 退款邮费金额
    private Date nextStatusTime;//下一状态时间
    private String refundExpressInfoId;// 退款物流信息主键id
    private String orderNo;// 订单号
    private String orderItemNo;// 子订单号
    private String merchantReceiveName;// 商家收货人姓名
    private String merchantReceivePhone;// 商家收货人电话
    private String merchantReceiveAddress;// 商家收货人地址
    private String orderRefundConfig;// 订单退款快照
    private Date createAt;//申请时间
    private String pics;//图片列表（以";"隔开）
    private String num;// 下单数量
    private String commodityName;// 我是商品名称
    private String commodityId;// 我是商品编号
    private String commoditySpecId;// 我是商品规格id
    private String commodityCurrentPrice;// 我是商品现价

    private String orderStatus;// 订单状态
    private Date orderNextStatusTime;//订单下一状态时间
    private Integer isRefunded;//已成功退款  0否 1是
    private Integer isRefund;  // 是否可以退款，0：不可退款 1：可退款
    private Integer activityType;//商品活动 0：普通、1：闪购、2：特卖、3：秒杀、4：拼团、5：超级团教育版、6：断码好货、8：注册福利
    private Integer activityStatus;//活动状态
    private Integer refundTimes;//退款已申请次数
    private Integer appealTimes;//维权已申请次数已申请次数
    private String orderItemstatus;//子订单状态 0同父订单状态 1待退款 2已关闭 3维权中
    private String buyerPhone;//买家手机号
    private String buyerId;//买家id
    private String appealComment;// 退款说明
    private int isFreeze;// 是否冻结 0：正常流程 1：冻结流程

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(Integer complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getRefundExpressAmount() {
        return refundExpressAmount;
    }

    public void setRefundExpressAmount(BigDecimal refundExpressAmount) {
        this.refundExpressAmount = refundExpressAmount;
    }

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public String getRefundExpressInfoId() {
        return refundExpressInfoId;
    }

    public void setRefundExpressInfoId(String refundExpressInfoId) {
        this.refundExpressInfoId = refundExpressInfoId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderItemNo() {
        return orderItemNo;
    }

    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo;
    }

    public String getMerchantReceiveName() {
        return merchantReceiveName;
    }

    public void setMerchantReceiveName(String merchantReceiveName) {
        this.merchantReceiveName = merchantReceiveName;
    }

    public String getMerchantReceivePhone() {
        return merchantReceivePhone;
    }

    public void setMerchantReceivePhone(String merchantReceivePhone) {
        this.merchantReceivePhone = merchantReceivePhone;
    }

    public String getMerchantReceiveAddress() {
        return merchantReceiveAddress;
    }

    public void setMerchantReceiveAddress(String merchantReceiveAddress) {
        this.merchantReceiveAddress = merchantReceiveAddress;
    }

    public String getOrderRefundConfig() {
        return orderRefundConfig;
    }

    public void setOrderRefundConfig(String orderRefundConfig) {
        this.orderRefundConfig = orderRefundConfig;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommoditySpecId() {
        return commoditySpecId;
    }

    public void setCommoditySpecId(String commoditySpecId) {
        this.commoditySpecId = commoditySpecId;
    }

    public String getCommodityCurrentPrice() {
        return commodityCurrentPrice;
    }

    public void setCommodityCurrentPrice(String commodityCurrentPrice) {
        this.commodityCurrentPrice = commodityCurrentPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderNextStatusTime() {
        return orderNextStatusTime;
    }

    public void setOrderNextStatusTime(Date orderNextStatusTime) {
        this.orderNextStatusTime = orderNextStatusTime;
    }

    public Integer getIsRefunded() {
        return isRefunded;
    }

    public void setIsRefunded(Integer isRefunded) {
        this.isRefunded = isRefunded;
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getRefundTimes() {
        return refundTimes;
    }

    public void setRefundTimes(Integer refundTimes) {
        this.refundTimes = refundTimes;
    }

    public String getOrderItemstatus() {
        return orderItemstatus;
    }

    public void setOrderItemstatus(String orderItemstatus) {
        this.orderItemstatus = orderItemstatus;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Integer getAppealTimes() {
        return appealTimes;
    }

    public void setAppealTimes(Integer appealTimes) {
        this.appealTimes = appealTimes;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getAppealComment() {
        return appealComment;
    }

    public void setAppealComment(String appealComment) {
        this.appealComment = appealComment;
    }

    public int getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(int isFreeze) {
        this.isFreeze = isFreeze;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
