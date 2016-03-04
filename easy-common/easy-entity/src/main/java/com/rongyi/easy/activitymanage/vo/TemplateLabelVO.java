package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.activitymanage.entity.TemplateLabel;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.activitymanage.vo easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/28
 * TIME : 19:06
 * easy-api.
 */
public class TemplateLabelVO implements Serializable {
    /**id*/
    private Integer id;
    /**活动模版id*/
    private Integer activityTemplateId;
    /**分类标签名称*/
    private String title;

    /**'类型 0代表卡券，1代表代金券，2代表抵扣券 3代表商品*/
    private Integer type;
    /**显示开始时间*/
    private Date startAt;
    /**显示结束时间*/
    private Date endAt;
    /**更多url*/
    private String moreUrl;

   private List<TemplateCommodityVO> commoditys = new ArrayList<TemplateCommodityVO>();

    private Integer isUpdate = 0;

    public TemplateLabelVO(){

    }
    public TemplateLabelVO(TemplateLabel templateLabel){
        if(templateLabel != null){
            this.id = templateLabel.getId();
            this.activityTemplateId = templateLabel.getActivityTemplateId();
            this.title = templateLabel.getTitle();
            this.type = templateLabel.getType();
            this.startAt = templateLabel.getStartAt();
            this.endAt = templateLabel.getEndAt();
            this.moreUrl = templateLabel.getMoreUrl();
        }
    }

    public Integer getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(Integer activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public String getMoreUrl() {
        return moreUrl;
    }

    public void setMoreUrl(String moreUrl) {
        this.moreUrl = moreUrl;
    }

    public List<TemplateCommodityVO> getCommoditys() {
        return commoditys;
    }

    public void setCommoditys(List<TemplateCommodityVO> commoditys) {
        this.commoditys = commoditys;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityTemplateId", activityTemplateId)
                .append("title", title)
                .append("type", type)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("moreUrl", moreUrl)
                .append("commoditys", commoditys)
                .append("isUpdate", isUpdate)
                .toString();
    }
}
