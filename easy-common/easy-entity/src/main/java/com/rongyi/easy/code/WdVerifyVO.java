package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2017/3/21 18:22
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public class WdVerifyVO implements Serializable {
    private Integer status;
    private String message;
    private WdCouponVO data;

    public Integer getStatus() {
        return status==null?200:status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message==null?"成功":message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public WdCouponVO getData() {
        return data;
    }

    public void setData(WdCouponVO data) {
        this.data = data;
    }

    public WdVerifyVO(Integer status, String message, WdCouponVO data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public WdVerifyVO(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public WdVerifyVO() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WdVerifyVO{");
        sb.append("status=").append(status);
        sb.append(", message='").append(message).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
