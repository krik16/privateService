package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

public class WebObjectResultVo implements Serializable{
	private Object data;
	private PageVO page;
	
	public WebObjectResultVo(){
		
	}
	
	public WebObjectResultVo(Object data,PageVO page){
		this.data = data;
		this.page = page;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public PageVO getPage() {
		return page;
	}

	public void setPage(PageVO page) {
		this.page = page;
	}
	
}
