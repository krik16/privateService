package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * 宝钢验证会员调用参数
 * Created by shaozhou on 2016/11/4.
 */
public class VerifyMemberParam implements Serializable {
    private String cardNumber;//会员卡号 或 会员手机号【短信验证码时不可为空，一维码、动态识别码时可为空】
    private String verificationCode;//会员验证码【手机短信验证码（获取积分交易短信验证码接口）、一维码、动态识别码等】
    private Integer channel;//目的渠道 1宝钢
    private Long timeStamp;//时间戳
    private String sign;//签名
    private Integer source;//源渠道 1家得利
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "VerifyMemberParam{" +
                "cardNumber='" + cardNumber + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                ", channel=" + channel +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                ", source=" + source +
                '}';
    }
}
