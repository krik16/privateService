package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * 消息中心负责人下属店员列表参数，及审核店员参数
 * @author user
 *
 */
public class MessageParam implements Serializable{

	private String shopId;//负责人店铺id
	private String currentPage;//当前页
	private String pageSize;
	private String saleId;//被审核店员ID

	private Integer flag;//0指定店 1全部
	/**
	 *  状态(1:通过，2：审核中，3：删除)
	 */
	private String status;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}
}
