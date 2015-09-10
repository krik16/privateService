package com.rongyi.easy.contentnew.vo;

import java.io.Serializable;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;

public class WebHomePageResultVO implements Serializable{
	private List data;
	
	private PageVO page;

	public WebHomePageResultVO(){
		
	}
	
	public WebHomePageResultVO(List data,PageVO page){
		this.data=data;
		this.page=page;
	}
	
	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public PageVO getPage() {
		return page;
	}

	public void setPage(PageVO page) {
		this.page = page;
	}
	
	
}
