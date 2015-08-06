package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.mybatis.pojo.Page;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.coupon.vo.UserCouponVO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用户现金劵[红包]优惠券接口
 *
 * @author Breggor
 */
public interface RoaUserCouponService {

    /**
     * 用户登陆检查是否领过登陆红包
     *
     * @param couponId
     * @param userId
     * @return
     */
    boolean checkReceivedUserCoupon(String couponId, String userId);

    /**
     * 根据券码查询用户优惠现金券
     *
     * @param couponCode
     * @return
     */
    UserCoupon getUserCoupon(String couponCode);

    /**
     * 新增用户优惠现金券
     *
     * @param userCoupon
     */
    void saveUserCoupon(UserCoupon userCoupon);

    /**
     * 更新用户优惠现金券
     *
     * @param userCoupon
     */
    void updateUserCoupon(UserCoupon userCoupon);

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

    UserCoupon findUserCouponById(Long id, String userId);


    /**
     * 统计用户已购买的优惠券数量
     *
     * @param couponId
     * @param userId
     * @return
     */
    int buyedCouponCount(String couponId, String userId);

    List<UserCoupon> findUserCouponList(Long orderId, String couponId);

    Page findAllByPage(Map<String, Object> paramMap);

    Map<String, List<UserCouponVO>> findUserCouponByProductIdsAndUserId(List<String> productIds, String userId);

    int changeCouponStatus(String couponCode, Integer status);

    UserCoupon getUserCoupon(String couponCode, Date curDate);

    PagingVO<UserCoupon> findUserCouponByUserId(String userId,
                                                Integer currentPage, Integer pageSize);

    /**
     * 修改用户券码的有效状态(定时任务)
     * Description
     */
    public void updateUserCouponValidate();


    void updateUserCouponStatusByIds(List<Long> userCouponIds, int status);
}
