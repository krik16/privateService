package com.rongyi.rss.coupon.operation;

import java.util.List;

/**
 * Description: 店铺所属基础信息修改，同步更新卡券所关联的店铺信息（数据库、solr）
 * Author: yb
 * DATE: 2017/4/19 14:45
 * Package:com.rongyi.rss.coupon.operation
 * Project:easy-market
 */
public interface IShopSynCouponService {

    /**
     * 店铺所属品牌信息修改 ，更新couponShop店铺名称
     * @param shopIds 有修改的店铺mids
     */
    public void synBrandCoupon(List<String> shopIds);

}
