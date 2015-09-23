package com.rongyi.rss.coupon;


import com.rongyi.easy.coupon.old_vo.OldCouponVO;

import java.util.List;


/**
 * 容易逛代金券接口
 */
public interface MLCouponService {


    /**
     * id集合查询
     *
     * @param ids
     * @return
     */
    public List<OldCouponVO> findCouponDetailByIds(List<String> ids);

    /**
     * id集合查询（优化）
     *
     * @param ids
     * @return
     */
    public List<OldCouponVO> findCouponIndexByIds(List<String> ids);
}
