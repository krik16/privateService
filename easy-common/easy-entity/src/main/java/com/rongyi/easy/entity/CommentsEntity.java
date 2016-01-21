package com.rongyi.easy.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  评论相关
 * time:  2015/6/3
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/3              1.0            创建文件
 *
 */
@Entity(value = "comments", noClassnameStored = true)
public class CommentsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;// 表id

    @Property("commentable_id")
    private String commentableId;
    @Property("commentable_type")
    private String  commentableType;

    private String content;

    private Date created_at;

    private String rank;

    private String status;

    private Date updated_at;

    @Property("user_id")
    private String userId;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

  /*  public ObjectId getCommentableId() {
        return commentableId;
    }

    public void setCommentableId(ObjectId commentableId) {
        this.commentableId = commentableId;
    }
*/
    public String getCommentableType() {
        return commentableType;
    }

    public void setCommentableType(String commentableType) {
        this.commentableType = commentableType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentableId() {
        return commentableId;
    }

    public void setCommentableId(String commentableId) {
        this.commentableId = commentableId;
    }
}
