package com.rongyi.easy.tms.entity;

import java.io.Serializable;
import java.util.Date;

public class BussinessLog implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8775566725031788211L;

	private Integer id;

    private Integer bussinessId;

    private Integer bussinessType;

    private String username;

    private Date createAt;

    private Integer deleted;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(Integer bussinessId) {
        this.bussinessId = bussinessId;
    }

    public Integer getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(Integer bussinessType) {
        this.bussinessType = bussinessType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}