package com.rongyi.easy.msgcenter.wx;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Description:
 * Author: yb
 * DATE: 2017/4/20 14:12
 * Package:com.rongyi.easy.msgcenter.wx
 * Project:easy-market
 */
public class SWXMessageUnsetParam extends SWXMessageBaseParam implements Serializable {
    private WXMsgUnsetContent arr;
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SWXMessageParam{");
        sb.append("openid='").append(getOpenid()).append('\'');
        sb.append(", mallid='").append(getMallid()).append('\'');
        sb.append(", templateid='").append(getTemplateid()).append('\'');
        sb.append(", url='").append(getUrl()).append('\'');
        sb.append("arr=").append(arr);
        sb.append('}');
        return sb.toString();
    }

    public String toPostParam() throws UnsupportedEncodingException {
        StringBuffer sb = new StringBuffer(super.toPostParam());
        sb.append("arr=").append(URLEncoder.encode(arr.toJsonString(), "utf-8"));
        return sb.toString();
    }
    public WXMsgUnsetContent getArr() {
        return arr;
    }

    public void setArr(WXMsgUnsetContent arr) {
        this.arr = arr;
    }

}
