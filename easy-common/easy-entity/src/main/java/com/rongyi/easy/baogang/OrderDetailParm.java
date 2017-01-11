package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/12/25.
 */
public class OrderDetailParm implements Serializable {
    private String code;//商品编号（唯一识别码）
    private String goods;//商品名称
    private String number;//商品数量(2位小数)
    private String amount;//实收金额（单位：元 2位小数）
    private String category;//商品品类【用于商家返佣，0000:不计算返佣 ，需计算返佣则需要与睿渠平台协商提供品类编号】
    private String price;//应收金额（单位：元 2位小数）
    private String tax;//税率【保留2位小数。商品返佣计算含税则填0，不含税则按商品实际税点填写。】

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "OrderDetailParm{" +
                "code='" + code + '\'' +
                ", goods='" + goods + '\'' +
                ", number='" + number + '\'' +
                ", amount='" + amount + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }
}
