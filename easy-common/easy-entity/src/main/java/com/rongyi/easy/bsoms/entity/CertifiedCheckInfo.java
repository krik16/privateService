package com.rongyi.easy.bsoms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 摩店用户审核记录表
 * @author sj
 *
 */
public class CertifiedCheckInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer userId;    //用户ID

    private Integer createBy;   //审核人ID
    
    private Integer checkStatus; //审核状态  0通过  1不通过
    
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

    public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
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

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}
}