package com.rongyi.easy.msgcenter.vo;

import java.io.Serializable;
import java.util.Date;

/**老推新红包领用记录表vo
 * Created by shaozhou on 2016/8/26.
 */
public class InviteRelationVo implements Serializable {
    private Integer id;
    private String inviteUserId;//老用户id
    private String inviteUserCode;//老用户邀请码
    private Integer pushActivityId;//消息id
    private String userId;//新用户id
    private String userPhone;//新用户手机号码
    private String userNickName;//新用户昵称
    private Integer inviteType;//新用户领取类型 1 注册，2注册并交易
    private Date createAt;//创建时间
    private String createBy;//创建人
    private Date updateAt;//修改时间
    private String updateBy;//修改人
    private Integer envelopAmonut;//获取红包金额
    private String userLogo;//用户logo

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(String inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    public String getInviteUserCode() {
        return inviteUserCode;
    }

    public void setInviteUserCode(String inviteUserCode) {
        this.inviteUserCode = inviteUserCode;
    }

    public Integer getPushActivityId() {
        return pushActivityId;
    }

    public void setPushActivityId(Integer pushActivityId) {
        this.pushActivityId = pushActivityId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Integer getInviteType() {
        return inviteType;
    }

    public void setInviteType(Integer inviteType) {
        this.inviteType = inviteType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getEnvelopAmonut() {
        return envelopAmonut;
    }

    public void setEnvelopAmonut(Integer envelopAmonut) {
        this.envelopAmonut = envelopAmonut;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    @Override
    public String toString() {
        return "InviteRelationVo{" +
                "id=" + id +
                ", inviteUserId='" + inviteUserId + '\'' +
                ", inviteUserCode='" + inviteUserCode + '\'' +
                ", pushActivityId=" + pushActivityId +
                ", userId='" + userId + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", inviteType=" + inviteType +
                ", createAt=" + createAt +
                ", createBy='" + createBy + '\'' +
                ", updateAt=" + updateAt +
                ", updateBy='" + updateBy + '\'' +
                ", envelopAmonut=" + envelopAmonut +
                ", userLogo='" + userLogo + '\'' +
                '}';
    }
}
