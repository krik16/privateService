package com.rongyi.easy.content_v2.dto;

import java.io.Serializable;

/**
 * Created by sj on 2016/8/25.
 *
 */
public class ForumHotAreaDto implements Serializable{

    private static final long serialVersionUID = -6049425064802158250L;

    private Integer areaId;   //城市ID
    private String cityName;  //城市中文名称

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
