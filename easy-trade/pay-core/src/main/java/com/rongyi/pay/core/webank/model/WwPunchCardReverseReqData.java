package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;

import java.math.BigDecimal;

/**
 * 微众微信刷卡支付撤销订单接口请求参数
 * Created by sujuan on 2017/2/24.
 */
public class WwPunchCardReverseReqData extends BaseData{

    //商户号 必填
    private String merchant_code;

    //终端号  必填
    private String terminal_code;

    //重新生成的商户订单号 必填
    private String terminal_serialno ;

    //原商户订单号      必填
    private String o_terminal_serialno ;

    //金额    必填
    private BigDecimal amount ;

    //签名
    private String sign;

    public WwPunchCardReverseReqData(){

    }

    public WwPunchCardReverseReqData(WwPunchCardPayParam payParam) {
        setMerchant_code(payParam.getMerchantCode());
        setTerminal_code(payParam.getTerminalCode());
        setO_terminal_serialno(payParam.getOrderNo());
        setAmount(payParam.getAmount());
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

    public String getO_terminal_serialno() {
        return o_terminal_serialno;
    }

    public void setO_terminal_serialno(String o_terminal_serialno) {
        this.o_terminal_serialno = o_terminal_serialno;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
