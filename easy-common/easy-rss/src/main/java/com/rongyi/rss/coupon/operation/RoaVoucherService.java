package com.rongyi.rss.coupon.operation;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.coupon.param.operation.VoucherParam;

/**
 * 代金券对外接口
 * Created by lqy on 2015/9/25.
 */
public interface RoaVoucherService {

    PagingVO<Coupon> findVouchers(VoucherParam param) throws Exception;
}
