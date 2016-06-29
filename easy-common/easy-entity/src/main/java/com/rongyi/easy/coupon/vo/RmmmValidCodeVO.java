package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 验码成功之后的返回类
 * time ：2015年8月19日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 * 张争平                             2015年8月19日                       1.0           创建文件
 */
public class RmmmValidCodeVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer totalAmount;//核销成功数量
    private Integer status;//券码状态  验证失败[0],验证成功[1],已过期[2],已使用[3]
    private List<String> couponCodeList;//验证成功的券码集合，以逗号隔开
    private String originalPrice;// 原价
    private String currentPrice;// 现价
    private String phone;//用户名
    private String title;//券名
    private Integer type;
    private Integer point;

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<String> getCouponCodeList() {
        return couponCodeList;
    }

    public void setCouponCodeList(List<String> couponCodeList) {
        this.couponCodeList = couponCodeList;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}


