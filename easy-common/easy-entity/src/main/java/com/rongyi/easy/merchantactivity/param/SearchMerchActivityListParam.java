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

    @Override
    public String toString() {
        return "SearchMerchActivityListParam{" +
                "shopId='" + shopId + '\'' +
                ", orderByClause='" + orderByClause + '\'' +
                "} " + super.toString();
    }
}
