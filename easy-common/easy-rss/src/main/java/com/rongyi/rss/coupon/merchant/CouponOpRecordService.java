package com.rongyi.rss.coupon.merchant;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.CouponOpRecord;

import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/8/8 17:22
 * Package:com.rongyi.rss.coupon.merchant
 * Project:easy-market
 */
public interface CouponOpRecordService {
    public int insert(CouponOpRecord couponOpRecord);

    public PagingVO<CouponOpRecord> findByPage(String mallId, Integer pageNo, Integer pageSize);
}
