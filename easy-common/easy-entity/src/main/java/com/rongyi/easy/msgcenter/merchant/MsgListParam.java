package com.rongyi.easy.msgcenter.merchant;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/6/13 14:54
 * Package:com.rongyi.easy.msgcenter.merchant
 * Project:easy-mobile
 */
public class MsgListParam implements Serializable{
    private String title;
    private Integer type;
    private Date reciveStart;
    private Date reciveEnd;
    private Integer pageSize;
    private Integer currentPage;
    private Integer start;
    private SessionUserInfo userInfo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getReciveStart() {
        return reciveStart;
    }

    public void setReciveStart(Date reciveStart) {
        this.reciveStart = reciveStart;
    }

    public Date getReciveEnd() {
        return reciveEnd;
    }

    public void setReciveEnd(Date reciveEnd) {
        this.reciveEnd = reciveEnd;
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

    public Integer getStart() {
        return (this.getCurrentPage()-1)*this.getPageSize();
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public SessionUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(SessionUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MsgListParam{");
        sb.append("title='").append(title).append('\'');
        sb.append(", type=").append(type);
        sb.append(", reciveStart=").append(reciveStart);
        sb.append(", reciveEnd=").append(reciveEnd);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", currentPage=").append(currentPage);
        sb.append(", start=").append(start);
        sb.append(", userInfo=").append(userInfo);
        sb.append('}');
        return sb.toString();
    }
}
