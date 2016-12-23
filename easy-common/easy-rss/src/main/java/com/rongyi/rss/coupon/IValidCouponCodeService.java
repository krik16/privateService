package com.rongyi.rss.coupon;

import java.util.Map;

import com.rongyi.core.bean.ResponseResult;

/**
 * 优惠券验证相关操作
 * @author hebo
 *
 */
public interface IValidCouponCodeService {

	/**
     * 优惠券验证
     * @param couponCode
     * @param mallId
     * @param shopId
     * @param useMode
     * @param couponId
     * @return
     */
    public ResponseResult validateCouponCode(String couponCode, String mallId, String shopId, Long useMode, String couponId);
    
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
    public ResponseResult validateCouponCodeMutli(String couponCode, String mallId, String shopId, Long useMode, String couponId,Integer sellerId,Integer checkNum);
    /**
     * 提供给手机端 查询未使用券码的接口
     */
    public Map<String,Object> unusedCodeNum(String couponCode, Integer codeNum,String shopId,String mallId);
    /**
     * 根据couponCode查用户手机号码
     * @param couponCode
     * @return
     */
    public String getUserMobile(String couponCode);

    /**
     * 家得利验券接口
     * @param couponCode
     * @param mallId
     * @param shopId
     * @param useMode
     * @param couponId
     * @return
     */
    public ResponseResult validateJiadeliCouponCode(String couponCode, String mallId, String shopId, Long useMode, String couponId);
}
