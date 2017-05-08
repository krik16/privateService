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
public class SWXMessageParam extends SWXMessageBaseParam  implements Serializable {
    private WXMsgContent arr;

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
        sb.append("arr=").append(URLEncoder.encode(JSONObject.fromObject(arr).toString(), "utf-8"));
        return sb.toString();
    }
    public WXMsgContent getArr() {
        return arr;
    }

    public void setArr(WXMsgContent arr) {
        this.arr = arr;
    }

}
