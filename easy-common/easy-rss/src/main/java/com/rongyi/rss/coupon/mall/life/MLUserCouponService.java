package com.rongyi.rss.coupon.mall.life;

import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.ShopVO;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * 1.获取优惠列表   (分页)  2.主键获取用户优惠
 *
 * @author hebo
 * @Description: (用户券码接口，提供给mall-life的controller使用)
 * @date 2015年6月8日 下午
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

}
