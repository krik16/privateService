package com.rongyi.easy.roa.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * conan
 * 2016/11/10 17:30
 **/
public class WechatAuthParam {

    private Integer mchInfoId;

    public Integer getMchInfoId() {
        return mchInfoId;
    }

    public void setMchInfoId(Integer mchInfoId) {
        this.mchInfoId = mchInfoId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
