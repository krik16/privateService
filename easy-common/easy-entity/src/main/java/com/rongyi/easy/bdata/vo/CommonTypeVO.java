package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 类型
 * 
 * @author xiaobo
 *
 */
public class CommonTypeVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedUserId() {
		return createdUserId;
	}
	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	private String value;
	private String name;
	private String createdUserId;
	private String UserId;;
	private Date createdAt;
	private Date updatedAt;
	
	
}
