package com.rongyi.easy.messagemanage.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 店铺公告点赞
 * @author lijing
 * @time 2015-09-09
 */
public class NoticePraisedEntity implements Serializable{
	/**id*/
    private Integer id;
    /**店铺公告id*/
    private Integer noticeId;
    /**点赞用户*/
    private String userId;
    /**创建时间*/
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}