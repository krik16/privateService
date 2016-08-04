package com.rongyi.easy.tms.vo.v2;

import com.rongyi.easy.tms.entity.v2.CommissionConfig;

import java.io.Serializable;

/**
 * 推广返佣实体 （摩店）
 * Created by user on 2016/8/4.
 */
public class CommissionConfigAppVo implements Serializable{
    private static final long serialVersionUID = 8355896885447904037L;

    private Integer id;
    /**
     * 返佣金额(单位分)
     */
    private Integer commAmount;

    /**
     * 邀请人类型(1导购;2买手)
     */
    private Byte inviteType;

    /**
     * 注册人类型(1容易逛;2买手;3导购;4摩店全部)
     */
    private Byte registerType;

    /**
     * 返佣门槛,默认为1
     */
    private Integer commThreshold;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCommThreshold() {
        return commThreshold;
    }

    public void setCommThreshold(Integer commThreshold) {
        this.commThreshold = commThreshold;
    }
}
