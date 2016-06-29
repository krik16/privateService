package com.rongyi.easy.settle.entity;

import java.util.Date;

public class SmDivideAccount {
    private Integer id;

    private Integer mallId;

    private Date billDate;

    private String billBatchNo;

    private Integer orderNum;

    private Integer unitNum;

    private Integer payAmount;

    private Integer rebateAmount;

    private Integer mallPoint;

    private Integer settleAmount;

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

    public Integer getMallPoint() {
        return mallPoint;
    }

    public void setMallPoint(Integer mallPoint) {
        this.mallPoint = mallPoint;
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

	public Integer getRebateAmount() {
		return rebateAmount;
	}

	public void setRebateAmount(Integer rebateAmount) {
		this.rebateAmount = rebateAmount;
	}

	public Integer getSettleAmount() {
		return settleAmount;
	}

	public void setSettleAmount(Integer settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Integer getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Integer payAmount) {
		this.payAmount = payAmount;
	}

}