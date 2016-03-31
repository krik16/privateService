package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2016/1/13 17:04
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class ContentListVO implements Serializable {
    private Integer id;

    private String picUrls;

    private Integer type;

    private String typeVal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("picUrls", picUrls)
                .append("type", type)
                .append("typeVal", typeVal)
                .toString();
    }
}
