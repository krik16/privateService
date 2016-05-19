package com.rongyi.easy.activitymanage.entity;

import com.google.inject.internal.Lists;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/5/12.
 */
public class SpePerformanceVO implements Serializable{
    private Integer id;
    private String actName;
    private Integer contentId;
    private List<TemplateRound> templateRoundList = Lists.newArrayList();

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public List<TemplateRound> getTemplateRoundList() {
        return templateRoundList;
    }

    public void setTemplateRoundList(List<TemplateRound> templateRoundList) {
        this.templateRoundList = templateRoundList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("actName", actName)
                .append("contentId", contentId)
                .append("templateRoundList", templateRoundList)
                .toString();
    }
}
