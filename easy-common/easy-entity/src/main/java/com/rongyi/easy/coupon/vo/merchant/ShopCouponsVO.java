package com.rongyi.easy.coupon.vo.merchant;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/6/14 21:27
 * Package:com.rongyi.easy.coupon.vo.merchant
 * Project:easy-market
 */
public class ShopCouponsVO implements Serializable{
    private String shopId;
    private int count;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ShopCouponsVO{");
        sb.append("shopId='").append(shopId).append('\'');
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
