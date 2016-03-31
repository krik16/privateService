package com.rongyi.easy.shop.param;

import java.io.Serializable;

/**
 * 商家后台店铺管理实体类
 * @author wzh
 *
 */
public class CategoryParam implements Serializable {

	private static final long serialVersionUID = 5321646214285676988L;
	
	private String id;//父id
	
	private Integer  type;// 1一级分类

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	
}
