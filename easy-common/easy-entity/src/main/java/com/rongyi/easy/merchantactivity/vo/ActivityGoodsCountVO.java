package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * 某个活动中商品的数量统计
 * User:lijing
 * DATE : 2016/3/18
 * TIME : 11:56
 * ideaworkspace.
 */
public class ActivityGoodsCountVO implements Serializable {
    /**
     * 所有商品
     */
    private Integer allGoodsCount;

    /**
     * 通过商品
     */
    private Integer passGoodsCount;

    /**
     * 商品撤销数量
     */
    private Integer revokeGoodsCount;
    /**
     * 下线商品数量
     */
    private Integer offlineGoodsCount;

    /**
     * 待审核的商品数量
     */
    private Integer auditGoodsCount;
   /**
    * 退回的商品数量
    */
    private Integer backGoodsCount;

    public Integer getAllGoodsCount() {
        return allGoodsCount;
    }

    public void setAllGoodsCount(Integer allGoodsCount) {
        this.allGoodsCount = allGoodsCount;
    }

    public Integer getPassGoodsCount() {
        return passGoodsCount;
    }

    public void setPassGoodsCount(Integer passGoodsCount) {
        this.passGoodsCount = passGoodsCount;
    }

    public Integer getRevokeGoodsCount() {
        return revokeGoodsCount;
    }

    public void setRevokeGoodsCount(Integer revokeGoodsCount) {
        this.revokeGoodsCount = revokeGoodsCount;
    }

    public Integer getOfflineGoodsCount() {
        return offlineGoodsCount;
    }

    public void setOfflineGoodsCount(Integer offlineGoodsCount) {
        this.offlineGoodsCount = offlineGoodsCount;
    }

    public Integer getAuditGoodsCount() {
        return auditGoodsCount;
    }

    public void setAuditGoodsCount(Integer auditGoodsCount) {
        this.auditGoodsCount = auditGoodsCount;
    }

    public Integer getBackGoodsCount() {
        return backGoodsCount;
    }

    public void setBackGoodsCount(Integer backGoodsCount) {
        this.backGoodsCount = backGoodsCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("allGoodsCount", allGoodsCount)
                .append("passGoodsCount", passGoodsCount)
                .append("revokeGoodsCount", revokeGoodsCount)
                .append("offlineGoodsCount", offlineGoodsCount)
                .append("auditGoodsCount", auditGoodsCount)
                .append("backGoodsCount", backGoodsCount)
                .toString();
    }
}
