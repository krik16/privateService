package com.rongyi.easy.osm.entity;

/**
 * 商品券码表
 *
 * @author wangjh7
 * @date 2016-11-24
 */
public interface OrderCommodityCodeEntityMapper {

    /**
     * 保存
     *
     * @param entity
     * @return
     */
    int insert(OrderCommodityCodeEntity entity);

    /**
     * 超时更新
     *
     * @param entity
     * @return
     */
    int uptStatusForTimeOut(OrderCommodityCodeEntity entity);


    /**
     * 领取更新
     *
     * @param entity
     * @return
     */
    int uptStatusForUsed(OrderCommodityCodeEntity entity);

    /**
     * 获取商品卡券信息
     *
     * @param couponCode
     * @return
     */
    OrderCommodityCodeEntity getInfoByCouponCode(String couponCode);
}
