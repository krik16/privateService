package com.rongyi.pay.core.ali.service.request;

import com.alipay.api.AlipayObject;
import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.rongyi.pay.core.ali.service.response.AlipayTradeCreateResponse;

import java.util.Map;

/**
 * 统一收单交易创建请求
 * conan
 * 2016/11/4 14:33
 **/
public class AlipayTradeCreateRequest implements AlipayRequest<AlipayTradeCreateResponse> {

    private AlipayHashMap udfParams;
    private String apiVersion = "1.0";
    private String bizContent;
    private String terminalType;
    private String terminalInfo;
    private String prodCode;
    private String notifyUrl;

    public AlipayTradeCreateRequest() {
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public String getBizContent() {
        return this.bizContent;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public String getReturnUrl() {
        return null;
    }

    @Override
    public void setReturnUrl(String s) {

    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    public String getTerminalInfo() {
        return this.terminalInfo;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdCode() {
        return this.prodCode;
    }

    public String getApiMethodName() {
        return "alipay.trade.create";
    }

    public Map<String, String> getTextParams() {
        AlipayHashMap txtParams = new AlipayHashMap();
        txtParams.put("biz_content", this.bizContent);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }

        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if(this.udfParams == null) {
            this.udfParams = new AlipayHashMap();
        }

        this.udfParams.put(key, value);
    }

    public Class<AlipayTradeCreateResponse> getResponseClass() {
        return AlipayTradeCreateResponse.class;
    }

    @Override
    public boolean isNeedEncrypt() {
        return false;
    }

    @Override
    public void setNeedEncrypt(boolean b) {

    }

    @Override
    public AlipayObject getBizModel() {
        return null;
    }

    @Override
    public void setBizModel(AlipayObject alipayObject) {

    }
}
