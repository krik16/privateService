package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * 业务基础参数
 * conan
 * 2017/5/2 10:36
 **/
public class BaseBizVo  implements Serializable{

    private static final long serialVersionUID = -3662175943734686657L;
    private String extend;//扩展字段（多个字段含义用"__"分隔开）

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}
