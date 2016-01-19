/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月28日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月28日 1.0 创建文件
 */
public class DetailVO extends PageVO implements Serializable {

	private List<DetailListVO> detailList;

	public List<DetailListVO> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<DetailListVO> detailList) {
		this.detailList = detailList;
	}

	@Override
	public String toString() {
		return "DetailVO{" +
				"detailList=" + detailList +
				'}';
	}
}
