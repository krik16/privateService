package com.rongyi.rss.rule;

/**
 * Created by yujisun on 2016/5/20.
 */
public interface IInviteCodeCheckService
{
    /**
     * 校验活动邀请码
     *
     * @param inviteCode 邀请码
     * @param activityId 活动id
     * @param terminal 活动终端 1app 2微商城 3标准微信 4互动屏
     * @return 是否成功
     */
    boolean checkInviteCode(String inviteCode, String activityId, Integer terminal);
}
