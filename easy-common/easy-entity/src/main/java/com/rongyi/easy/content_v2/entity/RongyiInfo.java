package com.rongyi.easy.content_v2.entity;

import com.google.inject.internal.Lists;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yangyang on 2016/11/10.
 */
public class RongyiInfo implements Serializable {
    private Integer id;

    private String title;

    private String subTitle;

    private String source;

    private String outerLink;

    private Date publishBeginAt;

    private String coverUrl;

    private String intro;

    private Integer status;//2查询2，4

    private String createUser;

    private Date createAt;

    private String updateUser;

    private Date updateAt;

    private String infoContent;

    private Integer currentPage;

    private Integer pageSize;

    private Integer lastId;//上一篇

    private Integer nextId;//下一篇

    private Integer isShowLastNext;//是否查询上一篇，下一篇,1true,0false

    private Integer offset;

    private List<Integer> statusList = Lists.newArrayList();




    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("subTitle", subTitle)
                .append("source", source)
                .append("title", title)
                .append("outerLink", outerLink)
                .append("publishBeginAt", publishBeginAt)
                .append("coverUrl", coverUrl)
                .append("intro", intro)
                .append("status", status)
                .append("createUser", createUser)
                .append("status", status)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("infoContent", infoContent)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("lastId", lastId)
                .append("statusList", statusList)
                .append("nextId", nextId)
                .append("isShowLastNext", isShowLastNext)
                .append("offset", offset)
                .toString();
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(Integer lastId) {
        this.lastId = lastId;
    }

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    public Integer getIsShowLastNext() {
        return isShowLastNext;
    }

    public void setIsShowLastNext(Integer isShowLastNext) {
        this.isShowLastNext = isShowLastNext;
    }

    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOuterLink() {
        return outerLink;
    }

    public void setOuterLink(String outerLink) {
        this.outerLink = outerLink;
    }

    public Date getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(Date publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }
}
