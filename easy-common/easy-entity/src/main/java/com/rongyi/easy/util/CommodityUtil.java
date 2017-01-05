package com.rongyi.easy.util;

import com.rongyi.easy.mcmc.constant.CommodityConstants;

/**
 * 商品公用类
 *
 * @author wangjh7
 * @date 2016-12-06
 */
public class CommodityUtil {

    /**
     * 是否是礼品类型
     *
     * @param CommodityRange
     * @return
     */
    public static boolean isGiftType(Integer CommodityRange) {
        if (CommodityRange == CommodityConstants.CommodityType.GIFT) {
            return true;
        }
        if (CommodityRange == CommodityConstants.CommodityType.COUPON_PARKING) {
            return true;
        }
        if (CommodityRange == CommodityConstants.CommodityType.COUPON) {
            return true;
        }
        return false;
    }
}
