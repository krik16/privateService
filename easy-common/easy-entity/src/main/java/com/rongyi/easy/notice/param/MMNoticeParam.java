package com.rongyi.easy.notice.param;

import java.io.Serializable;

public class MMNoticeParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String jsessionid;//用户登录的sessionId
	
	private String shopId;//店铺mongoId
	
	private Integer currentpage;//当前页
	
	private Integer pageSize;//每页显示的数量

	public String getJsessionid() {
		return jsessionid;
	}

	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Integer getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(Integer currentpage) {
		this.currentpage = currentpage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
