package com.rongyi.easy.content_v2.consts;

/**
 * 内容常量定义类
 * Created by Breggor on 2015/9/17.
 */
public interface ContentConstents {
    /**
     * 首页内容类型
     */
    interface HomePageType {
        /**
         * 商城
         */
        int MALL = 1;
        /**
         * 店铺
         */
        int SHOP = 2;
        /**
         * 品牌
         */
        int BRAND = 3;
        /**
         * 商品
         */
        int PRODUCT = 4;
        /**
         * 代金券
         */
        int VOUCHER = 5;
        /**
         * 内链活动
         */
        int INNER_LINK = 6;
        /**
         * 文章
         */
        int ARTICLE = 7;
        /**
         * 优惠
         */
        int ACTIVITY = 8;
        /**
         * 外链活动
         */
        int OUTER_LINK = 9;
        /**
         * 抵扣券
         */
        int REBATE = 10;
    }
}