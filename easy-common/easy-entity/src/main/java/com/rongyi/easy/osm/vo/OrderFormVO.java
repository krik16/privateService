package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.OrderFormEntity;

import java.io.Serializable;

/**
 * Created by hebo on 2015/12/31.
 * 中订单VO
 */
public class OrderFormVO extends OrderFormEntity implements Serializable{

    /**
     * 支付方式 1支付宝网页  3支付宝app  5微信
     */
    private byte payChannel;
    private String orderCartNo;//购物车订单号

    public byte getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(byte payChannel) {
        this.payChannel = payChannel;
    }

    public String getOrderCartNo() {
        return orderCartNo;
    }

    public void setOrderCartNo(String orderCartNo) {
        this.orderCartNo = orderCartNo;
    }
}
