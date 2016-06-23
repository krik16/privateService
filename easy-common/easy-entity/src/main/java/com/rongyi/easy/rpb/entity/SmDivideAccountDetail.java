package com.rongyi.easy.rpb.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SmDivideAccountDetail {
    private Integer id;

    private Integer mallId;

    private Integer shopId;

    private Date billDate;

    private String billBatchNo;

    private Integer divideAccountId;

    private Integer orderNum;

    private Integer unitNum;

    private Long payAmount;

    private BigDecimal rebateAmount;

    private Integer mallScore;

    private BigDecimal settleAmount;

    private String createBy;

    private String updateBy;

    private Date createAt;

    private Date updateAt;

    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillBatchNo() {
        return billBatchNo;
    }

    public void setBillBatchNo(String billBatchNo) {
        this.billBatchNo = billBatchNo;
    }

    public Integer getDivideAccountId() {
        return divideAccountId;
    }

    public void setDivideAccountId(Integer divideAccountId) {
        this.divideAccountId = divideAccountId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(BigDecimal rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public Integer getMallScore() {
        return mallScore;
    }

    public void setMallScore(Integer mallScore) {
        this.mallScore = mallScore;
    }

    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(BigDecimal settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}