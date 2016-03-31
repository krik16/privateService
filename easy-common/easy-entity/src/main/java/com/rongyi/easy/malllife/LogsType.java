package com.rongyi.easy.malllife;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/11/30
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/11/30              1.0            创建文件
 *
 */

public interface LogsType {


    interface FORUM{
        String MALL_INFO = "mallInfo";//"商场详情";
        String SHOP_INFO = "shopInfo";//"店铺详情";
        String SHOPSEARCH_INFO="shopList";//"店铺列表";
        String BRAND_INFO = "brandInfo";//"品牌详情";
        String COMMODITY_INFO="commodityInfo";//"商品详情";
        String COMMODITY_LIST="commodityList";//"商品列表";
        String COUPON_INFO="couponInfo";//"优惠券详情";
        String COUPON_LIST="couponList";//"优惠券列表";
        String ARTICLE_INFO="articleInfo";//"文章详情";
        String ARTICLE_LIST="articleList";//"文章列表";
        String CLEARANCECOMMODITY_INFO="saleList";//"特卖列表";
        String LIVESEARCH_INFO="liveInfo";//"直播详情";
        String LIVESEARCH_LIST="liveList";//"直播列表";
        String ACTIVITY_INFO="activityInfo";//"活动详情";
        String ACTIVITY_RECOMMEND="activityList";//"同城活动列表(推荐)";
    }
}
