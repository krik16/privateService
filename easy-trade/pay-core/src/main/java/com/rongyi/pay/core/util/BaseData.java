package com.rongyi.pay.core.util;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * conan
 * 2016/10/13 11:06
 **/
public class BaseData implements Serializable{

    private static final long serialVersionUID = 4709254213276923359L;

    private String extend;//扩展字段（多个字段含义用"__"分隔开）

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
