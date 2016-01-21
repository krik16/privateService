package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/12/22 14:04
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class TemplateCityVO implements Serializable {
    private Integer id;
    /**省份id*/
    private String provId;
    /**省份名字*/
    private String provName;
    /**城市id*/
    private String cityId;
    /**城市名称*/
    private String cityName;
    /**模版id*/
    private Integer templateId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

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

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("provId", provId)
                .append("provName", provName)
                .append("cityId", cityId)
                .append("cityName", cityName)
                .append("templateId", templateId)
                .toString();
    }
}
