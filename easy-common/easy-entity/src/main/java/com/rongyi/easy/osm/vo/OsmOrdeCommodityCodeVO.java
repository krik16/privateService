package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.OrderCommodityCodeEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 商品券码列表（适用电子会员）
 *
 * @author wangjh7
 * @date 2016-11-28
 */
public class OsmOrdeCommodityCodeVO implements Serializable {

    // 订单列表
    private List<OrderCommodityCodeEntity> orderCommodityCodeList;

    public List<OrderCommodityCodeEntity> getOrderCommodityCodeList() {
        return orderCommodityCodeList;
    }

    public void setOrderCommodityCodeList(List<OrderCommodityCodeEntity> orderCommodityCodeList) {
        this.orderCommodityCodeList = orderCommodityCodeList;
    }

    @Override
    public String toString() {
        return "OsmOrdeCommodityCodeVO{" +
                "orderCommodityCodeList=" + orderCommodityCodeList +
                '}';
    }
}
