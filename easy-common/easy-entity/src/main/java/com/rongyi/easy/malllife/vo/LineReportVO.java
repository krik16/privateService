package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 线报
 * @author baodk 2014年12月2日 上午11:22:03
 */
public class LineReportVO implements Serializable{

    private Integer id;

    /** 评论者昵称 */
    private String reviewerNickName;
    
    /** 联系方式 */
    private String contactInfo;
    
    /** 评论内容 */
    private String content;
    
    /** 评论时间 */
    private Date reviewTime;

    public String getReviewerNickName() {
        return reviewerNickName;
    }
    
    public void setReviewerNickName(String reviewerNickName) {
        this.reviewerNickName = reviewerNickName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

}
