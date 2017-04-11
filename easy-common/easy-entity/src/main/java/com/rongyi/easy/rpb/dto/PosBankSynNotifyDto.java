package com.rongyi.easy.rpb.dto;

/**
 * conan
 * 2017/3/29 14:15
 **/
public class PosBankSynNotifyDto extends BaseDto{

    private static final long serialVersionUID = -8528951045168028524L;


    private String ryMchId;//容易网商户号

    private String  ryAppId;//容易网应用号

    private String source;//来源(0:容易逛,1:微信,2:终端屏,3:福利pos,4:外部渠道)

    private String timeStamp;//时间戳

    private String sign;//签名串

    private String orderNo;//订单号

    private  Integer payAmount;//支付金额

    private String paymentNo;//支付流水

    private  String bankType;//付款银行

    private  String accountNo;//付款账号

    private String paymentTypeStr;//付款类型 //支付方式    0 银行卡    1 微信    2 支付宝  3 现金 4 储值卡 5 积分退款

    private Integer type;//0：支付，1:退款

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
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

    public String getRyMchId() {
        return ryMchId;
    }

    public void setRyMchId(String ryMchId) {
        this.ryMchId = ryMchId;
    }

    public String getRyAppId() {
        return ryAppId;
    }

    public void setRyAppId(String ryAppId) {
        this.ryAppId = ryAppId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
