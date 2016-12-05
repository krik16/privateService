package com.rongyi.easy.msgcenter.wx;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Description:标准版微信 消息参数
 * Author: 袁波
 * DATE: 2016/3/21 14:30
 * Package:com.rongyi.message.entity.dto
 * Project:easy-common
 */
public class SWXMessageParam implements Serializable {
    private String openid;
    private String mallid;
    private String templateid;
    private String url;
    private WXMsgContent arr;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SWXMessageParam{");
        sb.append("openid='").append(openid).append('\'');
        sb.append(", mallid='").append(mallid).append('\'');
        sb.append(", templateid='").append(templateid).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", arr=").append(arr);
        sb.append('}');
        return sb.toString();
    }

    public String toPostParam() throws UnsupportedEncodingException {
        StringBuffer sb = new StringBuffer();
        sb.append("openid=").append(URLEncoder.encode(openid, "utf-8")).append('&');
        sb.append("mallid=").append(URLEncoder.encode(mallid, "utf-8")).append('&');
        sb.append("templateid=").append(URLEncoder.encode(templateid, "utf-8")).append('&');
        sb.append("url=").append(URLEncoder.encode(url, "utf-8")).append('&');
        sb.append("arr=").append(URLEncoder.encode(JSONObject.fromObject(arr).toString(), "utf-8"));
        return sb.toString();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getMallid() {
        return mallid;
    }

    public void setMallid(String mallid) {
        this.mallid = mallid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WXMsgContent getArr() {
        return arr;
    }

    public void setArr(WXMsgContent arr) {
        this.arr = arr;
    }

}
