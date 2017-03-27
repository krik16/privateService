package com.rongyi.easy.rpb.vo.v6;

import com.rongyi.easy.rpb.domain.PaymentEntity;

import java.io.Serializable;

/**
 * conan
 * 2017/3/15 15:07
 **/
public class PaymentEntityVo extends PaymentEntity implements Serializable{

    private static final long serialVersionUID = -8426312627749811666L;

    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
