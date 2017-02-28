package com.rongyi.core.sms.param;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/4/5
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/4/5              1.0            创建文件
 *
 */

import java.io.Serializable;

public class SmsParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 手机号码 */
    private String phone;

    /** 发送短信 必须带签名【XXXXXX】 */
    private String msgStr;

    /** 调用渠道   活动等第三方平台调用*/
     private String requestChannel;

    /** 产品类型 1 mallShop 2,Malllife  3;//ToB_业务 通知类 4;//ToB_业务 营销类*/
    private Integer productType;

    /** 发送类型 1注册，2找回密码，3登录4绑定时间 5 交易类 (不够可以加） 6商家后台 7:泊桥发送密码*/
    private Integer sendModule;

    /*请求来源IP**/
    private String requestIp;

    //发送渠道
    private String sendChannel;//

    private String code;//验证码

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMsgStr() {
        return msgStr;
    }

    public void setMsgStr(String msgStr) {
        this.msgStr = msgStr;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getSendModule() {
        return sendModule;
    }

    public void setSendModule(Integer sendModule) {
        this.sendModule = sendModule;
    }

    public String getRequestChannel() {
        return requestChannel;
    }

    public void setRequestChannel(String requestChannel) {
        this.requestChannel = requestChannel;
    }

    public String getSendChannel() {
        return sendChannel;
    }

    public void setSendChannel(String sendChannel) {
        this.sendChannel = sendChannel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SmsParam{");
        sb.append("phone='").append(phone).append('\'');
        sb.append(", msgStr='").append(msgStr).append('\'');
        sb.append(", requestChannel='").append(requestChannel).append('\'');
        sb.append(", productType=").append(productType);
        sb.append(", sendModule=").append(sendModule);
        sb.append(", requestIp='").append(requestIp).append('\'');
        sb.append(", sendChannel='").append(sendChannel).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
