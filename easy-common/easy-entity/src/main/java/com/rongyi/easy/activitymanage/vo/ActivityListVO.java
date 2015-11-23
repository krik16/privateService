package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 这个是内容管理查询闪购和特卖的返回vo
 * Created by lijing on 2015/11/23 15:45
 * .com.rongyi.easy.activitymanage.vo
 * easy-api
 */
public class ActivityListVO implements Serializable{
    //特卖或者闪购id
    private Integer id;
   //活动的url
    private String activityUrl;
    //商圈名称
    private String businessDistrictName;

    //商圈Id
    private String businessDistrictId;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getBusinessDistrictName() {
        return businessDistrictName;
    }

    public void setBusinessDistrictName(String businessDistrictName) {
        this.businessDistrictName = businessDistrictName;
    }

    public String getBusinessDistrictId() {
        return businessDistrictId;
    }

    public void setBusinessDistrictId(String businessDistrictId) {
        this.businessDistrictId = businessDistrictId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityUrl", activityUrl)
                .append("businessDistrictName", businessDistrictName)
                .append("businessDistrictId", businessDistrictId)
                .toString();
    }
}
