package com.rongyi.easy.coupon.entity;

import com.rongyi.core.util.Util;

import java.io.Serializable;

/**
 * 简单券实体
 *
 * @author wangjh7
 * @date 2016-08-04
 */
public class SimpleCouponEntity implements Serializable {

    public SimpleCouponEntity() {
        super();
    }

    /**
     * 短链接
     */
    private String shortCode;
    /**
     * 密码
     */
    private String password;
    /**
     * 劵码
     */
    private String codeSn;
    /**
     * 状态
     */
    private String status;

    public String getCodeSn() {
        return codeSn;
    }

    public void setCodeSn(String codeSn) {
        this.codeSn = codeSn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SimpleCouponEntity{" +
                "codeSn='" + Util.hideString(codeSn) + '\'' +
                ", shortCode='" + shortCode + '\'' +
                ", password='" + Util.hideString(password) + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
