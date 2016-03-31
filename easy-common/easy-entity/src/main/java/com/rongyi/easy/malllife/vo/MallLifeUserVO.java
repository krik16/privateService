package com.rongyi.easy.malllife.vo;


import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

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

     public static MallLifeUserVO fromMallLifeUserEntity(MalllifeUserInfoEntity mallLifeUserEntity) {
        MallLifeUserVO mallLifeUserVO = new MallLifeUserVO();
        mallLifeUserVO.setId(mallLifeUserEntity.getId());
        mallLifeUserVO.setEmail(mallLifeUserEntity.getEmail());
        mallLifeUserVO.setHeadImg(mallLifeUserEntity.getHeadImg());
        mallLifeUserVO.setIMId(mallLifeUserEntity.getImId());
        mallLifeUserVO.setNickname(mallLifeUserEntity.getNickName());
        mallLifeUserVO.setPhone(mallLifeUserEntity.getPhone());
        if(StringUtils.isNotBlank(mallLifeUserEntity.getGender())){
        	if(mallLifeUserEntity.getGender().equals("M")){
                mallLifeUserVO.setSex(0);
            }else {
                mallLifeUserVO.setSex(1);
            }
        }
        return mallLifeUserVO;
    }
}
