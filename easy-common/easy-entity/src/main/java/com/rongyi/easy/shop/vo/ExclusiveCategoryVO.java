package com.rongyi.easy.shop.vo;

import java.io.Serializable;
import java.util.List;

public class ExclusiveCategoryVO implements Serializable{
	
	private String id;
	
	private String name;
	
	private List<ExclusiveCategoryVO> exclusiveCategoryVOs;//下级专属分类
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ExclusiveCategoryVO> getExclusiveCategoryVOs() {
		return exclusiveCategoryVOs;
	}

	public void setExclusiveCategoryVOs(
			List<ExclusiveCategoryVO> exclusiveCategoryVOs) {
		this.exclusiveCategoryVOs = exclusiveCategoryVOs;
	}
	
	
}
