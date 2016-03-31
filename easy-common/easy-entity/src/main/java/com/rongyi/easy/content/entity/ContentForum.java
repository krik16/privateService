package com.rongyi.easy.content.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 推荐版块
 * @author wzh
 *
 */
public class ContentForum implements Serializable{
	
	private static final long serialVersionUID = 1L;
    /**  */
    private Integer id;

    /**  */
    private Integer createBy;

    /**  */
    private Date createAt;

    /**  */
    private Integer updateBy;

    /**  */
    private Date updateAt;

    /**  */
    private Integer version;

    /**  */
    private Integer isDisabled;

    /**  */
    private String forumName;

    /**  */
    private String forumCode;

    /**  */
    private String forumComment;

    /**  */
    private String forumFormat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    
    public Integer getUpdateBy() {
        return updateBy;
    }
    
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
    
    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getForumName() {
        return forumName;
    }

    public void setForumName(String forumName) {
        this.forumName = forumName;
    }

    public String getForumCode() {
        return forumCode;
    }

    public void setForumCode(String forumCode) {
        this.forumCode = forumCode;
    }

    public String getForumComment() {
        return forumComment;
    }

    public void setForumComment(String forumComment) {
        this.forumComment = forumComment;
    }

    public String getForumFormat() {
        return forumFormat;
    }

    public void setForumFormat(String forumFormat) {
        this.forumFormat = forumFormat;
    }
}