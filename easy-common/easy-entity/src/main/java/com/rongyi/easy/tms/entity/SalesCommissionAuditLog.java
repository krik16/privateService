package com.rongyi.easy.tms.entity;

import java.io.Serializable;
import java.util.Date;

public class SalesCommissionAuditLog implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3490504338459066931L;
    
	private Integer id;

	private Integer salesCommissionId;

	private String auditUserId;

	private Integer operateBiz;

	private Date createAt;

	private String memo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalesCommissionId() {
		return salesCommissionId;
	}

	public void setSalesCommissionId(Integer salesCommissionId) {
		this.salesCommissionId = salesCommissionId;
	}

	public String getAuditUserId() {
		return auditUserId;
	}

	public void setAuditUserId(String auditUserId) {
		this.auditUserId = auditUserId;
	}

	public Integer getOperateBiz() {
		return operateBiz;
	}

	public void setOperateBiz(Integer operateBiz) {
		this.operateBiz = operateBiz;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}