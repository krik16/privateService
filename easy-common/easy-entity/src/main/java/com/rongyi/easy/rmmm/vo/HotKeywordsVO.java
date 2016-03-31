package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.malllife.domain.CityDO;

import java.io.Serializable;
import java.util.List;

public class HotKeywordsVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2237156403701183917L;

	private int listSize;
	private List<String> keywordsList;



	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	 public List<String> getKeywordsList() {
		return keywordsList;
	}
	public void setKeywordsList(List<String> keywordsList) {
		this.keywordsList = keywordsList;
	}
}
