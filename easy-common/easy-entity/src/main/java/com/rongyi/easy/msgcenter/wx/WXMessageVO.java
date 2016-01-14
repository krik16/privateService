package com.rongyi.easy.msgcenter.wx;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/13 18:06
 * Package:com.rongyi.easy.msgcenter.wx
 * Project:message-center
 */
public class WXMessageVO implements Serializable{
    private String template;
    private String firstData;
    private String remarkData;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFirstData() {
        return firstData;
    }

    public void setFirstData(String firstData) {
        this.firstData = firstData;
    }

    public String getRemarkData() {
        return remarkData;
    }

    public void setRemarkData(String remarkData) {
        this.remarkData = remarkData;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WXMessageVO{");
        sb.append("template='").append(template).append('\'');
        sb.append(", firstData='").append(firstData).append('\'');
        sb.append(", remarkData='").append(remarkData).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public WXMessageVO(String template, String firstData, String remarkData) {
        this.template = template;
        this.firstData = firstData;
        this.remarkData = remarkData;
    }

    public WXMessageVO() {

    }
}
