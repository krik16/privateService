package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class RecommendedListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RecommendedVO> RecommendedList;//
	private Integer totalCount;//有商品的品牌总数      推荐品牌使用

	public List<RecommendedVO> getRecommendedList() {
		return RecommendedList;
	}

	public void setRecommendedList(List<RecommendedVO> recommendedList) {
		RecommendedList = recommendedList;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
}
