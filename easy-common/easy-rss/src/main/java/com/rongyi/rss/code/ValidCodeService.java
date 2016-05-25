package com.rongyi.rss.code;

import com.rongyi.easy.code.ValidCouponVO;

/**
 * Description: 验码接口
 * Author: 袁波
 * DATE: 2016/5/25 19:46
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface ValidCodeService {

    /**
     * 验证券码
     * @param couponCode
     * @param shopId
     * @param mallId
     * @param identity
     * @return
     */
    public ValidCouponVO validSearchCoupon(String couponCode, String shopId, String mallId, Integer identity);
}
