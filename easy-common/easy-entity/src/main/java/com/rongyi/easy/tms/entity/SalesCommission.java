package com.rongyi.easy.tms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SalesCommission implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3490504338459066931L;
    
    private Integer id;

    private String guideId;

    private String orderNo;

    private BigDecimal commissionAmount;

    private Integer status;

    private Date createAt;

    private Date picUploadAt;

    private String picUrls;
    
    private String createUser;
    
    private int type;// 默认为空，是返佣；1：考核奖金  ;2:惩罚
    
    private String remark;// 考核奖金 备注
    
    private String updateUser;
    
    private Date updateDate;
    
    private String buyerAccount;

    private Integer guideType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getPicUploadAt() {
        return picUploadAt;
    }

    public void setPicUploadAt(Date picUploadAt) {
        this.picUploadAt = picUploadAt;
    }

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getBuyerAccount() {
		return buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    @Override
    public String toString() {
        return "SalesCommission [id=" + id + ", guideId=" + guideId + ", orderNo=" + orderNo + ", commissionAmount="
                + commissionAmount + ", status=" + status + ", createAt=" + createAt + ", picUploadAt=" + picUploadAt
                + ", picUrls=" + picUrls + ", buyerAccount=" + buyerAccount + ", createUser=" + createUser + ", type=" + type + ", remark=" + remark
                + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
    }
    
}