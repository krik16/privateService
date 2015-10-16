package com.rongyi.rss.coupon;

import com.rongyi.easy.coupon.vo.UserCouponVO;

/**
 * 提供给网页用：用户优惠相关
 * @author hebo 2015/06/23
 *
 */
@Deprecated
public interface IUserCouponService {
	
	UserCouponVO getUserCouponByCouponCode(String couponCode);
	
	/**
     * 修改用户券码的有效状态（定时任务）
     * Description
     */
	@Deprecated
    public void updateUserCouponValidate();
    
}
