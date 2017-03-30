package com.rongyi.pay.core.webank.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众微公众号支付请求参数
 * Created by sujuan on 2017/3/24.
 */
public class WwScanPayParam extends BaseData{
    //商户号 必传
    private String mchId;

    //商户订单号32字符内 必传
    private String outTradeNo ;

    //商品描述 必传
    private String body ;

    //用户Openid(微信用户关注商户公众号的Openid) 必传
    private String subOpenid;

    //商户appId 必传
    private String subAppid ;

    //附加信息
    private String attach ;

    //总金额 分为单位 必传
    private int totalFee ;

    //订单生成时间
    private String timeStart ;

    //订单超时时间
    private String timeExpire ;

    //商品标记
    private String goodsTag ;

    //收款商户微信账号id (请求微众接口不需要此参数 给初始化订单加的参数)
    private String wechatMchId;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubOpenid() {
        return subOpenid;
    }

    public void setSubOpenid(String subOpenid) {
        this.subOpenid = subOpenid;
    }

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getWechatMchId() {
        return wechatMchId;
    }

    public void setWechatMchId(String wechatMchId) {
        this.wechatMchId = wechatMchId;
    }
}
