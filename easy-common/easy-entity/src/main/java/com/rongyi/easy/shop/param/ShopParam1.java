package com.rongyi.easy.shop.param;

import java.util.List;

import org.bson.types.ObjectId;

public class ShopParam1 {
	
	private String id;
	
	private List<ObjectId> ids;//停业启用下架id 
	
	private Integer type;//0停业 1启用2下架
	
	private String reason;//停业原因
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ObjectId> getIds() {
		return ids;
	}

	public void setIds(List<ObjectId> ids) {
		this.ids = ids;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
