package com.rongyi.easy.merchantactivity.param;

import com.rongyi.easy.activitymanage.param.PagingParam;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/10
 * TIME : 14:21
 * ideaworkspace.
 */
public class SearchMerchActivityListParam extends PagingParam {
	
	private	int userId;
	private int identity;
	
	
	
    /**
     * 店铺id
     */
    private String shopId;

    private String orderByClause = "ae.create_at desc";

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "SearchMerchActivityListParam [userId=" + userId + ", identity=" + identity + ", shopId=" + shopId
				+ ", orderByClause=" + orderByClause + "]";
	}


    
    
}
