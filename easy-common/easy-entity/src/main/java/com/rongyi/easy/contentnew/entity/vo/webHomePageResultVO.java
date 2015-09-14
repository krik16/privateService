package com.rongyi.easy.contentnew.entity.vo;

import java.io.Serializable;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;

public class webHomePageResultVO implements Serializable{
	private List data;
	
	private PageVo page;

	public webHomePageResultVO(){
		
	}
	
	public webHomePageResultVO(List data,PageVo page){
		this.data=data;
		this.page=page;
	}
	
	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public PageVo getPage() {
		return page;
	}

	public void setPage(PageVo page) {
		this.page = page;
	}
	
	
}
