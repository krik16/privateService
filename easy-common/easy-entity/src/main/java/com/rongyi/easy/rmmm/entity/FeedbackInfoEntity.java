package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class FeedbackInfoEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 表主键 */
    private Integer id;

    /** 创建人 */
    private String createBy;

    /** 创建时间 */
    private Date createAt;

    /** 版本 */
    private Integer version;

    /** 联系方式 */
    private String contact;

    /** 反馈内容 */
    private String content;

    /** 卖家称呼 */
    private String userName;

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
     * 联系方式
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * 联系方式
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 反馈内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 反馈内容
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 卖家称呼
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 卖家称呼
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}