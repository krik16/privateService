package com.rongyi.rss.coupon.merchant;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.vo.merchant.CouponCodeUseDetailVO;
import com.rongyi.easy.page.QueryParam;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/9/10 19:46.
 */
public interface ROACouponCodeUseDetailService {
    public PagingVO<CouponCodeUseDetailVO> findUseDetailsByPage(QueryParam queryParam);
}
