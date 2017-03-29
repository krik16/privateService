package com.rongyi.easy.rpb.dto;

/**
 * conan
 * 2017/3/29 14:15
 **/
public class PosBankSynNotifyDto extends BaseDto{

    private static final long serialVersionUID = -8528951045168028524L;
    private String orderNo;//订单号

    private  Long payAmount;//支付金额

    private String paymentNo;//支付流水

    private  String bankType;//付款银行

    private  String accountNo;//付款账号

    private String paymentTypeStr;//付款类型 //支付方式    0 银行卡    1 微信    2 支付宝  3 现金 4 储值卡 5 积分退款


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPaymentTypeStr() {
        return paymentTypeStr;
    }

    public void setPaymentTypeStr(String paymentTypeStr) {
        this.paymentTypeStr = paymentTypeStr;
    }
}
