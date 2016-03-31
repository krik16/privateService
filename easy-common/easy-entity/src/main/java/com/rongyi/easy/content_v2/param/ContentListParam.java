package com.rongyi.easy.content_v2.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 首页特卖列表闪购列表 商品列表 买手列表
 * Created by lijing on 2016/1/12 17:20
 * .com.rongyi.easy.content_v2.param
 * easy-api
 */
public class ContentListParam implements Serializable {
    /**城市id*/
    private String cityId;
    /**城市名称*/
    private String cityName;
    /**用户jessionId*/
    private String jsessionid;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("cityId", cityId)
                .append("cityName", cityName)
                .append("jsessionid", jsessionid)
                .toString();
    }
}
