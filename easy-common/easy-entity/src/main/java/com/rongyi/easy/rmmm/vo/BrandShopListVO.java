package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class BrandShopListVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BrandShopVO> list;

	public List<BrandShopVO> getList() {
		return list;
	}

	public void setList(List<BrandShopVO> list) {
		this.list = list;
	}

}
