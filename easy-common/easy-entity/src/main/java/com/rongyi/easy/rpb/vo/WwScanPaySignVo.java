package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * 微众微信公众号支付请求参数
 * Created by sujuan on 2017/4/1.
 */
public class WwScanPaySignVo implements Serializable {
    private static final long serialVersionUID = 3046512617078974023L;
    //商户号 必传
    private String mchId;

    //商户订单号32字符内 必传
    private String orderNo ;

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

    //商品标记
    private String goodsTag ;

    //订单类型 6:福利订单,7:开放平台
    private Integer orderType;


    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}
