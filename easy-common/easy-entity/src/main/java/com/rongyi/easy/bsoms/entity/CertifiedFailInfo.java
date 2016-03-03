package com.rongyi.easy.bsoms.entity;

import java.util.Date;

/**
 * 摩店用户审核不通过表
 * @author sj
 *
 */
public class CertifiedFailInfo {
	
    private Integer id;

    private Integer userId;    //用户ID

    private Integer opeUserId;   //审核人ID
    
    private String reason;       //不通过理由

    private Byte isDeleted;

    private Date createAt;

    private Date updateAt;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOpeUserId() {
        return opeUserId;
    }

    public void setOpeUserId(Integer opeUserId) {
        this.opeUserId = opeUserId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
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