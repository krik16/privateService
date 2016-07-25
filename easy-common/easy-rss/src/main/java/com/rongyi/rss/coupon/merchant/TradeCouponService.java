package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.vo.CouponGeneralVO;

import java.util.List;

/**
 * Description: 给交易使用的接口
 * Author: 袁波
 * DATE: 2016/6/28 16:19
 * Package:com.rongyi.rss.coupon.merchant
 * Project:easy-market
 */
public interface TradeCouponService {
    public List<CouponGeneralVO> jugeGeneralByIds(List<String> couponIds);
}
