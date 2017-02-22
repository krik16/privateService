package com.rongyi.pay.core.webank.model;

/**
 * 微众请求返回结果
 * Created by sujuan on 2017/2/22.
 */
public class Result {

    //错误码  0成功 其它失败
    private Integer errno ;

    //提示信息
    private String errmsg ;

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
