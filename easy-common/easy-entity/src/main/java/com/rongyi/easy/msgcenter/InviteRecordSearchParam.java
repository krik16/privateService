package com.rongyi.easy.msgcenter;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/30.
 */
public class InviteRecordSearchParam implements Serializable {
    private String inviteUserId;
    private Integer pageSize;
    private Integer currentPage;

    public String getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(String inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "InviteRecordSearchParam{" +
                "inviteUserId='" + inviteUserId + '\'' +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                '}';
    }
}
