package com.rongyi.easy.malllife.param.city;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class SearchCityParam extends MalllifeBaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String keyword;//搜索城市的关键词
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
