package com.rongyi.rss.msgcenter;

import com.rongyi.easy.coupon.param.UserSkypeParam;
import com.rongyi.easy.coupon.vo.PlatformRebateVO;
import com.rongyi.easy.msgcenter.ShareQualifiedDTO;
import com.rongyi.easy.rmmm.vo.RebateCouponVO;

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
     * @param param
     *        userId 必传
     *        activityid 必传
     *        type(0抵扣券，1红包。两者都包含，此字段为null)
     *        reciveStartAt 领取开始时间 默认当天的0点0分0秒
     *        reciveEndAt 领取结束时间 默认当天23点59分59秒999毫秒
     * @return
     */
    public int getOneDayUserSkype(UserSkypeParam param);

    /**
     * 用户当日最多获取红包或抵扣券的上限
     * 上限=当前活动领取上线-用户当前获取红包抵扣券的个数
     * @param param
     *        userId 必传
     *        activityId 必传 当前分享活动id
     *        type(0抵扣券，1红包。两者都包含，此字段为null)
     *        reciveStartAt 领取开始时间 默认当天的0点0分0秒
     *        reciveEndAt 领取结束时间 默认当天23点59分59秒999毫秒
     * @return
     */
    public int getUserSkypeLimit(UserSkypeParam param);

    /**
     * 判断某个分享活动是否已经结束
     * @param param
     *  activityId 必传
     * @return true 没有结束  false 结束了
     */
    public boolean activityIsOver(UserSkypeParam param);

    /**
     * 领取分享红包的抵扣券或者红包
     * @return
     */
    public boolean reciveSkype(UserSkypeParam param);

    /**
     * 判断是否有资格分享红包
     * @param orderNo 订单号
     * @return
     */
    public ShareQualifiedDTO shareQualified(String orderNo);

    /**
     * 锁定分享红包券码
     * @param orderNo 订单号
     * @return
     */
    public ShareQualifiedDTO shareLockCode(String orderNo);

    /**
     * 根据券码查询券信息
     * @param code
     * @return
     */
    public PlatformRebateVO getRebateVOFromCode(String code);
}
