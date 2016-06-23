package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class CommoditySpecListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RmmCommoditySpecVO> columnList;//不同的规格名区分

	public List<RmmCommoditySpecVO> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<RmmCommoditySpecVO> columnList) {
		this.columnList = columnList;
	}
	
	
}
