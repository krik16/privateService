package com.rongyi.rss.coupon.operation;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.coupon.param.operation.VoucherParam;

import java.util.Map;

/**
 * 代金券对外接口
 * Created by lqy on 2015/9/25.
 */
public interface RoaVoucherService {

    PagingVO<Coupon> findVouchers(VoucherParam param) throws Exception;

    Map<String, Object> getCouponList(Map<String, Object> map, int currentPage, int pageSize);

    boolean saveOrUpdateCoupon(com.rongyi.easy.coupon.entity.Coupon oldCoupon);

    com.rongyi.easy.coupon.entity.Coupon getCouponById(Integer id);

    boolean deleteCoupon(Integer id);

    boolean updateCouponStatus(Integer id, String status);
}
