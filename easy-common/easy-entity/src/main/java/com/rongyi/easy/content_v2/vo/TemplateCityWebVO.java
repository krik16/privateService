package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/12/24 15:01
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class TemplateCityWebVO implements Serializable {
    private String cityId;

    private String provId;

    private String cityName;

    private String provName;
    /**
     * 模版名称
     */
    private String name;

    private Integer templateId;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                .append("cityId", cityId)
                .append("provId", provId)
                .append("cityName", cityName)
                .append("provName", provName)
                .append("name", name)
                .append("templateId", templateId)
                .toString();
    }
}
