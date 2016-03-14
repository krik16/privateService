package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.entity.ActivityInfo;

/**
 * create by com.rongyi.rss.activitymanage ideaworkspace :author lijing
 * 商家后台活动接口
 * User:lijing
 * DATE : 2016/3/14
 * TIME : 9:56
 * ideaworkspace.
 */
public interface MerchantActivityService {
    /**
     * 保存商家活动规则信息
     * @Param activityInfo
     * @return
     */
    public Boolean saveMerchantCouponActivityInfo(ActivityInfo activityInfo);
}
