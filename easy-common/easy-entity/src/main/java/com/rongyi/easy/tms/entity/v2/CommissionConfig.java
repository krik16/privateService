package com.rongyi.easy.tms.entity.v2;

import java.io.Serializable;
import java.util.Date;

public class CommissionConfig implements Serializable {

    private static final long serialVersionUID = 5045564864056964971L;

    private Integer id;

    /**
     * �������
     */
    private String ruleCode;

    /**
     * ��Ч��ʼʱ��
     */
    private Date effectStartTime;

    /**
     * ��Ч����ʱ��
     */
    private Date effectEndTime;

    /**
     * ��Ӷ����(0:�ƹ㷵Ӷ,1:�׵���Ӷ,2:СƱ��Ӷ)
     */
    private Byte type;

    /**
     * ��Ӷ�ż�,Ĭ��Ϊ1
     */
    private Integer commThreshold;

    /**
     * ��Ӷ���(��λ��)
     */
    private Integer commAmount;

    /**
     * ����������(0:ȫ����1:����,2:����)
     */
    private Byte inviteType;

    /**
     * ע��������(0:ȫ����1:���׹�,2:Ħ��)
     */
    private Byte registerType;

    /**
     * ��������(0:��Ӷ����,1:��Ӷ�ܶ�)
     */
    private Byte limitType;

    /**
     * ���շ�Ӷ����
     */
    private Integer limitTotal;

    /**
     * �ͷ��������(0:ϵͳ���,1:�˹����)
     */
    private Byte custVerify;

    /**
     * �����������(0:ϵͳ���,1:�˹����)
     */
    private Byte finaVerify;

    /**
     * ״̬(0:����ˣ�1:���ͨ��,2:��˲�ͨ��,3���ã�4:ͣ��)
     */
    private Byte status;

    /**
     * ����ʱ��
     */
    private Date createAt;

    /**
     * ���ɾ��(0:������1:ɾ����Ĭ��0)
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