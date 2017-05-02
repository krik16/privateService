package com.rongyi.easy.tradecenter.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author chenjun
 * @date 2017/4/6 10:58
 */
public class RefundParam  implements Serializable {

    private String memberId;//用户id
    private String orderNo;//订单号
    private String sonOrderNo;//子订单号
    private String orderStatus;//订单状态
    private int refundReasonId;//退款原因id
    private int refundTypeId;//退款类型id
    private BigDecimal refundAmount;//退款金额
    private String refundExplain;//退款说明
    private List<String> pics;//退款图片列表
    private String refundNo;//退款单号
    private String logisticsBillId;//物流单号
    private String expressId;//快递公司id自填时为 0
    private String expressName;//快递公司名称

    private String receiverAddress;//退款单号
    private String receiverName;//退款单号
    private String receiverPhone;//退款单号
    private String remark;//退款单号
    private int type;//（1：同意退款申请 2同意退货退款申请 3：拒绝退款/退货 4：确认收货 5：拒绝收货 6：补发地址）
    private String createId;//操作人id
    private String createBy;//操作人
    private Integer source = 1;//操作平台 1摩店 2商家后台

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSonOrderNo() {
        return sonOrderNo;
    }

    public void setSonOrderNo(String sonOrderNo) {
        this.sonOrderNo = sonOrderNo;
    }

    public int getRefundReasonId() {
        return refundReasonId;
    }

    public void setRefundReasonId(int refundReasonId) {
        this.refundReasonId = refundReasonId;
    }

    public int getRefundTypeId() {
        return refundTypeId;
    }

    public void setRefundTypeId(int refundTypeId) {
        this.refundTypeId = refundTypeId;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundExplain() {
        return refundExplain;
    }

    public void setRefundExplain(String refundExplain) {
        this.refundExplain = refundExplain;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getLogisticsBillId() {
        return logisticsBillId;
    }

    public void setLogisticsBillId(String logisticsBillId) {
        this.logisticsBillId = logisticsBillId;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
