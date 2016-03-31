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
public class CooperateMallListVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 返回的合作商场列表
	private List<CooperateMallVO> list;

	public List<CooperateMallVO> getList() {
		return list;
	}

	public void setList(List<CooperateMallVO> list) {
		this.list = list;
	}

}
