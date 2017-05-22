package com.rongyi.easy.roa.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * conan
 * 2016/11/9 14:02
 **/
public class UserScanPaySignParam{


    private String orderNo;//订单号

    private Integer paymentType;//付款方式  1 微信 2 支付宝

    private Integer payScene;//支付场景(0:移动设备,1:扫码支付)

    private Integer payAmount;//支付金额

    private String openId;//微信openId

    private String aliBuyerId;//支付宝买家id

    private String extend;//扩展字段（多个字段含义用"__"分隔开）

    private String memo ; //备注

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getPayScene() {
        return payScene;
    }

    public void setPayScene(Integer payScene) {
        this.payScene = payScene;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAliBuyerId() {
        return aliBuyerId;
    }

    public void setAliBuyerId(String aliBuyerId) {
        this.aliBuyerId = aliBuyerId;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
