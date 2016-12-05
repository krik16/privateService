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
    /**
     * 根据券ids ，返回券 是否是通用券
     * @param couponIds
     * @return
     */
    public List<CouponGeneralVO> jugeGeneralByIds(List<String> couponIds);

    /**
     * 根据店铺id，查询关联该店铺的所有卡券
     * @param shopId
     * @return
     */
    public List<Coupon> findByShopId(String shopId);
}
