package com.rongyi.easy.tms.entity.v2;

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

    /**
     * 返佣流水号
     */
    private String commNo;

    /**
     * 返佣类型（0:小票返佣,1:邀请返佣(容易逛),2:首单返佣,3:认证返佣(摩店)）
     */
    private byte commType;

    /**
     * 邀请人手机号
     */
    private String invitePhone;

    /**
     * 注册人手机号
     */
    private String registerPhone;

    /**
     * 配置id
     */
    private Integer configId;

    /**
     * 标记删除(0:正常，1:删除，默认0)
     */
    private byte isDelete;

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

    public String getCommNo() {
        return commNo;
    }

    public void setCommNo(String commNo) {
        this.commNo = commNo;
    }

    public byte getCommType() {
        return commType;
    }

    public void setCommType(byte commType) {
        this.commType = commType;
    }

    public String getInvitePhone() {
        return invitePhone;
    }

    public void setInvitePhone(String invitePhone) {
        this.invitePhone = invitePhone;
    }

    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone;
    }

    public byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    @Override
    public String toString() {
        return "SalesCommission{" +
                "id=" + id +
                ", guideId='" + guideId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", commissionAmount=" + commissionAmount +
                ", status=" + status +
                ", createAt=" + createAt +
                ", picUploadAt=" + picUploadAt +
                ", picUrls='" + picUrls + '\'' +
                ", createUser='" + createUser + '\'' +
                ", type=" + type +
                ", remark='" + remark + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", updateDate=" + updateDate +
                ", buyerAccount='" + buyerAccount + '\'' +
                ", guideType=" + guideType +
                ", commNo='" + commNo + '\'' +
                ", commType=" + commType +
                ", invitePhone='" + invitePhone + '\'' +
                ", registerPhone='" + registerPhone + '\'' +
                ", configId='" + configId + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}