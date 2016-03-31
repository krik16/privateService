package com.rongyi.easy.merchantactivity.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 类说明
 * 
 * @author wangjh
 * @date 2016年3月11日
 */
public class MerchantActivityDeleteParam implements Serializable{

	private List<Integer> activityIds = null;
	private String userId = "";
	private String shopId = "";
	private String userName ;

	public List<Integer> getActivityIds() {
		return activityIds;
	}

	public void setActivityIds(List<Integer> activityIds) {
		this.activityIds = activityIds;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("activityIds", activityIds)
				.append("userId", userId)
				.append("shopId", shopId)
				.append("userName", userName)
				.toString();
	}
}
