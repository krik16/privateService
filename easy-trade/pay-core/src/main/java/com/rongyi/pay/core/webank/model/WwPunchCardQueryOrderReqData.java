package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.webank.config.WwConfigure;

/**
 * 微众微信刷卡支付查询订单接口请求参数
 * Created by sujuan on 2017/2/23.
 */
public class WwPunchCardQueryOrderReqData extends BaseData{

    //商户号 必填
    private String merchant_code;

    //终端号
    private String terminal_code;

    //商户订单号  （三个订单号必输其一）
    private String terminal_serialno;

    //微众银行订单号
    private String orderid;

    //微信支付订单号
    private String transaction_id ;

    //签名
    private String sign;

    public WwPunchCardQueryOrderReqData(String orderNo, String merchantCode) {
        setMerchant_code(merchantCode);
        setTerminal_serialno(orderNo);
    }

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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
