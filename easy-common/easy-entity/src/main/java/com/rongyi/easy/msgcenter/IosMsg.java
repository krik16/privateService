package com.rongyi.easy.msgcenter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/20 16:00
 * Package:com.rongyi.message.entity.dto
 * Project:easy-common
 */
public class IosMsg implements Serializable{
    private Map<String,Object> aps;
    private String code;
    private Integer type;

    public IosMsg(String msg,Integer type,String code) {
        Map<String, Object> map = new HashMap<>();
        map.put("alert",msg);
        this.aps=map;
        this.code=code;
        this.type=type;
    }
    public IosMsg(String msg,String sound,Integer badge,Integer type,String code) {
        Map<String, Object> map = new HashMap<>();
        map.put("alert",msg);
        map.put("sound",sound);
        map.put("badge",badge);
        this.aps=map;
        this.code=code;
        this.type=type;
    }
    public IosMsg(String msg){
        Map<String, Object> map = new HashMap<>();
        map.put("alert",msg);
        this.aps=map;
    }

    public Map<String, Object> getAps() {
        return aps;
    }

    public void setAps(Map<String, Object> aps) {
        this.aps = aps;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IosMsg{");
        sb.append("aps=").append(aps);
        sb.append(", code='").append(code).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
