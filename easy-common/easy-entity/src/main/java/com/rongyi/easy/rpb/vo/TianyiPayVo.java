package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * 天翼支付请求参数
 * Created by sujuan on 2017/4/12.
 */
public class TianyiPayVo implements Serializable{
    private static final long serialVersionUID = 8140687839887009754L;

    //订单号 必传
    private String orderNo ;

    //支付成功前端回调地址 必传
    private String callBackUrl;

    //订单金额 分 必传
    private Integer totalAmount ;

    //订单类型 0:商品订单,1:优惠券订单,2:积分商城 必传
    private Integer orderType ;

    //商品描述
    private String productDesc ;

    //来源 (0:容易逛,1:微信,2:终端屏,3:福利pos,4:开放平台)
    private Byte source ;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "TianyiPayVo{" +
                "orderNo='" + orderNo + '\'' +
                ", callBackUrl='" + callBackUrl + '\'' +
                ", totalAmount=" + totalAmount +
                ", orderType=" + orderType +
                ", productDesc='" + productDesc + '\'' +
                ", source=" + source +
                '}';
    }
}
