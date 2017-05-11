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

    private String mchInfoId;//入驻商户id

    private String storeId;//门店id

    private String posNo;//设备号

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getMchInfoId() {
        return mchInfoId;
    }

    public void setMchInfoId(String mchInfoId) {
        this.mchInfoId = mchInfoId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }
}
