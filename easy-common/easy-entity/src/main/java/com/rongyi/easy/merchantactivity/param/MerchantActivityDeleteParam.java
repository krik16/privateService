package com.rongyi.easy.merchantactivity.param;

import java.util.List;

/**
 * 类说明
 * 
 * @author wangjh
 * @date 2016年3月11日
 */
public class MerchantActivityDeleteParam {

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Integer> getActivityIds() {
		return activityIds;
	}

	public void setActivityIds(List<Integer> activityIds) {
		this.activityIds = activityIds;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	private List<Integer> activityIds = null;
	private String userId = "";
	private String shopId = "";
}
