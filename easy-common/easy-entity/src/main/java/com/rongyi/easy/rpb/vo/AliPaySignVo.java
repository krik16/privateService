package com.rongyi.easy.rpb.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * conan
 * 2017/2/7 17:08
 **/
public class AliPaySignVo extends BaseBizVo implements Serializable {

    private static final long serialVersionUID = -825461632805396552L;
    //支付授权码
    private String appAuthToken;

    // 买家的支付宝唯一用户号（2088开头的16位纯数字）,和buyerLogonId不能同时为空
    private String buyerId;

    // 买家支付宝账号，和buyerId不能同时为空
    private String buyerLogonId;

    // 商户网站订单系统中唯一订单号，64个字符以内，只能包含字母、数字、下划线，
    // 需保证商户系统端不能重复，建议通过数据库sequence生成，
    private String orderNo;


    // 订单总金额，整形，此处单位为分，不能超过1亿元
    // 如果同时传入了【打折金额】,【不可打折金额】,【订单总金额】三者,则必须满足如下条件:【订单总金额】=【打折金额】+【不可打折金额】
    private Integer totalAmount;

    // 订单标题，粗略描述用户的支付目的。如“喜士多（浦东店）消费”
    private String subject;

    // 订单描述，可以对交易或商品进行一个详细地描述，比如填写"购买商品2件共15.00元"
    private String body;

    // 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持
    private String storeId;

/*    #################################################### 以上为必填   */

    // 卖家支付宝账号ID，用于支持一个签约账号下支持打款到不同的收款账号，(打款到sellerId对应的支付宝账号)
    // 如果该字段为空，则默认为与支付宝签约的商户的PID，也就是appid对应的PID
    private String sellerId;

    // (推荐使用，相对时间) 支付超时时间，5m 5分钟
    private String timeoutExpress;

    private Integer orderType;//订单类型

    private String posNo;//设备号

    //备注
    private String  memo ;

    private String mchInfoId;

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getMchInfoId() {
        return mchInfoId;
    }

    public void setMchInfoId(String mchInfoId) {
        this.mchInfoId = mchInfoId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}

