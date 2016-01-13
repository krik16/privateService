package com.rongyi.easy.usercenter.dto.malllife;

import java.io.Serializable;

/**
 * Description:推送后台列表展示用户
 * Author: 袁波
 * DATE: 2015/12/23 16:52
 * Package:com.rongyi.easy.usercenter.dto.malllife
 * Project:message-center
 */
public class MalllifeUserListInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 用户uuid */
    private String id;


    /** 手机号 */
    private String phone;

    /** 用户呢称 */
    private String nickName;

    /** 用户性别，U未知,M男，F女,默认U */
    private String gender;

    /** 百度推送Id */
    private String pushId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public MalllifeUserListInfoDto(String id, String phone, String nickName, String gender, String pushId) {
        this.id = id;
        this.phone = phone;
        this.nickName = nickName;
        this.gender = gender;
        this.pushId = pushId;
    }

    public MalllifeUserListInfoDto() {

    }

    public MalllifeUserListInfoDto(String id, String phone) {

        this.id = id;
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MalllifeUserListInfoDto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", pushId='").append(pushId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
