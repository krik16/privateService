package com.rongyi.easy.msgcenter.wx;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/12 11:20
 * Package:com.rongyi.easy.message.entity
 * Project:message-center
 */
public class TemplateData implements Serializable {
    private String value;
    private String color;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TemplateData() {
    }

    public TemplateData(String value, String color) {
        this.value = value;
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TemplateData{");
        sb.append("value='").append(value).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
