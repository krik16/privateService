package com.rongyi.easy.mcmc.constant;

/**
 * 商品常量类
 *
 * @author yaoyiwei
 * @date 2016-11-27
 * @version 1.0
 *
 */
public interface CommodityConstants {

    interface CommodityType {
        int COMMODITY = 0;
        int GIFT = 1;
        int COUPON = 2;
        int COUPON_PARKING = 3;
        int HAIXIN = 4;
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

    interface Spec {
        String HAIXIN_SPEC_NAME = "规格";
    }


    /**
     * 商品 更新 Solr_Index操作状态
     */
    interface CommodityIndexOp{
        int Add_Index = 0;//添加
        int Update_Index = 1;//更新
        int Del_Index=2;//删除


    }

}
