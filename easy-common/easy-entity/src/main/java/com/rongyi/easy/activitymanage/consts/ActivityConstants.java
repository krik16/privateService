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
     * 活动类型
     */
    interface ActivityType {
        Integer GOODS_AND_COUPON = 3;// 商品及卡券类型
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

}
