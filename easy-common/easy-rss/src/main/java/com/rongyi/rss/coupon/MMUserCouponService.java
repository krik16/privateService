package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.old.UserCoupon;
import com.rongyi.easy.coupon.vo.MMUserCouponVO;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.ShopVO;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * 1.获取优惠列表   (分页)  2.主键获取用户优惠
 *
 * @author hebo
 * @Description: TODO(用户券码接口，提供给mall-shop的controller使用)
 * @date 2015年6月8日 下午
 */
@Deprecated
public interface MMUserCouponService {

    /**
     * 查询用户优惠券列表(分页)
     *
     * @param userId
     * @param status
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PagingVO<UserCoupon> searchUserCouponList(String userId, Integer status, Integer currentPage, Integer pageSize);

    /**
     * 根据Id查询优惠券
     *
     * @param userCouponId
     * @return
     */
    UserCoupon findUserCouponById(Long userCouponId);


    /**
     * 根据id,用户Id查询优惠券
     * @param userCouponId
     * @param userId
     * @return
     */
    UserCoupon findUserCoupon(Long userCouponId, String userId);

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

    public PagingVO<UserCoupon> findUserCouponByUserId(String userId,
                                                       Integer currentPage, Integer pageSize);

    public UserCoupon findUserCouponByCouponCode(String couponCode);

    /**
     * 查询出现金券vo
     * @param couponCode
     * @return
     */
    MMUserCouponVO getUserCouponByCouponCode(String couponCode);

	public List<MallEntity> searchMallsByIds(List<ObjectId> ids);

	List<ShopVO> getShopsByIds(List<ObjectId> ids);

}
