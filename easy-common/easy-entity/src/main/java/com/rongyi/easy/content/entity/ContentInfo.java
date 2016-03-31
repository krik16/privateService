package com.rongyi.easy.content.entity;

import java.io.Serializable;
import java.util.Date;

public class ContentInfo implements Serializable{
	
	public static final long serialVersionUID = 1L;
    /** 主键 */
    private Integer id;

    /** 创建人 */
    private Integer createBy;

    /** 创建时间 */
    private Date createAt;

    /** 修改人 */
    private Integer updateBy;

    /** 修改时间 */
    private Date updateAt;

    /** 版本 */
    private Integer version;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 版块id */
    private Integer forumId;

    /** 类型 0文章 1商品 2品牌3外链4现金券 */
    private Integer contentType;

    /** 类型对应ID */
    private String contentTypeid;

    /** 发布起始日期 */
    private Date contentStarttime;

    /** 发布终止日期 */
    private Date contentEndtime;

    /** 排序 倒序 */
    private Integer contentSort;

    /** 外链 */
    private String contentLink;

    /** 显示平台 */
    private Integer channel;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 创建人
     * @return createBy
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 修改人
     * @return updateBy
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改人
     * @param updateBy
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 修改时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 是否禁用0正常 1禁用
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * 版块id
     * @return forumId
     */
    public Integer getForumId() {
        return forumId;
    }

    /**
     * 版块id
     * @param forumId
     */
    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    /**
     * 类型 0文章 1商品 2品牌3外链4现金券
     * @return contentType
     */
    public Integer getContentType() {
        return contentType;
    }

    /**
     * 类型 0文章 1商品 2品牌3外链4现金券
     * @param contentType
     */
    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    /**
     * 类型对应ID
     * @return contentTypeid
     */
    public String getContentTypeid() {
        return contentTypeid;
    }

    /**
     * 类型对应ID
     * @param contentTypeid
     */
    public void setContentTypeid(String contentTypeid) {
        this.contentTypeid = contentTypeid;
    }

    /**
     * 发布起始日期
     * @return contentStarttime
     */
    public Date getContentStarttime() {
        return contentStarttime;
    }

    /**
     * 发布起始日期
     * @param contentStarttime
     */
    public void setContentStarttime(Date contentStarttime) {
        this.contentStarttime = contentStarttime;
    }

    /**
     * 发布终止日期
     * @return contentEndtime
     */
    public Date getContentEndtime() {
        return contentEndtime;
    }

    /**
     * 发布终止日期
     * @param contentEndtime
     */
    public void setContentEndtime(Date contentEndtime) {
        this.contentEndtime = contentEndtime;
    }

    /**
     * 排序 倒序
     * @return contentSort
     */
    public Integer getContentSort() {
        return contentSort;
    }

    /**
     * 排序 倒序
     * @param contentSort
     */
    public void setContentSort(Integer contentSort) {
        this.contentSort = contentSort;
    }

    /**
     * 外链
     * @return contentLink
     */
    public String getContentLink() {
        return contentLink;
    }

    /**
     * 外链
     * @param contentLink
     */
    public void setContentLink(String contentLink) {
        this.contentLink = contentLink;
    }

    /**
     * 显示平台
     * @return channel
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * 显示平台
     * @param channel
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
}