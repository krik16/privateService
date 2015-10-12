package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.coupon.entity.Coupon;

/**
 * 新版卡券接口
 */
public interface RoaCouponService {


    ResponseVO subtractInventory(String couponId);

    Coupon findById(String couponId);
}
