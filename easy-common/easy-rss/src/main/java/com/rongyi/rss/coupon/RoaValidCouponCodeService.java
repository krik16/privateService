package com.rongyi.rss.coupon;


import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
/**
 * 券码验证
 * @author hebo 2015/06/15
 *
 */
public interface RoaValidCouponCodeService {
	/**
     * 优惠券验证
     * @param couponCode
     * @param mallId
     * @param shopId
     * @param useMode
     * @param couponId
     * @return
     */
    public ResponseResult validateCouponCode(String couponCode, String mallId, String shopId, Long useMode, String couponId, Integer sellerId);
    
    /**
     * 优惠券验证
     * @param couponCode
     * @param mallId
     * @param shopId
     * @param useMode
     * @param couponId
     * @param checkNum
     * @return
     */
    public ResponseResult validateCouponCodeMutli(String couponCode, String mallId, String shopId, Long useMode, String couponId, Integer sellerId,Integer checkNum);

    /**
     * 提供给手机端（rmmm）的券码验证接口
     * @param couponCode:优惠券券码
     * @return ResponseResult 验码状态说明：验证失败[0],验证成功[1],已过期[2],已使用[3]
     */
    public ResponseResult checkCouponCode(String couponCode, String shopId, Integer sellerId);
    
    
    /**
     * 提供给手机端 查询未使用券码的接口
     */
    public Map<String,Object> unusedCodeNum(String couponCode, Integer codeNum);
    /**
     * 根据couponCode查用户手机号码
     * @param couponCode
     * @return
     */
    public String getUserMobile(String couponCode);
    
    /**
     * 根据couponcode获取买家手机号
     */
    public String getUserMobile(String couponCode);
    
}
