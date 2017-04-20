package com.rongyi.easy.msgcenter.wx;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.Map;

/**
 * Description:
 * Author: yb
 * DATE: 2017/4/20 11:54
 * Package:com.rongyi.easy.msgcenter.wx
 * Project:easy-market
 */
public class WXMsgUnsetContent implements Serializable{

    private static final long serialVersionUID = -1648300355111277727L;
    private String first;
    private Map<String,String> keyValue;
    private String remark;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Map<String, String> getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(Map<String, String> keyValue) {
        this.keyValue = keyValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String toJsonString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("first", first);
        jsonObject.put("remark", remark);
        for (Map.Entry<String, String> entry : keyValue.entrySet()) {
            jsonObject.put(entry.getKey(), entry.getValue());
        }
        return jsonObject.toString();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WXMsgUnsetContent{");
        sb.append("first='").append(first).append('\'');
        sb.append(", keyValue=").append(keyValue);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
