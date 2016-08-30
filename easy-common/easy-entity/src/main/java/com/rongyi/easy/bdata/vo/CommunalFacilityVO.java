package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Desc: communal facility vo
 * User: chris
 * Date: 2015/10/29 18:15
 */
public class CommunalFacilityVO implements Serializable {
    private Long      id;
    private String    floorId;
    private String    communalFacilityType;
    private String    communalFacilityName;
    private String    name;
    private String    memo;
    private String    coordinateX;
    private String    coordinateY;
    private String    tag;
    private Integer   status;
    private String    organize;
    private String    operator;
    private String    createAt;
    private String    updateAt;
    private String    updator;
    
 private String    ename;
    
    
    
    
    public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}


    public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public String getCommunalFacilityType() {
        return communalFacilityType;
    }

    public void setCommunalFacilityType(String communalFacilityType) {
        this.communalFacilityType = communalFacilityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrganize() {
        return organize;
    }

    public void setOrganize(String organize) {
        this.organize = organize;
    }

    public String getCommunalFacilityName() {
        return communalFacilityName;
    }

    public void setCommunalFacilityName(String communalFacilityName) {
        this.communalFacilityName = communalFacilityName;
    }
}
