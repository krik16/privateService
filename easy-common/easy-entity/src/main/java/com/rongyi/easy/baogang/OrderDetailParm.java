package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/12/25.
 */
public class OrderDetailParm implements Serializable {
    private String code;
    private String goods;
    private String number;
    private String amount;
    private String category;
    private String price;
    private String tax;

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
