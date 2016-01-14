package com.rongyi.easy.merchant.entity;

import java.io.Serializable;
import java.util.Date;

public class InviteCodeEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



    /** 表主键 */
    private Integer id;

    /** 创建时间 */
    private Date createAt;

    /** 状态(0作废 1未使用 2已使用) */
    private Integer status;

    /** 申请人id*/
    private Integer proposerId;

    /** 使用人id */
    private Integer usedBy;

    /** 使用时间 */
    private Date usedAt;

    /** 邀请码 */
    private String inviteCode;


    /** 邀请码申请记录表id */
    private Integer applyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getProposerId() {
        return proposerId;
    }

    public void setProposerId(Integer proposerId) {
        this.proposerId = proposerId;
    }

    public Integer getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(Integer usedBy) {
        this.usedBy = usedBy;
    }

    public Date getUsedAt() {
        return usedAt;
    }

    public void setUsedAt(Date usedAt) {
        this.usedAt = usedAt;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }
}