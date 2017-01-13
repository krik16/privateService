package com.rongyi.pay.core.wechat.model;

import com.rongyi.pay.core.util.BaseData;

/**
 * 下载对账单返回参数
 * conan
 * 2016/10/11 14:49
 **/
public class DownloadBillResData  extends BaseData {

    //协议层
    private String return_code = "";
    private String return_msg = "";

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }
}
