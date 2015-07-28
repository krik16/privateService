package com.rongyi.rss.coupon.merchant;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.page.QueryParam;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/28 11:03.
 */
public interface ROAMerchantCouponService {
    /**
     *卡券通用查询接口
     * @param queryParam
     * @return
     */
    public PagingVO<Coupon> getCouponByPageMysql(QueryParam queryParam);

    /**
     * 导入第三方码的时候，首先先新建一个空的卡券
     * @return
     */
    public int insertCoupon();
}
