package com.rongyi.easy.roa.param;

import com.rongyi.easy.base.param.BaseParam;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 用户端创建订单参数
 * conan
 * 2016/11/8 15:46
 **/
public class UserCreateOrderParam extends BaseParam{

    private String orderNo;//订单号

    private Integer mchInfoId;//入住商户id

    private Long payAmount;//支付金额

    private Integer paymentType;//支付方式    1 微信    2 支付宝

    private String openId;  //openId

    private String aliBuyerId;//支付宝用户id

    private Integer payScene;//支付场景(1:移动设备,2:扫码支付)

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getMchInfoId() {
        return mchInfoId;
    }

    public void setMchInfoId(Integer mchInfoId) {
        this.mchInfoId = mchInfoId;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
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

    public Integer getPayScene() {
        return payScene;
    }

    public void setPayScene(Integer payScene) {
        this.payScene = payScene;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
