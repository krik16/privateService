package com.rongyi.easy.merchantactivity.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/20
 * TIME : 22:17
 * ideaworkspace.
 */
public class MerchantCheckGoodsParam implements Serializable {
    private Integer goodsId;
    /**
     * 1 取消资格 2,审核通过 3审核退回 4 申请撤销同意  5 申请撤销拒绝
     */
    private Integer status;

    private String content;

    private Date joinStartAt;

    private Date joinEndAt;

    private String userName;

    private String userId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("goodsId", goodsId)
                .append("status", status)
                .append("content", content)
                .append("joinStartAt", joinStartAt)
                .append("joinEndAt", joinEndAt)
                .append("userName", userName)
                .append("userId", userId)
                .toString();
    }
}
