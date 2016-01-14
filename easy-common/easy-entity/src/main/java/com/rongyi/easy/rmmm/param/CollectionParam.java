package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class CollectionParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//收藏的内容的id
	private String type;//0 取消收藏  1 收藏
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
	
}
