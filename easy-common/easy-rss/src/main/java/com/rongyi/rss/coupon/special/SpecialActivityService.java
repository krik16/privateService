package com.rongyi.rss.coupon.special;

import com.rongyi.easy.coupon.vo.ActivityCouponVO;
import com.rongyi.easy.coupon.vo.SpecialVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
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
     * @param userInfoVO
     * @return 次数
     */
    public int getReceiveTimes(UserInfoVO userInfoVO);

    /**
     * 领取红包，并返回该用户剩余的次数
     * @param userInfoVO
     * @return 剩余领取的次数
     * @throws Exception
     */
    public SpecialVO receiveCoupons(UserInfoVO userInfoVO) throws Exception;

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

    /**
     * 获取每个用户的领取次数限制
     * @return
     */
    public int getReceiveLimit();

    public boolean couponHasStock();

    /**
     * 2016-12-15 双蛋活动-->领取 红包
     * @param malllifeUserInfoEntity 用户信息
     * @param times 每个用户可以领取的次数
     * @return
     */
    public List<ActivityCouponVO> receiveActivityCoupon(UserInfoVO malllifeUserInfoEntity,Integer times) throws Exception;

}
