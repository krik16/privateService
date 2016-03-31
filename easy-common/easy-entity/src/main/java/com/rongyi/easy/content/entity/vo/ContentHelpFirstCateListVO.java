package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;
import java.util.List;

public class ContentHelpFirstCateListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ContentHelpFirstCateVO> cateList;//分类列表

	public List<ContentHelpFirstCateVO> getCateList() {
		return cateList;
	}

	public void setCateList(List<ContentHelpFirstCateVO> cateList) {
		this.cateList = cateList;
	}
	
}
