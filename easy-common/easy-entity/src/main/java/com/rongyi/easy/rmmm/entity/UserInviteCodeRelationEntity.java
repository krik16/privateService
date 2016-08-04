package com.rongyi.easy.rmmm.entity;

import java.util.Date;

public class UserInviteCodeRelationEntity {
    /** 表id */
    private Integer id;

    /** 手机号 */
    private String phone;

    /** 邀请对象:1容易逛用户 2摩店导购  3摩店买手  4摩店用户 */
    private Integer userType;

    /** 创建时间 */
    private Date createAt;

    /** 邀请码 */
    private String inviteCode;

    /** 更新时间 */
    private Date updateAt;

    /** 是否正常:0正常 1禁用 */
    private Integer isDisabled;

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
     * 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return userType
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 
     * @return inviteCode
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 
     * @param inviteCode
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }
}