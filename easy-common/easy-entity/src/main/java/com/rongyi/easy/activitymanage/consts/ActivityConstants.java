package com.rongyi.easy.activitymanage.consts;

/**
 * 活动常量
 * Created by Leon on 2016/1/22.
 */
public interface ActivityConstants {
    /**
     * 活动审核状态
     */
    interface ActivityCheckStatus {
        Integer NO_CHECK = 0;
        Integer CHECK_FAILURE = 1;
        Integer CHECK_SUCCESS = 2;
    }



    /**
     * 商品审核状态
     */
    interface ActivityGoodsCheckStatus {
        Integer NO_CHECK = 0;
        Integer CHECK_FAILURE = 1;
        Integer CHECK_SUCCESS = 2;
    }

    /**
     * label 类型
     */
    interface  GoodsLabelType{
        int REDVEN = 0;//红包
        int VOUCHER = 1;//代金券
        int REBATE = 2;//抵扣券
        int COMMODITY = 3;//商品
    }
    /**
     * 活动类型
     */
    interface ActivityType {
        Integer GOODS_AND_COUPON = 3;// 商品及卡券类型
        Integer RAFFLE = 2;//抽奖类活动
        Integer SIGN = 4;//签到送积分活动
    }

    /**
     * 发布渠道
     */
    interface PublishChannel {
        Integer OPERATION = 0;
        Integer MERCHANT = 1;
    }

    /**
     * 推广渠道
     */
    interface  SynTarget {
        int RONGYIGUANG = 0;
        int TERMINAL = 1;
        int WEIXIN = 2;
        int WEISALE = 3;
    }

    /**
     * 分页
     */
    interface Paging{
        Integer CURRENTPAGE =1 ;
        Integer PAGESIZE = 10;
    }

    interface GoodsType {
        String COMMODITY_STR = "商品";
        String COUPON_STR = "卡券";
        Integer COMMODITY_INT = 0;
        Integer COUPON_INT = 1;
    }

    /**
     * activityGoodsType 类型
     */
    interface ActivityGoodsType {
        Integer REDVEN = 0;//红包
        Integer VOUCHER = 1;//代金券
        Integer REBATE = 2;//抵扣券
        Integer COMMODITY = 3;//商品
    }

}
