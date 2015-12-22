package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.OrderCartFormEntity;

/**
 * Created by kejun on 2015/12/22.
 */
public class OrderCartFormVO extends OrderCartFormEntity {

    /**
     * 是否是购物车订单
     */
    private boolean isCartOrder;

    public boolean isCartOrder() {
        return isCartOrder;
    }

    public void setIsCartOrder(boolean isCartOrder) {
        this.isCartOrder = isCartOrder;
    }
}
