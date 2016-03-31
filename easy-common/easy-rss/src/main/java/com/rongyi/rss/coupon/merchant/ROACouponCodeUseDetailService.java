package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.vo.merchant.CouponCodeUseDetailVO;
import com.rongyi.easy.coupon.vo.merchant.MerchantPaging;
import com.rongyi.easy.page.QueryParam;

import java.util.List;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/9/10 19:46.
 */
public interface ROACouponCodeUseDetailService {
    public MerchantPaging<CouponCodeUseDetailVO> findUseDetailsByPage(QueryParam queryParam);

    public List<CouponCodeUseDetailVO> findUseDetailsByCouponId(String couponId);
}
