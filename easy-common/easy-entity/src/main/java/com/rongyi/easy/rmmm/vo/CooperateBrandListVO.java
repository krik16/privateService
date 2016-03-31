package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Lc
 * 
 *         合作商场列表VO
 *
 */
public class CooperateBrandListVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 返回品牌列表
	private List<CooperateBrandVO> list;

	public List<CooperateBrandVO> getList() {
		return list;
	}

	public void setList(List<CooperateBrandVO> list) {
		this.list = list;
	}

}
