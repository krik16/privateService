package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;

/**
 * 优惠券验证相关操作
 * @author hebo
 *
 */
public interface IValidCouponCodeService {

	/**
     * 优惠券验证
     * @param orderNo
     * @param mallId
     * @param shopId
     * @param useMode
     * @param checkNum
     * @return
     */
    public ResponseResult validateCouponCode(String orderNo, String mallId, String shopId, Long useMode, Integer checkNum);
    
}
