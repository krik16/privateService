package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xgq on 2015/7/16.
 */
public class Customer implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 关联的摩生活用户id(mongodb.users  MallLifeUserEntity)
     */
    private String userId;

    /**
     * 导购id(UserinfoVO)
     */
    private Integer guideId;

    /**
     * 顾客组ID
     */
    private Integer groupId;

    /**
     * 备注名
     */
    private String memoName;

    /**
     * 性别 M为男性  F为女性
     */
    private String gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 家庭情况  1为学生  2为未婚  3为已婚  4为有子
     */
    private Integer familyType;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMemoName() {
        return memoName;
    }

    public void setMemoName(String memoName) {
        this.memoName = memoName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getFamilyType() {
        return familyType;
    }

    public void setFamilyType(Integer familyType) {
        this.familyType = familyType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
