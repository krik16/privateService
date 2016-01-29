package com.rongyi.easy.msgcenter;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/20 17:53
 * Package:com.rongyi.easy.msgcenter
 * Project:easy-common
 */
public class CustomContent{
    private String code;
    private Integer type;

    public CustomContent(String code, Integer type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
