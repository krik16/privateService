package com.rongyi.easy.notice.param;

import java.io.Serializable;

public class MMNoticeParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String jsessionid;//用户登录的sessionId

	private int currentpage;


	private String shopId;//店铺mongoId
	

	
	

	public String getJsessionid() {
		return jsessionid;
	}

	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}

	private int pageSize;


	public String getShopId() {
		return shopId;
	}
	

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
