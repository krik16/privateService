package com.rongyi.easy.tms.vo.v2;

import com.rongyi.easy.rmmm.vo.ParentOrderVO;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * kejun
 * 2016/4/11 17:40
 **/
public class SubOrderDetailVO extends ParentOrderVO implements Serializable{

    private static final long serialVersionUID = -7289308809195411230L;

    private BigDecimal commidityTotalPice;//商品总价

    private BigDecimal commiditySumTotalPice;//商品合计总价

    private BigDecimal orderTotalPrice;//订单总价

    private BigDecimal couponDiscountPrice;//卡券抵扣金额

    public BigDecimal getCommidityTotalPice() {
        return commidityTotalPice;
    }

    public void setCommidityTotalPice(BigDecimal commidityTotalPice) {
        this.commidityTotalPice = commidityTotalPice;
    }

    public BigDecimal getCommiditySumTotalPice() {
        return commiditySumTotalPice;
    }

    public void setCommiditySumTotalPice(BigDecimal commiditySumTotalPice) {
        this.commiditySumTotalPice = commiditySumTotalPice;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public BigDecimal getCouponDiscountPrice() {
        return couponDiscountPrice;
    }

    public void setCouponDiscountPrice(BigDecimal couponDiscountPrice) {
        this.couponDiscountPrice = couponDiscountPrice;
    }
}
