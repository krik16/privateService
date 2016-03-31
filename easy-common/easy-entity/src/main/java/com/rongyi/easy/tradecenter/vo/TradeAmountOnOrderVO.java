package com.rongyi.easy.tradecenter.vo;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author: ZhengYl
 * Description:  统计卖家在途交易额（已发货，但未完成的订单金额，扣去退款金额（虽然目前没有退款））
 * time:  2016/2/26
 * History: 变更记录       
 *
 */

import java.io.Serializable;

public class TradeAmountOnOrderVO implements Serializable {

    private static final long serialVersionUID = -6713930895276147870L;

    /**
     *  在途交易额
     */
    private Double onOrderAmount;

    public Double getOnOrderAmount() {
        return onOrderAmount;
    }

    public void setOnOrderAmount(Double onOrderAmount) {
        this.onOrderAmount = onOrderAmount;
    }
}
