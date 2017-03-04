package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众支付宝获取访问令牌返回结果
 * Created by sujuan on 2017/3/3.
 */
public class WaAccessTokenResData extends BaseData{
    //请求结果码
    private String code;

    //请求结果信息
    private String msg ;

    //请求时间
    private String transactionTime ;

    //token
    private String access_token ;

    //失效的绝对时间戳
    private String expire_time ;

    //token最大生存时间
    private String expire_in ;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(String expire_time) {
        this.expire_time = expire_time;
    }

    public String getExpire_in() {
        return expire_in;
    }

    public void setExpire_in(String expire_in) {
        this.expire_in = expire_in;
    }
}
