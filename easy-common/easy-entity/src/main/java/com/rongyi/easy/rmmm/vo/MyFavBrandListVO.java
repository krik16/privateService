package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class MyFavBrandListVO extends PageVO implements Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BrandDetailVO> list;

	public List<BrandDetailVO> getList() {
		return list;
	}

	public void setList(List<BrandDetailVO> list) {
		this.list = list;
	}
	
	
}
