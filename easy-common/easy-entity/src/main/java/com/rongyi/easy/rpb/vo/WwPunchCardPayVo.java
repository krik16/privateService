package com.rongyi.easy.rpb.vo;

/**
 * 微众微信刷卡支付业务参数
 * conan
 * 2017/2/27 13:49
 **/
public class WwPunchCardPayVo {
    //商户号 必填
    private String merchantCode ;

    //终端号 必填
    private String terminalCode="defaultNo";

    //商户订单号 必填
    private String orderNo;

    //金额（分）必填
    private Integer amount;

    //商品描述   必填
    private String product;

    //授权码 必填
    private String authCode;

    //用户OpendId
    private String openid;

    //商户appid
    private String subAppid;

    //商品标记
    private String goodsTag;

    //附加信息
    private String attach ;

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }
}
