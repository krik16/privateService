package com.rongyi.easy.content.entity;

import java.io.Serializable;
import java.util.Date;

public class ContentHelpCategory implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
    
    /** 位置坐标*/
    private Integer position;
    /** 版本 */
    private Integer version;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 父ID */
    private Integer parentId;

    /** 分类名称 */
    private String categoryName;

    /** 分类级别 */
    private Integer categoryLevel;

    /** 创建人的名字*/
    private String createName;
    /** 修改人的名字*/
    private String updateName;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
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

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
    
}