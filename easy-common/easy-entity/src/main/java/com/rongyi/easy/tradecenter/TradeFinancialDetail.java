package com.rongyi.easy.tradecenter;

import java.io.Serializable;
import java.util.Date;

public class TradeFinancialDetail implements Serializable {
    private Integer id;

    private Integer orderId;

    private String orderNo;

    private Integer subOrderId;

    private Integer origPrice;

    private Integer unitPrice;

    private Integer hbOrigAmount;

    private Integer hbUseAmount;

    private Integer rebateAmount;

    private Integer rebatePrice;

    private Integer score;

    private Integer scoreAmount;

    private Integer refundAmount;

    private Byte status;

    private Byte isDelete;

    private Date createAt;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(Integer subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Integer getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getHbOrigAmount() {
        return hbOrigAmount;
    }

    public void setHbOrigAmount(Integer hbOrigAmount) {
        this.hbOrigAmount = hbOrigAmount;
    }

    public Integer getHbUseAmount() {
        return hbUseAmount;
    }

    public void setHbUseAmount(Integer hbUseAmount) {
        this.hbUseAmount = hbUseAmount;
    }

    public Integer getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(Integer rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public Integer getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(Integer rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScoreAmount() {
        return scoreAmount;
    }

    public void setScoreAmount(Integer scoreAmount) {
        this.scoreAmount = scoreAmount;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}