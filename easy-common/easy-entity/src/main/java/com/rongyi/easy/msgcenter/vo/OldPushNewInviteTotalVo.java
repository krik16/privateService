package com.rongyi.easy.msgcenter.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/29.
 */
public class OldPushNewInviteTotalVo implements Serializable {
    private Integer inviteCount;//邀请人数
    private Integer inviteAmonut;//获得金额

    public Integer getInviteCount() {
        return inviteCount;
    }

    public void setInviteCount(Integer inviteCount) {
        this.inviteCount = inviteCount;
    }

    public Integer getInviteAmonut() {
        return inviteAmonut;
    }

    public void setInviteAmonut(Integer inviteAmonut) {
        this.inviteAmonut = inviteAmonut;
    }

    @Override
    public String toString() {
        return "OldPushNewInviteTotalVo{" +
                "inviteCount=" + inviteCount +
                ", inviteAmonut=" + inviteAmonut +
                '}';
    }
}
