package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class CommoditySpecListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<CommoditySpecVO> columnList1;//不同的规格名区分
	private List<CommoditySpecVO> columnList2;
	public List<CommoditySpecVO> getColumnList1() {
		return columnList1;
	}
	public void setColumnList1(List<CommoditySpecVO> columnList1) {
		this.columnList1 = columnList1;
	}
	public List<CommoditySpecVO> getColumnList2() {
		return columnList2;
	}
	public void setColumnList2(List<CommoditySpecVO> columnList2) {
		this.columnList2 = columnList2;
	}
	
}
