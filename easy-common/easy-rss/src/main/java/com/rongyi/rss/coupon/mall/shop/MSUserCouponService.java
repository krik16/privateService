package com.rongyi.rss.coupon.mall.shop;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.coupon.entity.UserRedenvelope;
import com.rongyi.easy.coupon.vo.MMUserCouponVO;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.ShopVO;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * 摩店-代金券接口
 * Created by Breggor on 2015/10/13.
 */
public interface MSUserCouponService {


    /**
     * 订单Id和couponId查询用户优惠列表
     *
     * @param orderId
     * @param couponId
     * @return
     */
    List<UserCoupon> findUserCouponListByOrderIdCouponId(Long orderId, String couponId);


    MallEntity getMallEntityById(String mallId) throws Exception;

    public ShopVO getShopsVOById(String id) throws Exception;

    public PagingVO<UserRedenvelope> findUserCouponByUserId(String userId,
                                                            Integer currentPage, Integer pageSize);

    public UserCoupon findUserCouponByCouponCode(String couponCode);

    /**
<<<<<<< HEAD
     * 查询出现金券vo
=======
     * 查询出红包vo
>>>>>>> develop-yuzhijian
     *
     * @param couponCode
     * @return
     */
    MMUserCouponVO getUserCouponByCouponCode(String couponCode);

    public List<MallEntity> searchMallsByIds(List<ObjectId> ids);

    List<ShopVO> getShopsByIds(List<ObjectId> ids);

    UserCoupon findUserCouponByCode(String couponCode);
}
