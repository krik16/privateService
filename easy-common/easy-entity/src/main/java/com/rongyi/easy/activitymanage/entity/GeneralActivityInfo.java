package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;

/**
 * 通用活动信息
 *
 * @author wangjh7
 * @date 2017-05-04
 **/
public class GeneralActivityInfo implements Serializable {
    // 活动价格
    private double price;
    //  活动名称
    private String name;
    /***
     * 订单自动关闭时间:分钟
     */
    private int orderCloseTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderCloseTime() {
        return orderCloseTime;
    }

    public void setOrderCloseTime(int orderCloseTime) {
        this.orderCloseTime = orderCloseTime;
    }

    @Override
    public String toString() {
        return "GeneralActivityInfo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", orderCloseTime=" + orderCloseTime +
                '}';
    }
}
