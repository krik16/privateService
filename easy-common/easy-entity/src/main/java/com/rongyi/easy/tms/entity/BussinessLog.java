package com.rongyi.easy.tms.entity;

import java.io.Serializable;
import java.util.Date;

public class BussinessLog implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2386539200988967202L;

	private Integer id;

    private Integer bussinessId;

    private Byte bussinessType;

    private String createUserId;

    private Date creadeAt;

    private Byte isDelete;

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

    public Byte getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(Byte bussinessType) {
        this.bussinessType = bussinessType;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreadeAt() {
        return creadeAt;
    }

    public void setCreadeAt(Date creadeAt) {
        this.creadeAt = creadeAt;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}