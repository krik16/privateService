package com.rongyi.rss.coupon.merchant;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.merchant.vo.MerchantCouponListParam;
import com.rongyi.easy.page.QueryParam;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 13:24.
 */
public interface MerchantCouponServce {

    /**
     * 商家卡券管理后台查询卡券列表
     * @param queryParam
     * @return
     */
    public PagingVO<Coupon> getCouponByPage(QueryParam queryParam);

    /**
     * 商家优惠券，新增，修改，审核，删除等操作
     * @param coupon
     * @return
     */
    public int updateCoupon(Coupon coupon);
}
