package com.rongyi.pay.core.webank.model.res;

import com.rongyi.pay.core.webank.model.AlipayCommonResData;

/**
 * 支付宝扫码付接口返回结果
 * Created by sujuan on 2017/3/28.
 */
public class WaScanPayResData extends AlipayCommonResData{
    //结果码
    private String retCode ;

    //结果信息
    private String retMsg ;

    //状态码
    private String subCode ;

    //状态码描述
    private String subMsg ;

    //商户订单号
    private String orderId;

    //当前预下单请求生成的二维码串
    private String qrCode ;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getExternalInfo() {
        return externalInfo;
    }

    public void setExternalInfo(String externalInfo) {
        this.externalInfo = externalInfo;
    }
}
