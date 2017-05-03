package com.rongyi.easy.msgcenter.wx;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Description:
 * Author: yb
 * DATE: 2017/4/20 13:58
 * Package:com.rongyi.easy.msgcenter.wx
 * Project:easy-market
 */
public class SWXMessageBaseParam {
    private String openid;
    private String mallid;
    private String templateid;
    private String url;

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

    public String toPostParam() throws UnsupportedEncodingException {
        StringBuffer sb = new StringBuffer();
        sb.append("openid=").append(URLEncoder.encode(openid, "utf-8")).append('&');
        sb.append("mallid=").append(URLEncoder.encode(mallid, "utf-8")).append('&');
        sb.append("templateid=").append(URLEncoder.encode(templateid, "utf-8")).append('&');
        sb.append("url=").append(URLEncoder.encode(url, "utf-8")).append('&');
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SWXMessageBaseParam{");
        sb.append("openid='").append(openid).append('\'');
        sb.append(", mallid='").append(mallid).append('\'');
        sb.append(", templateid='").append(templateid).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
