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
    private int refundReasonId;//退款原因id
    private int refundTypeId;//退款类型id
    private BigDecimal refundAmount;//退款金额
    private String refundExplain;//退款说明
    private List<String> pics;//退款图片列表

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
