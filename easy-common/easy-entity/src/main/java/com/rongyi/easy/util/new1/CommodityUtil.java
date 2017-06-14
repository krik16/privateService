package com.rongyi.easy.util.new1;

import com.rongyi.core.constant.Identity;
import com.rongyi.easy.malllife.common.util.Utils;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.TotalCommodity;
import com.rongyi.easy.mcmc.constant.CommodityConstants;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;
import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;

/**
 * Created by zhoukunkun on 2017/4/11.
 */
public class CommodityUtil {
    /**
     * 是否是礼品类型
     *
     * @param commodityRange
     * @return
     */
    public static boolean isGiftType(Integer commodityRange) {
        if(null ==commodityRange){
            return  false;
        }
        switch (commodityRange) {
            case CommodityConstants.CommodityType.GIFT:
            case CommodityConstants.CommodityType.COUPON_PARKING:
            case CommodityConstants.CommodityType.COUPON:
                return true;
        }
        return false;
    }

    public static boolean isHaiXin(Integer commodityRange) {
        return null != commodityRange && CommodityConstants.CommodityType.HAIXIN == commodityRange;
    }

    public static boolean isNotBuyer(Integer processIdentity) {
        return null != processIdentity && Identity.BUYER != processIdentity;
    }

    /**
     * 计算折扣
     *
     * @param originalPrice
     * @param currentPrice
     * @return discount the value of discount
     * @exception
     */
    public static Double calculateDiscount(Double originalPrice, Double currentPrice) {
        try {
            if(null != originalPrice && null != currentPrice) {
                BigDecimal currentPriceBig = new BigDecimal(currentPrice);
                BigDecimal originalPriceBig = new BigDecimal(originalPrice);
                if (originalPriceBig.compareTo(new BigDecimal(0)) > 0) {
                    return currentPriceBig.divide(originalPriceBig, 2, BigDecimal.ROUND_HALF_UP)
                            .multiply(new BigDecimal(10)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
            }
            return 10.0;
        } catch(Exception e) {
            return 10.0;
        }
    }

    public static boolean isUpdateCommodity(CommodityParam param) {
        return StringUtils.isNotBlank(param.getId()) &&
                param.getType() != null && param.getType() == 1;
    }

    /**
     * 根据参数，重置identity
     * @param totalVoIdentity
     * @param userIdentity
     */
    public static Integer resetIdentity(Integer totalVoIdentity, Integer userIdentity){
        Integer identity = totalVoIdentity;
        if(null == totalVoIdentity) {
            identity = Identity.SHOP;
        }
        if(!(null != totalVoIdentity && -100 == totalVoIdentity)) {
            identity = userIdentity;
        }
        return identity;
    }

    public static boolean checkCommodityDateChanges(Commodity commodity, CommodityVO commodityVO) {
        if(commodity.getSoldOutAt() == null || commodity.getRegisterAt() == null) {
            return true;
        }

        if(commodity.getRegisterAt() != null && commodity.getSoldOutAt() != null &&
                (!commodity.getRegisterAt().equals(commodityVO.getRegisterAt()) ||
                        !commodity.getSoldOutAt().equals(commodityVO.getSoldOutAt()))) {
            return true;
        }
        return false;
    }

    /**
     * Set discount for total commodity.
     *
     * @param totalCommodity
     * @param commodity
     */
    public static void setDiscountForTotalCommodity(TotalCommodity totalCommodity, Commodity commodity) {
        Double originalPrice = (!totalCommodity.getOriginalPrice().contains("-")) ?
                Double.valueOf(totalCommodity.getOriginalPrice()) :
                Double.valueOf(commodity.getoPriceMax());

        Double currentPrice = (!totalCommodity.getCurrentPrice().contains("-")) ?
                Double.valueOf(totalCommodity.getCurrentPrice()) :
                Double.valueOf(commodity.getcPriceMax());
        totalCommodity.setDiscount(Utils.calculateDiscount(originalPrice, currentPrice));
    }

    public static boolean isSuccessUrl(String url) {
        return StringUtils.isNotBlank(url) && url.contains("/");
    }
}
