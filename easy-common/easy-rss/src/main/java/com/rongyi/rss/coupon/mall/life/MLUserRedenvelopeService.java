package com.rongyi.rss.coupon.mall.life;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.UserRedenvelope;
import com.rongyi.easy.coupon.vo.UserCouponVO;

import java.util.List;
import java.util.Map;

/**
 * 摩生活：用户红包接口
 * 原接口名：RmmmUserCashCouponService
 *
 * @author Breggor
 */
public interface MLUserRedenvelopeService {


    /**
     * 根据Id查询优惠券
     *
     * @param userCouponId
     * @return
     */
    UserRedenvelope findUserCouponById(Integer userCouponId);


    public UserRedenvelope findUserCouponByCouponCode(String couponCode);

    public PagingVO<UserRedenvelope> findUserCouponByUserId(String userId,
                                                            Integer currentPage, Integer pageSize);

<<<<<<< HEAD
    /**
     * 接口描述：用户现金券 (未使用/已使用) 列表查询
=======
    PagingVO<UserRedenvelope> findUserCouponByUserIdFull(String userId,
                                                         Integer currentPage, Integer pageSize);

    /**
     * 接口描述：用户红包 (未使用/已使用) 列表查询
>>>>>>> develop-yuzhijian
     * 使用模块：摩生活-我的红包
     *
     * @param map 目前参数说明：{currentPage：0,pageSize:10,userId:1,productId:10,status
     *            :1}status 1是未使用 2包括已使用，已过期
     * @return
     */
    public Map<String, Object> findCashCouponListByUserId(Map<String, Object> map);

    /**
<<<<<<< HEAD
     * 现金券 (未使用) 列表查询
=======
     * 红包 (未使用) 列表查询
>>>>>>> develop-yuzhijian
     *
     * @param productIds
     * @param userId
     * @return {product:[],all:[]} 商品key=product，全场key=all
     */
    public Map<String, List<UserCouponVO>> findUnusedCashCoupon(List<String> productIds, String userId);

    /**
<<<<<<< HEAD
     * 现金券 详情
     *
     * @param couponCode 现金券券码
=======
     * 红包 详情
     *
     * @param couponCode 红包券码
>>>>>>> develop-yuzhijian
     * @return UserCouponVO
     */
    public UserCouponVO findCashCoupon(String couponCode);

    /**
<<<<<<< HEAD
     * 判断现金券是否是有效的
     *
     * @param couponCode 现金券模板id, commodityId 商品id
=======
     * 判断红包是否是有效的
     *
     * @param couponCode 红包模板id, commodityId 商品id
>>>>>>> develop-yuzhijian
     * @return true 没过期 false 已过期
     * @throws Exception
     */
    public Boolean validCashCoupon(String couponCode, String commodityId);

    /**
     * 通过couponCode 获取优惠券当前状态
     *
     * @param couponCode 券码
     * @return
     */
    public Integer getCashCouponStatus(String couponCode);

    /**
     * 通过couponCode改变优惠券当前状态
     *
     * @param status
     * @return
     */
    public Boolean changeCashCouponStatus(String couponCode, Integer status);

    /**
<<<<<<< HEAD
     * 通过couponCode获取现金券折扣金额
=======
     * 通过couponCode获取红包折扣金额
>>>>>>> develop-yuzhijian
     *
     * @param couponCode
     * @return
     */
    public Double getCashCouponDiscount(String couponCode);

    /**
<<<<<<< HEAD
     * 根据用户ID及现金ID检查是否已领过现金券
=======
     * 根据用户ID及现金ID检查是否已领过红包
>>>>>>> develop-yuzhijian
     *
     * @param couponId
     * @param userId
     * @return
     */
    boolean checkReceivedCashCoupon(String couponId, String userId);

    /**
<<<<<<< HEAD
     * 根据用户ID及现金ID领取现金券
=======
     * 根据用户ID及现金ID领取红包
>>>>>>> develop-yuzhijian
     *
     * @param couponId
     * @param userId
     * @return ResponseResult{message:错误信息，info：boolean状态是否领取成功}
     */
    ResponseResult receiveCashCoupon(String couponId, String userId);


}
