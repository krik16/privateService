package com.rongyi.easy.merchantactivity.param;

/**
 * 获取报名卡劵参数
 * 
 * @author wangjh
 * @date 2016年3月10日
 */
public class MerchantEnrollGoodsParam {

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * ID
	 */
	private int activityId = 0;
	private String shopId = "";
	private int pageIndex = 0;
	private int pageSize = 0;

}
