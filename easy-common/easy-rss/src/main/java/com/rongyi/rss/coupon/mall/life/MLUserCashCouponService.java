package com.rongyi.rss.coupon.mall.life;

import com.rongyi.easy.coupon.vo.UserCouponVO;

import java.util.List;
import java.util.Map;

/**
 * 摩生活：用户红包接口
 * 原接口名：RmmmUserCashCouponService
 *
 * @author Breggor
 * @see MLUserRedenvelopeService
 */
@Deprecated
public interface MLUserCashCouponService {

    /**
     * 接口描述：用户红包 (未使用/已使用) 列表查询
     * 使用模块：摩生活-我的红包
     *
     * @param map 目前参数说明：{currentPage：0,pageSize:10,userId:1,productId:10,status
     *            :1}status 1是未使用 2包括已使用，已过期
     * @return
     */
    public Map<String, Object> getCashCouponListByUserId(Map<String, Object> map);

    /**
     * 红包 (未使用) 列表查询
     *
     * @param productIds
     * @param userId
     * @return {product:[],all:[]} 商品key=product，全场key=all
     */
    public Map<String, List<UserCouponVO>> fetchUnusedCashCoupon(List<String> productIds, String userId);

    /**
     * 红包 详情
     *
     * @param couponCode 红包券码
     * @return UserCouponVO
     */
    public UserCouponVO getCashCoupon(String couponCode);

    /**
     * 判断红包是否是有效的
     *
     * @param couponCode 红包模板id, productId 商品id
     * @return true 没过期 false 已过期
     * @throws Exception
     */
    public Boolean validCashCoupon(String couponCode, String productId);

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
     * 通过couponCode获取红包折扣金额
     *
     * @param couponCode
     * @return
     * @see MLUserRedenvelopeService#getCashCouponDiscount(String)
     */
    public Double getCashCouponDiscount(String couponCode);

    /**
     * 通过couponCode获取红包价格
     * Author: ZhengYl 2015-05-18
     *
     * @param couponCode
     * @return
     * @see MLUserRedenvelopeService#getCashCouponDiscount(String)
     */
//    public Double getCashCouponPrice(String couponCode);


}
