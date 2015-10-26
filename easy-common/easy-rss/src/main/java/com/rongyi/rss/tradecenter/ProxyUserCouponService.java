package com.rongyi.rss.tradecenter;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.mybatis.pojo.Page;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.coupon.vo.UserCouponVO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author liuhao
 * @version 2015/8/19
 */
public interface ProxyUserCouponService {

    /**
     * 根据券码查询用户优惠红包
     *
     * @param couponCode
     * @return
     */
    UserCoupon getUserCoupon(String couponCode);

    /**
     * 更新用户优惠红包
     *
     * @param userCoupon
     */
    void updateUserCoupon(UserCoupon userCoupon);

    /**
     * 根据用户优惠券Id查询
     * @param id
     * @return
     */
    UserCoupon findUserCouponById(Long id);


    /**
     * 统计用户已购买的优惠券数量
     *
     * @param couponId
     * @param userId
     * @return
     */
    int buyedCouponCount(String couponId, String userId);

    List<UserCoupon> findUserCouponList(Long orderId, String couponId);

    void updateUserCouponStatusByIds(List<Long> userCouponIds, int status);
}
