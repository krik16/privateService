package com.rongyi.easy.malllife.vo;

import com.rongyi.easy.entity.MallLifeUserEntity;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/24.
 */
public class MallLifeUserVO implements Serializable {
    private String id;
    private Integer customerId;
    private String IMId;
    private String email;
    private String phone;
    private String headImg;
    private String nickname;
    private Integer sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getIMId() {
        return IMId;
    }

    public void setIMId(String IMId) {
        this.IMId = IMId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public static MallLifeUserVO fromMallLifeUserEntity(MallLifeUserEntity mallLifeUserEntity) {
        MallLifeUserVO mallLifeUserVO = new MallLifeUserVO();
        mallLifeUserVO.setId(mallLifeUserEntity.getId().toHexString());
        mallLifeUserVO.setEmail(mallLifeUserEntity.getEmail());
        mallLifeUserVO.setHeadImg(mallLifeUserEntity.getHeadImg());
        mallLifeUserVO.setIMId(mallLifeUserEntity.getIMId());
        mallLifeUserVO.setNickname(mallLifeUserEntity.getNickname());
        mallLifeUserVO.setPhone(mallLifeUserEntity.getPhone());
        mallLifeUserVO.setSex(mallLifeUserEntity.getSex());
        return mallLifeUserVO;
    }
}
