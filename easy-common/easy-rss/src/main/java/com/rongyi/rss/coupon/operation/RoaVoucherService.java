package com.rongyi.rss.coupon.operation;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.OldCoupon;
import com.rongyi.easy.coupon.param.CouponQueryParam;

import java.util.Map;

/**
 * 代金券对外接口
 * Created by lqy on 2015/9/25.
 */
public interface RoaVoucherService {

    PagingVO<Coupon> findVouchers(CouponQueryParam param) throws Exception;

    Map<String, Object> getCouponList(Map<String, Object> map, int currentPage, int pageSize);

    boolean saveOrUpdateCoupon(OldCoupon oldCoupon);

    OldCoupon getCouponById(String id);

    boolean deleteCoupon(String id);

    boolean updateCouponStatus(String id, String status);
}
