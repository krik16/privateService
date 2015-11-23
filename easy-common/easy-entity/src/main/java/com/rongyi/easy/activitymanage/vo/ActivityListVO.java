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
    //品牌id
    private String brandName;

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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("brandName", brandName)
                .append("activityUrl", activityUrl)
                .append("id", id)
                .toString();
    }
}
