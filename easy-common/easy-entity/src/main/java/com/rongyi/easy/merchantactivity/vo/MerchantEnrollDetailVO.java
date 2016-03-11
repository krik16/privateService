package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/10
 * TIME : 18:30
 * ideaworkspace.
 */
public class MerchantEnrollDetailVO implements Serializable {

    private Integer activityId;

    private String title;

    private String content;

    private String status;
    /**1报名进行中，2已报名 3报名已截至 4活动已结束*/
    private Integer statusCode;

    private Date enrollStartAt;

    private Date enrollEndAt;

    private int enrollGoodsCount;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Date getEnrollStartAt() {
        return enrollStartAt;
    }

    public void setEnrollStartAt(Date enrollStartAt) {
        this.enrollStartAt = enrollStartAt;
    }

    public Date getEnrollEndAt() {
        return enrollEndAt;
    }

    public void setEnrollEndAt(Date enrollEndAt) {
        this.enrollEndAt = enrollEndAt;
    }

    public int getEnrollGoodsCount() {
        return enrollGoodsCount;
    }

    public void setEnrollGoodsCount(int enrollGoodsCount) {
        this.enrollGoodsCount = enrollGoodsCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("title", title)
                .append("content", content)
                .append("status", status)
                .append("statusCode", statusCode)
                .append("enrollStartAt", enrollStartAt)
                .append("enrollEndAt", enrollEndAt)
                .append("enrollGoodsCount", enrollGoodsCount)
                .toString();
    }
}
