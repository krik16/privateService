package com.rongyi.pay.core.webank.model;

/**
 * 微众支付宝撤销订单返回结果
 * Created by sujuan on 2017/3/2.
 */
public class WaReverseTradeResData extends AlipayCommonResData{
    private static final long serialVersionUID = -6556975340781998852L;
    //结果码
    private String retCode ;

    //结果信息
    private String retMsg ;

    //业务返回码
    private String subCode ;

    //业务返回描述
    private String subMsg ;

    //支付宝交易号
    private String tradeNo;

    //微众订单号
    private String outTradeNo;

    //重试标识
    private String retryFlag ;

    //本次撤销触发的交易动作 close关闭交易，无退款 refund产生了退款
    private String action ;

    //扩展信息
    private String externalInfo ;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getRetryFlag() {
        return retryFlag;
    }

    public void setRetryFlag(String retryFlag) {
        this.retryFlag = retryFlag;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getExternalInfo() {
        return externalInfo;
    }

    public void setExternalInfo(String externalInfo) {
        this.externalInfo = externalInfo;
    }
}
