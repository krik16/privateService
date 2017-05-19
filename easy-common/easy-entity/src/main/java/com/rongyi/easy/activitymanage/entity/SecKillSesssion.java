package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;

/**
 * Created by yangyang on 2017/5/11.
 */
public class SecKillSesssion implements Serializable {
    private Integer activityId;
    private String sessionDate;
    private String template;
    private Integer option;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }
}
