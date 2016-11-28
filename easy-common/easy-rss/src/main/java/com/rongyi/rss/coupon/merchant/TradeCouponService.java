package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.vo.CouponGeneralVO;

import java.util.List;

/**
 * Description: 对外dubbo 接口
 * Author: yb
 * DATE: 2016/6/28 16:19
 * Package:com.rongyi.rss.coupon.merchant
 * Project:easy-market
 */
public interface TradeCouponService {
    public List<CouponGeneralVO> jugeGeneralByIds(List<String> couponIds);

    public List<Coupon> findByShopId(String shopId);
}
