package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/***
 * 模版标签关联商品卡券关联
 * @author  lijing 2015-11-17 15:52
 */
public class TemplateLabel implements Serializable {
    /**id*/
    private Integer id;
   /**活动模版id*/
    private Integer activityTemplateId;
    /**分类标签名称*/
    private String title;
    /**省份id*/
    private String provId;
    /**省份名字*/
    private String provName;
    /**'类型 0代表卡券，1代表代金券，2代表抵扣券 3代表商品*/
    private Integer type;
    /**显示开始时间*/
    private Date startAt;
    /**显示结束时间*/
    private Date endAt;
    /**更多url*/
    private String moreUrl;
    /**false没有删除 true删除*/
    private Boolean isDeleted;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改时间*/
    private Date updateAt;
    /**版本*/
    private Integer version;
    /**
     * 判断label是否删除的 用于 卡券及商品 类型中
     * 0 无修改
     * 1表示新增
     * 2表示删除
     * 3表示修改
     */
    private Integer isUpdate;
    /**关联的卡券商品*/
    private List<TemplateRelevantGoodsCoupon> templateRelevantGoodsCouponList;
    /**拼单商品排序*/
    private Integer sortNum;


    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<TemplateRelevantGoodsCoupon> getTemplateRelevantGoodsCouponList() {
        return templateRelevantGoodsCouponList;
    }

    public void setTemplateRelevantGoodsCouponList(List<TemplateRelevantGoodsCoupon> templateRelevantGoodsCouponList) {
        this.templateRelevantGoodsCouponList = templateRelevantGoodsCouponList;
    }

    public Integer getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityTemplateId", activityTemplateId)
                .append("title", title)
                .append("provId", provId)
                .append("provName", provName)
                .append("type", type)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("moreUrl", moreUrl)
                .append("isDeleted", isDeleted)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("version", version)
                .append("isUpdate", isUpdate)
                .append("templateRelevantGoodsCouponList", templateRelevantGoodsCouponList)
                .append("sortNum", sortNum)
                .toString();
    }
}