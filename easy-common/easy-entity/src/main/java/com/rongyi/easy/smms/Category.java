package com.rongyi.easy.smms;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 7732059935875430177L;

    /**  */
    private Long id;

    /** 商超分类名称 */
    private String name;

    /** 级别 1 一级 2 二级 */
    private Byte level;

    /** 分类类型 1 标超 2大卖场 3便利店 */
    private Byte cateType;

    /** 父级id -1没有父级 */
    private Long parentId;

    /** 创建时间 */
    private Date createdTime;

    /** 更新时间 */
    private Date updatedTime;

    /** 集团id */
    private String groupId;

    /** 商场id */
    private String mallId;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商超分类名称
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 商超分类名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 级别 1 一级 2 二级
     * @return level
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * 级别 1 一级 2 二级
     * @param level
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * 分类类型 1 标超 2大卖场 3便利店
     * @return cateType
     */
    public Byte getCateType() {
        return cateType;
    }

    /**
     * 分类类型 1 标超 2大卖场 3便利店
     * @param cateType
     */
    public void setCateType(Byte cateType) {
        this.cateType = cateType;
    }

    /**
     * 父级id -1没有父级
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 父级id -1没有父级
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 创建时间
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 更新时间
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 集团id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 集团id
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 商场id
     * @return mallId
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * 商场id
     * @param mallId
     */
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }
}