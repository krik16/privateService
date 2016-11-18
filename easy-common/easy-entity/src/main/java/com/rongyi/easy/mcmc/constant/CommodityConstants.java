package com.rongyi.easy.mcmc.constant;

/**
 * 商品常量类
 *
 * @author yaoyiwei
 * @date 2016-11-14
 * @version 1.0
 *
 */
public interface CommodityConstants {

    interface CommodityType {
        int COMMODITY = 0;
        int GIFT = 1;
    }

    interface ExchangeType {
        int EXCHANGE = 1;
        int BUY = 2;
    }

    interface SelfType {
        int PUBLIC_FACILITIES = 1;
        int SPECIFIC_SHOP = 2;
    }

    interface PointType {
        int ALL = 1;
        int LEVEL = 2;
    }

    interface BuyType {
        int ALL = 1;
        int LEVEL = 2;
    }

    interface DeliveryType {
        int SELF_PICK = 1;
        int DELIVERY = 2;
    }

}
