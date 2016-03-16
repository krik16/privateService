package com.rongyi.easy.merchantactivity.vo;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/16
 * TIME : 13:52
 * ideaworkspace.
 */
public class MerchantActivityCountVO implements Serializable {
    /**所有活动数量*/
    private Integer allActivityCount;
    /**今日新增的活动数量*/
    private Integer nowAddActivityCount;
    /**申请撤销中的活动数量*/
    private Integer revokingActivityCount;
    /***/
    private Integer supportActivityCount;
    /***/
    private Integer joinActivityCount;
    /***/
    private Integer conductingActivityCount;
    /***/
    private Integer endActivityCount;
    /***/
    private Integer OfflineActivityCount;
}
