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

    private String name;

    //商圈Id
    private String businessDistrictId;

    private String shareTitle;

    private String shareDesc;

    public ActivityListVO(){

    }
    public ActivityListVO(TemplateListVO templateListVO){
        if(templateListVO !=null){
            this.id=templateListVO.getId();
            this.activityUrl=templateListVO.getActivityUrl();
            this.name=templateListVO.getName();
        }
    }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityUrl", activityUrl)
                .append("businessDistrictName", businessDistrictName)
                .append("name", name)
                .append("businessDistrictId", businessDistrictId)
                .append("shareTitle", shareTitle)
                .append("shareDesc", shareDesc)
                .toString();
    }
}
