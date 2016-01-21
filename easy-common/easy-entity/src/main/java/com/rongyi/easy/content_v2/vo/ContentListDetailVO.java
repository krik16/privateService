package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2016/1/12 20:21
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class ContentListDetailVO implements Serializable {
    private String id;//id
    private String pic;//图片
    private String activityUrl;//特卖闪购url
    private String name;//名称
    private Integer contentId;//内容id
    private String businessDistrictName;//商圈名称
    private String businessDistrictId;//商圈id
    private Integer type;//类型
    private String typeVal;//值

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
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
                .append("pic", pic)
                .append("activityUrl", activityUrl)
                .append("name", name)
                .append("contentId", contentId)
                .append("businessDistrictName", businessDistrictName)
                .append("businessDistrictId", businessDistrictId)
                .append("type", type)
                .append("typeVal", typeVal)
                .toString();
    }
}
