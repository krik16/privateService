package com.rongyi.easy.bdata.entity;

import java.util.Date;

/**
 * Desc: communal facilities
 * User: chris
 * Date: 2015/10/29 18:07
 */
public class CommunalFacility {
    private Long      id;
    private String    floor_id;
    private String    communal_facilities_type;
    private String    name;
    private String    memo;
    private String    coordinate_x;
    private String    coordinate_y;
    private String    tag;
    private Integer   status;
    private String    organize;
	private String    operator;
    private Date    create_at;
    private Date    update_at;
    private String    updator;
    
    
    public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
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

    public String getFloor_id() {
        return floor_id;
    }

    public void setFloor_id(String floor_id) {
        this.floor_id = floor_id;
    }

    public String getCommunal_facilities_type() {
        return communal_facilities_type;
    }

    public void setCommunal_facilities_type(String communal_facilities_type) {
        this.communal_facilities_type = communal_facilities_type;
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

    public String getCoordinate_x() {
        return coordinate_x;
    }

    public void setCoordinate_x(String coordinate_x) {
        this.coordinate_x = coordinate_x;
    }

    public String getCoordinate_y() {
        return coordinate_y;
    }

    public void setCoordinate_y(String coordinate_y) {
        this.coordinate_y = coordinate_y;
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
}
