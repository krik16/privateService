package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class MsettingConfigEntity implements Serializable {
    /**  */
    private Integer id;

    /** 主账号关联的店铺/商城ID */
    private String chiefId;

    /** 设置内容，JSON格式 */
    private String content;

    /** 是否删除 0：未删除 1：删除 */
    private Byte isDeleted;

    /** 1：退款/维权 */
    private Byte configType;

    /** 创建时间 */
    private Date createAt;

    /** 创建人 */
    private String createBy;

    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 主账号关联的店铺/商城ID
     * @return chiefId
     */
    public String getChiefId() {
        return chiefId;
    }

    /**
     * 主账号关联的店铺/商城ID
     * @param chiefId
     */
    public void setChiefId(String chiefId) {
        this.chiefId = chiefId;
    }

    /**
     * 设置内容，JSON格式
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容，JSON格式
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 是否删除 0：未删除 1：删除
     * @return isDeleted
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除 0：未删除 1：删除
     * @param isDeleted
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 1：退款/维权
     * @return configType
     */
    public Byte getConfigType() {
        return configType;
    }

    /**
     * 1：退款/维权
     * @param configType
     */
    public void setConfigType(Byte configType) {
        this.configType = configType;
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
     * 创建人
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}