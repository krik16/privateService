package com.rongyi.rss.coupon.mall.life;

import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.ShopVO;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * 容易逛：代金券与红包统一处理接口
 *
 * @author Breggor
 */
public interface MLUserCouponService {


    /**
     * 根据Id查询优惠券
     *
     * @param userCouponId
     * @return
     */
    UserCoupon findUserCouponById(Long userCouponId);


    /**
     * 订单Id和couponId查询用户优惠列表
     *
     * @param orderId
     * @param couponId
     * @return
     */

    List<UserCoupon> findUserCouponListByOrderIdCouponId(Long orderId, String couponId);


    UserCoupon findUserCouponByCouponCode(String couponCode);


    List<MallEntity> searchMallsByIds(List<ObjectId> ids);

    List<ShopVO> getShopsByIds(List<ObjectId> ids);

    /**
     * 
     * @param couponId
     * @param userId
     * @return
     */
    int buyedCouponCount(String couponId, String userId);
}
