package com.rongyi.rss.msgcenter;

import com.rongyi.easy.coupon.param.UserSkypeParam;

/**
 * Description:微信分享红包接口
 * Author: 袁波
 * DATE: 2016/5/5 11:37
 * Package:com.rongyi.rss.msgcenter
 * Project:easy-market
 */
public interface SharePushActivityService {
    /**
     * 获取用户当日获取红包或抵扣券的个数
     * @param param userId type(0抵扣券，1红包。两者都包含，次字段为null)
     * @return
     */
    public int getOneDayUserSkype(UserSkypeParam param);

    /**
     * 用户当日最多获取红包或抵扣券的上限
     * 上限=当前分享活动每天上限-当前用户已经领取该分享活动领取的数量
     * @param param
     * @return
     */
    public int getUserSkypeLimit(UserSkypeParam param);

    /**
     * 判断某个分享活动是否已经结束
     * @param param
     * @return
     */
    public boolean activityIsOver(UserSkypeParam param);

    /**
     * 领取分享红包的抵扣券或者红包
     * @return
     */
    public boolean reciveSkype(UserSkypeParam param);
}
