package com.rongyi.easy.bsoms.entity;

import java.io.Serializable;
import java.util.Date;


public class BRoles implements Serializable{
    private Integer id;

    private String name;

    private Integer type;

    private Integer identity;

    private Integer isDefault;

    private Integer createSource;

    private Integer status;

    private Integer createBy;

    private Date createAt;

    private Integer updateBy;

    private Date updateAt;
    
    private String createName;
    
    private Date stopAt;
    
    private Integer stopBy;
    private String stopReason;
    
    private BBelongRelation belongRelation; 
    
    private Integer canUpdate ;//是否能编辑  0能 1不能

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getCreateSource() {
        return createSource;
    }

    public void setCreateSource(Integer createSource) {
        this.createSource = createSource;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public Date getStopAt() {
		return stopAt;
	}

	public void setStopAt(Date stopAt) {
		this.stopAt = stopAt;
	}

	public Integer getStopBy() {
		return stopBy;
	}

	public void setStopBy(Integer stopBy) {
		this.stopBy = stopBy;
	}

	public BBelongRelation getBelongRelation() {
		return belongRelation;
	}

	public void setBelongRelation(BBelongRelation belongRelation) {
		this.belongRelation = belongRelation;
	}
	public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public Integer getCanUpdate() {
		return canUpdate;
	}

	public void setCanUpdate(Integer canUpdate) {
		this.canUpdate = canUpdate;
	}
    
}
