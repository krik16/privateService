package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Author: yb
 * DATE: 2017/3/21 18:18
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public class WdCouponVO implements Serializable {
    //券码
    private String code;
    //验证时间
    private Long verifyTime;
    //核销用户id
    private String puid;
    //核销用户的手机号
    private String mobile;
    //奖品名称
    private String prize;
    //1 已核销0 未核销2 已过期
    private Integer codeStatus;
    //店铺id
    private String storeId;

    public Long getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Long verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public Integer getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(Integer codeStatus) {
        this.codeStatus = codeStatus;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
