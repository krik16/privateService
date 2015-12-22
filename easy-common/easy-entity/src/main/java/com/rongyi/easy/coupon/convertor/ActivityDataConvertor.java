package com.rongyi.easy.coupon.convertor;

import com.rongyi.core.framework.exception.IllegalParamterException;
import com.rongyi.easy.coupon.consts.CouponConstants;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.solr.retrival.result.ActivityData;
import org.apache.commons.collections.CollectionUtils;

/**
 * Created by Breggor on 2015/10/23.
 */
public abstract class ActivityDataConvertor {


    public static ActivityData convertFromCoupon(Coupon coupon) {
        if (coupon == null) {
            throw new IllegalParamterException("coupon is null, it can not be null");
        }
        ActivityData act = new ActivityData();
        act.setId(coupon.getId());
        act.setTitle(coupon.getName());
        act.setThumbnail(coupon.getListPicUrl());
        act.setCarouselImg(coupon.getDetailPicUrls());
        act.setGrouponPrice(String.valueOf(coupon.getCurrPrice2Double()));
        act.setGrouponOriginal(String.valueOf(coupon.getOrigPrice2Double()));
        act.setGrouponNum(String.valueOf(coupon.getTotalCount()));
        act.setStart_time(coupon.getValidStartAt());
        act.setEnd_time(coupon.getValidEndAt());
        act.setLimitPublishCount(coupon.getLimitPublishCount());
        act.setLimitUseCount(coupon.getLimitUseCount());
        act.setLimitCount(coupon.getLimitCount());// 用户限购数量
        act.setBuyedAmount(coupon.getSaledCount().toString());
        act.setUseMode(coupon.getUsageDesc());
        act.setUseRestriction(coupon.getLimitDesc());
        act.setAfterSaleService(coupon.getAfterSaleService2List());
        //抢购类型
        if (CouponConstants.CouponPurchaseType.RUSH.equals(coupon.getPurchaseType())) {
            act.setPayDownTime(900);
        } else {
            act.setPayDownTime(-1);
        }
        act.setVistedNum(coupon.getVisitedCount() == null ? "0" : coupon.getVisitedCount().toString());
        act.setRestAmount(coupon.getStockCount() + "");

        if (CouponConstants.CouponRelatedType.MALL.equals(coupon.getRelatedType())) {
            act.setHolder_type(ActivityData.HOLDER_TYPE_MALL);
            if (!CollectionUtils.isEmpty(coupon.getCouponMalls())) {
                act.setHolder_id(coupon.getCouponMalls().get(0).getMallId());
            }
        }
        if (CouponConstants.CouponRelatedType.SHOP.equals(coupon.getRelatedType())) {
            act.setHolder_type(ActivityData.HOLDER_TYPE_SHOP);
            if (!CollectionUtils.isEmpty(coupon.getCouponShops())) {
                act.setHolder_id(coupon.getCouponShops().get(0).getShopId());
            }
        }
        return act;
    }
}
