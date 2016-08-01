package com.rongyi.easy.bdata.entity;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Desc: floor info
 * User: chris
 * Date: 2015/10/25 12:52
 */

@Entity(value ="building",noClassnameStored = true)
public class Building implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    private ObjectId  id;
    private ObjectId  mall_id;//商场id
    private String name;
    @Override
	public String toString() {
		return "Building [id=" + id + ", mall_id=" + mall_id + ", name=" + name + ", type=" + type + ", valid=" + valid
				+ "]";
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public ObjectId getMall_id() {
		return mall_id;
	}
	public void setMall_id(ObjectId mall_id) {
		this.mall_id = mall_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	private Integer type;
    private Integer valid;


    
}
