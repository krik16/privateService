package com.rongyi.easy.msgcenter.wx;

import java.io.Serializable;
import java.util.Map;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/12 11:19
 * Package:com.rongyi.easy.message.entity
 * Project:message-center
 */
public class WXTemplate implements Serializable{
    private String template_id;
    private String touser;
    private String url;
    private Map<String,TemplateData> data;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, TemplateData> getData() {
        return data;
    }

    public void setData(Map<String, TemplateData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WXTemplate{");
        sb.append("template_id='").append(template_id).append('\'');
        sb.append(", touser='").append(touser).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
