package com.rongyi.easy.baogang.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/1/16.
 */
public class MemberDetailVo implements Serializable {
    private String cardNumber;//会员卡号
    private String telephone;//手机号码
    private Integer type;//0有效 1离职

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MemberDetailVo{" +
                "cardNumber='" + cardNumber + '\'' +
                ", telephone='" + telephone + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
