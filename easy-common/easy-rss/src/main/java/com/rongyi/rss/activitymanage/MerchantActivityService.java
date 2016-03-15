package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.entity.ActivityInfo;

import java.util.Map;

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
    public ActivityInfo saveMerchantCouponActivityInfo(ActivityInfo activityInfo);

    /**
     * 通过im消息发送信息
     * @param userIds
     * @param param
     */
    public void sendImMsg(String[] userIds,Map<String, String> param);
}
