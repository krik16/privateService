package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  张争平
 * Description:  查询店铺公告列表参数
 * time:  2015/9/7
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 *   张争平                             2015/9/7              1.0            创建文件
 *
 */
public class ShopNoticeListParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopMId;//店铺mongoId
	private Integer status;//1.审核中 2.发布中 3.已过期
	private String currentPage; // 当前页
	private String pageSize;  // 每页数据显示数量
	public String getShopMId() {
		return shopMId;
	}
	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	
}
