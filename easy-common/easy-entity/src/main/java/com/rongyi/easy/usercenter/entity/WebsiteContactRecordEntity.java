package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.easy.rmmm.param.WebsiteContactRecordParam;

/**
 * 官网联系记录
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年9月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年9月13日               1.0              创建文件
 */
public class WebsiteContactRecordEntity implements Serializable {
    /** 主键 */
    private Integer id;

    /** 用户姓名 */
    private String name;

    /** 0:先生 1:女士 */
    private Integer sex;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String email;

    /** 咨询内容 */
    private String content;

    /** 创建时间 */
    private Date createAt;

    /** 修改时间 */
    private Date updateAt;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    

    public WebsiteContactRecordEntity() {
		super();
	}

	public WebsiteContactRecordEntity(WebsiteContactRecordParam param) {
		this.name = param.getName();
		this.sex = param.getSex();
		this.phone = param.getPhone();
		this.email = param.getEmail();
		this.content = param.getContent();
		this.createAt = new Date();
		this.isDisabled = 0;
	}

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
     * 用户姓名
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 用户姓名
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 0:先生 1:女士
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 0:先生 1:女士
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 手机号
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 咨询内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 咨询内容
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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

	@Override
	public String toString() {
		return "WebsiteContactRecordEntity [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", email="
				+ email + ", content=" + content + ", createAt=" + createAt + ", updateAt=" + updateAt + ", isDisabled="
				+ isDisabled + "]";
	}
}