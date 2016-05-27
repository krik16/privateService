package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 分享红包绑定手机号
 * @author user
 *
 */
public class MalllifeUserOpenidEntity implements Serializable {
    /** 主键 */
    private Integer id;

    /** 微信或微博openId */
    private String openId;

    /** 1:微信，2:新浪微博 */
    private Integer type;

    /** 绑定手机号 */
    private String phone;

    /** 创建时间 */
    private Date createAt;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    public MalllifeUserOpenidEntity() {
    	
	}

	public MalllifeUserOpenidEntity(String openId, Integer type, String phone,
			Date createAt, Integer isDisabled) {
		super();
		this.openId = openId;
		this.type = type;
		this.phone = phone;
		this.createAt = createAt;
		this.isDisabled = isDisabled;
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
     * 微信或微博openId
     * @return openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 微信或微博openId
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 1:微信，2:新浪微博
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1:微信，2:新浪微博
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 绑定手机号
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 绑定手机号
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
		return "MalllifeUserOpenidEntity [id=" + id + ", openId=" + openId
				+ ", type=" + type + ", phone=" + phone + ", createAt="
				+ createAt + ", isDisabled=" + isDisabled + "]";
	}
}