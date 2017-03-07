package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * 商户配置信息
 * conan
 * 2017/2/9 11:09
 **/
public class RyMchVo implements Serializable {

    private static final long serialVersionUID = -4572796585429693594L;
    private String ryMchId;//容易网商户号

    private String ryAppId;//容易网应用号

    private Byte source;//来源(0:容易逛,1:微信,2:终端屏,3:福利pos)

    private Byte orgChannel;//服务商渠道(0:容易网,1:微众)

    public String getRyMchId() {
        return ryMchId;
    }

    public void setRyMchId(String ryMchId) {
        this.ryMchId = ryMchId;
    }

    public String getRyAppId() {
        return ryAppId;
    }

    public void setRyAppId(String ryAppId) {
        this.ryAppId = ryAppId;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Byte getOrgChannel() {
        return orgChannel;
    }

    public void setOrgChannel(Byte orgChannel) {
        this.orgChannel = orgChannel;
    }
}
