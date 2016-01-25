package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

/**
 * 通过店铺id查询导购列表参数
 * @author WZH
 *
 */
public class UserInfoParam implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	private String shopId;// //店铺id或者店铺MongoId
	private String shopMId;
	
	private String currentPage; // 从0页开始
	private String pageSize; // 每页数据显示数量

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

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopMId() {
		return shopMId;
	}

	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}
	
}
