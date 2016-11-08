package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * 宝钢验证会员调用参数
 * Created by shaozhou on 2016/11/4.
 */
public class VerifyMemberParam implements Serializable {
    private String cardNumber;//会员卡号 或 会员手机号【短信验证码时不可为空，一维码、动态识别码时可为空】
    private String verificationCode;//会员验证码【手机短信验证码（获取积分交易短信验证码接口）、一维码、动态识别码等】
    private String channel;//渠道编号
    private Long timeStamp;//时间戳
    private String sign;//签名
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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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
                ", channel='" + channel + '\'' +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
