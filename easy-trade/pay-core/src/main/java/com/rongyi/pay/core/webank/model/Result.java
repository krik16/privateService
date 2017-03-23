package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众请求返回结果
 * Created by sujuan on 2017/2/22.
 */
public class Result extends BaseData {

    private static final long serialVersionUID = 3075137585916558569L;
    //错误码  0成功 其它失败
    private String errno ;

    //提示信息
    private String errmsg ;

    public String getErrno() {
        return errno;
    }

    public void setErrno(String errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
