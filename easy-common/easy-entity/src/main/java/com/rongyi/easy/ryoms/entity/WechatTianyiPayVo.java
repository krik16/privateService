package com.rongyi.easy.ryoms.entity;

import java.io.Serializable;

/**
 * 服务号天翼支付配置
 * Created by sujuan on 2017/4/11.
 */
public class WechatTianyiPayVo implements Serializable{
    private static final long serialVersionUID = -1202434371926843021L;
    private Integer id;

    private Integer wechatId;

    private String merchatId;

    private String merchatKey;

    private String merchatPwd;

    private Integer isDisabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWechatId() {
        return wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    public String getMerchatId() {
        return merchatId;
    }

    public void setMerchatId(String merchatId) {
        this.merchatId = merchatId;
    }

    public String getMerchatKey() {
        return merchatKey;
    }

    public void setMerchatKey(String merchatKey) {
        this.merchatKey = merchatKey;
    }

    public String getMerchatPwd() {
        return merchatPwd;
    }

    public void setMerchatPwd(String merchatPwd) {
        this.merchatPwd = merchatPwd;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    @Override
    public String toString() {
        return "WechatTianyiPayVo{" +
                "id=" + id +
                ", wechatId=" + wechatId +
                ", merchatId='" + merchatId + '\'' +
                ", merchatKey='" + merchatKey + '\'' +
                ", merchatPwd='" + merchatPwd + '\'' +
                ", isDisabled=" + isDisabled +
                '}';
    }
}
