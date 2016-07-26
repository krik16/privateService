package com.rongyi.rss.coupon.special;

import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;

import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/26 16:42
 * Package:com.rongyi.roa.service.coupon
 * Project:easy-market
 */
public interface SpecialActivityService {
    /**
     * 获取当前用户还可以领取的次数。0：领取完了。
     * @param malllifeUserInfoEntity
     * @return 次数
     */
    public int getReceiveTimes(MalllifeUserInfoEntity malllifeUserInfoEntity);

    /**
     * 领取红包，并返回该用户剩余的次数
     * @param malllifeUserInfoEntity
     * @return 剩余领取的次数
     * @throws Exception
     */
    public int receiveCoupons(MalllifeUserInfoEntity malllifeUserInfoEntity) throws Exception;

    /**
     * 更新每个用户可以领取的次数
     * @param times
     * @return 返回次数
     */
    public int updateGetTimes(Integer times);

    /**
     * 更新可以领取的卡券
     * @param couponIds 卡券ids
     * @param status 0:可以用；1：不可用
     */
    public void updateGetCoupons(List<String> couponIds,Integer status);
}
