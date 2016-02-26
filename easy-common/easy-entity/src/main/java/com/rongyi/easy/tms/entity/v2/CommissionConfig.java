package com.rongyi.easy.tms.entity.v2;

import java.io.Serializable;
import java.util.Date;

public class CommissionConfig implements Serializable {

    private static final long serialVersionUID = 5045564864056964971L;

    private Integer id;

    /**
     * 规则编码
     */
    private String ruleCode;

    /**
     * 生效起始时间
     */
    private Date effectStartTime;

    /**
     * 生效结束时间
     */
    private Date effectEndTime;

    /**
     * 返佣类型(0:推广返佣,1:首单返佣,2:小票返佣)
     */
    private Byte type;

    /**
     * 返佣门槛,默认为1
     */
    private Integer commThreshold;

    /**
     * 返佣金额(单位分)
     */
    private Integer commAmount;

    /**
     * 邀请人类型(0:全部，1:导购,2:买手)
     */
    private Byte inviteType;

    /**
     * 注册人类型(0:全部，1:容易逛,2:摩店)
     */
    private Byte registerType;

    /**
     * 限制类型(0:返佣笔数,1:返佣总额)
     */
    private Byte limitType;

    /**
     * 单日返佣上限
     */
    private Integer limitTotal;

    /**
     * 客服审核类型(0:系统审核,1:人工审核)
     */
    private Byte custVerify;

    /**
     * 财务审核类型(0:系统审核,1:人工审核)
     */
    private Byte finaVerify;

    /**
     * 状态(0:待审核，1:审核通过,2:审核不通过,3启用，4:停用)
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 标记删除(0:正常，1:删除，默认0)
     */
    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public Date getEffectStartTime() {
        return effectStartTime;
    }

    public void setEffectStartTime(Date effectStartTime) {
        this.effectStartTime = effectStartTime;
    }

    public Date getEffectEndTime() {
        return effectEndTime;
    }

    public void setEffectEndTime(Date effectEndTime) {
        this.effectEndTime = effectEndTime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getCommThreshold() {
        return commThreshold;
    }

    public void setCommThreshold(Integer commThreshold) {
        this.commThreshold = commThreshold;
    }

    public Integer getCommAmount() {
        return commAmount;
    }

    public void setCommAmount(Integer commAmount) {
        this.commAmount = commAmount;
    }

    public Byte getInviteType() {
        return inviteType;
    }

    public void setInviteType(Byte inviteType) {
        this.inviteType = inviteType;
    }

    public Byte getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Byte registerType) {
        this.registerType = registerType;
    }

    public Byte getLimitType() {
        return limitType;
    }

    public void setLimitType(Byte limitType) {
        this.limitType = limitType;
    }

    public Integer getLimitTotal() {
        return limitTotal;
    }

    public void setLimitTotal(Integer limitTotal) {
        this.limitTotal = limitTotal;
    }

    public Byte getCustVerify() {
        return custVerify;
    }

    public void setCustVerify(Byte custVerify) {
        this.custVerify = custVerify;
    }

    public Byte getFinaVerify() {
        return finaVerify;
    }

    public void setFinaVerify(Byte finaVerify) {
        this.finaVerify = finaVerify;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}