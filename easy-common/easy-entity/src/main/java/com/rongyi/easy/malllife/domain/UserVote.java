package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户投票
 * 接口 类UserVote.java的实现描述：TODO 类实现描述
 * 
 * @author rongyi11 2014年8月22日 下午1:24:49
 */
public class UserVote implements Serializable{

    private Integer id;

    private String  userId;

    private Integer contentId; //投票的文章或者活动id

    private Date    createdAt;

    private Integer voteId;  //投票的id

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
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }
}
