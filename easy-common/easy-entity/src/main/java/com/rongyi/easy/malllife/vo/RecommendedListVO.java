package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class RecommendedListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RecommendedVO> RecommendedList;//

	public List<RecommendedVO> getRecommendedList() {
		return RecommendedList;
	}

	public void setRecommendedList(List<RecommendedVO> recommendedList) {
		RecommendedList = recommendedList;
	}
	
}
