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
        String MALL_INFO = "商场详情";
        String SHOP_INFO = "店铺详情";
        String BRAND_INFO = "品牌详情";
        String COMMODITY_INFO="商品详情";
        String COMMODITY_LIST="商品列表";
        String COUPON_INFO="优惠券详情";
        String COUPON_LIST="优惠券列表";
        String ARTICLE_INFO="文章详情";
        String ARTICLE_LIST="文章列表";
        String CLEARANCECOMMODITY_INFO="临时特卖列表";
        String LIVESEARCH_INFO="直播详情";
        String LIVESEARCH_LIST="直播列表";
        String SHOPSEARCH_INFO="店铺列表";
        String ACTIVITY_INFO="活动详情";
        String ACTIVITY_RECOMMEND="同城活动推荐";
    }
}
