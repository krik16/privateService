package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class BrandWallListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BrandWallVO> list;

	public List<BrandWallVO> getList() {
		return list;
	}

	public void setList(List<BrandWallVO> list) {
		this.list = list;
	}

}
