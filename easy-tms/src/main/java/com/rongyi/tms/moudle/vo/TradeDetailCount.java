/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月27日下午2:32:00
 * @Description: TODO
 *
 **/

package com.rongyi.tms.moudle.vo;

import java.io.Serializable;

/**	
 * @Author:  柯军
 * @Description: 交易记录总数统计
 * @datetime:2015年5月27日下午2:32:00
 *
 **/

public class TradeDetailCount implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 7353551321731492554L;
    
    /**
     * 总条数
     */
    private Long totalCount;
    
    /**
     * 总金额
     */
    private Double amountCount;
    
    /**
     * 交易类型（0：收入，1：支出（退款和异常支付））
     */
    private Integer tradeType;

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Double getAmountCount() {
        return amountCount;
    }

    public void setAmountCount(Double amountCount) {
        this.amountCount = amountCount;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

}
