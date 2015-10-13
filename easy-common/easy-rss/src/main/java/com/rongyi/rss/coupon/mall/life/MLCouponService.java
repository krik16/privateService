package com.rongyi.rss.coupon.mall.life;


import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.old_vo.OldCouponVO;

import java.util.List;


/**
 * 容易逛: 秒杀活动-代金券接口
 *
 * @author Breggor
 */
public interface MLCouponService {


    /**
     * 根据id集合查询
     *
     * @param ids
     * @return
     */
    public List<OldCouponVO> findCouponVOByIds(List<String> ids);

    /**
     * 根据id查询卡券信息
     *
     * @param couponId
     * @return
     */
    Coupon findCouponById(String couponId);
}
