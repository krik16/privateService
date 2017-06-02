package com.rongyi.pay.core.ali.model.reqData;

import com.rongyi.pay.core.ali.model.ExtendParams;
import com.rongyi.pay.core.ali.model.GoodsDetail;
import com.rongyi.pay.core.util.BaseData;

import java.util.List;

/**
 * 刷卡支付参数
 * conan
 * 2016/10/31 14:21
 **/
public class AliPunchCardPayReqData extends BaseData{

    //订单号
    private String orderNo;

    //付款单号
    private String payNo;

    //支付授权码
    private String appAuthToken;

    // 支付场景，条码支付场景为bar_code
    private String scene = "bar_code";

    // 付款条码，用户支付宝钱包手机app点击“付款”产生的付款条码
    private String authCode;


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

    // 订单可打折金额，此处单位为分，精确到小数点后2位
    // 可以配合商家平台配置折扣活动，如果订单部分商品参与打折，可以将部分商品总价填写至此字段，默认全部商品可打折
    // 如果该值未传入,但传入了【订单总金额】,【不可打折金额】 则该值默认为【订单总金额】- 【不可打折金额】
    private Integer discountableAmount;

    // 订单不可打折金额，此处单位为分，精确到小数点后2位，可以配合商家平台配置折扣活动，如果酒水不参与打折，则将对应金额填写至此字段
    // 如果该值未传入,但传入了【订单总金额】,【打折金额】,则该值默认为【订单总金额】-【打折金额】
    private Integer undiscountableAmount;

    // 商品明细列表，需填写购买商品详细信息，
    private List<GoodsDetail> goodsDetailList;

    // 商户操作员编号，添加此参数可以为商户操作员做销售统计
    private String operatorId;


    // 支付宝商家平台中配置的商户门店号，详询支付宝技术支持
    private String alipayStoreId;

    // 商户机具终端编号，当以机具方式接入支付宝时必传，详询支付宝技术支持
    private String terminalId;

    // 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
    private ExtendParams extendParams;

    // (推荐使用，相对时间) 支付超时时间，5m 5分钟
    private String timeoutExpress;


    private String mchInfoId;//商户号

    private String posNo;//设备号

    private String attach;//附加信息

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
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

    public Integer getDiscountableAmount() {
        return discountableAmount;
    }

    public void setDiscountableAmount(Integer discountableAmount) {
        this.discountableAmount = discountableAmount;
    }

    public Integer getUndiscountableAmount() {
        return undiscountableAmount;
    }

    public void setUndiscountableAmount(Integer undiscountableAmount) {
        this.undiscountableAmount = undiscountableAmount;
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

    public List<GoodsDetail> getGoodsDetailList() {
        return goodsDetailList;
    }

    public void setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
        this.goodsDetailList = goodsDetailList;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getAlipayStoreId() {
        return alipayStoreId;
    }

    public void setAlipayStoreId(String alipayStoreId) {
        this.alipayStoreId = alipayStoreId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public ExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(ExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    public String getMchInfoId() {
        return mchInfoId;
    }

    public void setMchInfoId(String mchInfoId) {
        this.mchInfoId = mchInfoId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }
}
