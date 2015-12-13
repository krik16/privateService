package com.rongyi.easy.roa.vo;


import com.rongyi.easy.coupon.entity.Coupon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 订单详情VO类
 *
 * @author LiuChao
 */

public class OrderDetailVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer tradeStatus;// 交易状态

    private String orderTime;// 下单时间

    private String payTime;// 付款时间

    private BigDecimal unitPrice;// 单价

    private Integer unitNum;// 下单数量

    private BigDecimal orderPrice;// 下单总价

    private String itemName; // 商品名称

    private Coupon coupon; //卡券信息

    private List<ActivityDetailVO> codeList; // 本订单所含的优惠券信息

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public List<ActivityDetailVO> getActivityDetailVOs() {
        return codeList;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }



    public List<ActivityDetailVO> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<ActivityDetailVO> codeList) {
        this.codeList = codeList;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }
}
