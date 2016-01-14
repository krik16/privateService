package com.rongyi.easy.content.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 推荐版块内容图片
 * @author WZH
 *
 */
public class SysDocPic implements Serializable{
	
	public static final long serialVersionUID = 1L;
    /** 表主键 */
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

    /** 文件对应功能Id */
    private Integer objId;

    /** 文件标题名称 */
    private String fileTitle;

    /** 文件本地地址 */
    private String fileLocalUrl;

    /** 文件绝对地址 */
    private String fileUrl;

    /** 文件对应功能如内容管理type=connet */
    private String objType;

    /** 按数值大小排序 */
    private Integer fileSort;

    /**
     * 表主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 表主键
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
     * 文件对应功能Id
     * @return objId
     */
    public Integer getObjId() {
        return objId;
    }

    /**
     * 文件对应功能Id
     * @param objId
     */
    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    /**
     * 文件标题名称
     * @return fileTitle
     */
    public String getFileTitle() {
        return fileTitle;
    }

    /**
     * 文件标题名称
     * @param fileTitle
     */
    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    /**
     * 文件本地地址
     * @return fileLocalUrl
     */
    public String getFileLocalUrl() {
        return fileLocalUrl;
    }

    /**
     * 文件本地地址
     * @param fileLocalUrl
     */
    public void setFileLocalUrl(String fileLocalUrl) {
        this.fileLocalUrl = fileLocalUrl;
    }

    /**
     * 文件绝对地址
     * @return fileUrl
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 文件绝对地址
     * @param fileUrl
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * 文件对应功能如内容管理type=connet
     * @return objType
     */
    public String getObjType() {
        return objType;
    }

    /**
     * 文件对应功能如内容管理type=connet
     * @param objType
     */
    public void setObjType(String objType) {
        this.objType = objType;
    }

    /**
     * 按数值大小排序
     * @return fileSort
     */
    public Integer getFileSort() {
        return fileSort;
    }

    /**
     * 按数值大小排序
     * @param fileSort
     */
    public void setFileSort(Integer fileSort) {
        this.fileSort = fileSort;
    }
}