package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class StarShopListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<StarShopVO> list;

	public List<StarShopVO> getList() {
		return list;
	}

	public void setList(List<StarShopVO> list) {
		this.list = list;
	}
	
}
