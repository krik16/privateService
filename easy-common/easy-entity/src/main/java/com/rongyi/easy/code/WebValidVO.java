package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/9/26 15:00
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public class WebValidVO implements Serializable{
    private Boolean result;
    private String name;
    private Integer count;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WebValidVO{");
        sb.append("result=").append(result);
        sb.append(", name='").append(name).append('\'');
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
