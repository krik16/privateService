package com.rongyi.rss.coupon.special;

import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/26 16:40
 * Package:com.rongyi.roa.service.coupon.mall.shop
 * Project:easy-market
 */
public interface MLSpecialCouponService {

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
     * 每个用户可以领用的次数
     * @return
     */
    public int getReceiveLimit();
}
