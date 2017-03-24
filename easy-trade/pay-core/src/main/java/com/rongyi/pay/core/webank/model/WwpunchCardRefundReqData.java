package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

import java.math.BigDecimal;

/**
 * 微众微信刷卡支付退款/退款查询 接口请求参数
 * Created by sujuan on 2017/2/27.
 */
public class WwpunchCardRefundReqData extends BaseData{

    private static final long serialVersionUID = 5365766204382774093L;
    //商户号 必填
    private String merchant_code;

    //终端号
    private String terminal_code;

    //商户订单号 必填
    private String terminal_serialno ;

    //金额 元 （退款必填）
    private BigDecimal refund_amount ;

    //微众银行订单号
    private String orderid;

    //签名
    private String sign ;

    public String getMerchant_code() {
        return merchant_code;
    }

    public void setMerchant_code(String merchant_code) {
        this.merchant_code = merchant_code;
    }

    public String getTerminal_code() {
        return terminal_code;
    }

    public void setTerminal_code(String terminal_code) {
        this.terminal_code = terminal_code;
    }

    public String getTerminal_serialno() {
        return terminal_serialno;
    }

    public void setTerminal_serialno(String terminal_serialno) {
        this.terminal_serialno = terminal_serialno;
    }

    public BigDecimal getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(BigDecimal refund_amount) {
        this.refund_amount = refund_amount;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
