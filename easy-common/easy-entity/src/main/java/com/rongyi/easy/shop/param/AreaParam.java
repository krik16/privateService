package com.rongyi.easy.shop.param;

import java.io.Serializable;

/**
 * 商家后台店铺管理实体类
 * @author wzh
 *
 */
public class AreaParam implements Serializable {

	private static final long serialVersionUID = 5321646214285676988L;
	
	private String id;//父id
	
	private String type;//地址类型 比如BusinessDistrict

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
