package com.rongyi.easy.contentnew.entity.vo;

import java.io.Serializable;

public class webObjectResultVo implements Serializable{
	private Object data;
	private PageVo page;
	
	public webObjectResultVo(){
		
	}
	
	public webObjectResultVo(Object data,PageVo page){
		this.data = data;
		this.page = page;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public PageVo getPage() {
		return page;
	}

	public void setPage(PageVo page) {
		this.page = page;
	}
	
}
