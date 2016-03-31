package com.rongyi.rss.coupon;

import com.rongyi.easy.coupon.entity.CouponCode;

import java.util.List;
import java.util.Map;

/**
 * 獲取驗證歷史記錄
 *
 * @author hebo
 */
public interface ICouponCodeService {

    /**
     * 通过couponId获取对应的券码List
     */
    List<CouponCode> getListByCouponId(Map paramsMap);

    /**
     * 更新券码表，成功返回true，失败返回false
     */
    int updateByPrimaryKeySelective(CouponCode couponCode);

    /**
     * @Description（券码） 把未领取已经过期的券码状态改为过期状态(定时任务)
     * @author yb
     */
//    public void updateAllCouponCodeValid();
    
}
