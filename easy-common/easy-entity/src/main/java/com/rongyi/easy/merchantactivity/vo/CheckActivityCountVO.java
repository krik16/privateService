package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/20
 * TIME : 9:03
 * ideaworkspace.
 */
public class CheckActivityCountVO implements Serializable {

    /**
     * 所有活动
     */
    private Integer allActivityCount;


    /**
     * 待审核活动的数量
     */
    private Integer checkActivityCount;


    /**
     * 待审核商品的数量
     */
    private Integer checkActivityGoodCount;


    /**
     * 申请撤销中的活动
     */
    private Integer revokingActivityCount;


    /**
     * 申请撤销中的商品数量
     */
    private Integer revokingGoodsCount;


    /**
     *通过的活动数量
     */
    private Integer passActivityCount;


    /**
     * 通过的商品数量
     */
    private Integer passGoodsCount;


    /**
     * 退回活动数量
     */
    private Integer returnActivityCount;


    /**
     * 退回活动商品数量
     */
    private Integer returnGoodsCount;

    private ActivityGoodsCountVO activityGoodsCountVO;

    public Integer getAllActivityCount() {
        return allActivityCount;
    }

    public void setAllActivityCount(Integer allActivityCount) {
        this.allActivityCount = allActivityCount;
    }

    public Integer getCheckActivityCount() {
        return checkActivityCount;
    }

    public void setCheckActivityCount(Integer checkActivityCount) {
        this.checkActivityCount = checkActivityCount;
    }

    public Integer getCheckActivityGoodCount() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getAuditGoodsCount();
        }
        return checkActivityGoodCount;
    }

    public void setCheckActivityGoodCount(Integer checkActivityGoodCount) {
        this.checkActivityGoodCount = checkActivityGoodCount;
    }

    public Integer getRevokingActivityCount() {
        return revokingActivityCount;
    }

    public void setRevokingActivityCount(Integer revokingActivityCount) {
        this.revokingActivityCount = revokingActivityCount;
    }

    public Integer getRevokingGoodsCount() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getRevokeGoodsCount();
        }
        return revokingGoodsCount;
    }

    public void setRevokingGoodsCount(Integer revokingGoodsCount) {
        this.revokingGoodsCount = revokingGoodsCount;
    }

    public Integer getPassActivityCount() {
        return passActivityCount;
    }

    public void setPassActivityCount(Integer passActivityCount) {
        this.passActivityCount = passActivityCount;
    }

    public Integer getPassGoodsCount() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getPassGoodsCount();
        }
        return passGoodsCount;
    }

    public void setPassGoodsCount(Integer passGoodsCount) {
        this.passGoodsCount = passGoodsCount;
    }

    public Integer getReturnActivityCount() {
        return returnActivityCount;
    }

    public void setReturnActivityCount(Integer returnActivityCount) {
        this.returnActivityCount = returnActivityCount;
    }

    public Integer getReturnGoodsCount() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getBackGoodsCount();
        }
        return returnGoodsCount;
    }

    public void setReturnGoodsCount(Integer returnGoodsCount) {
        this.returnGoodsCount = returnGoodsCount;
    }

    public ActivityGoodsCountVO getActivityGoodsCountVO() {
        return activityGoodsCountVO;
    }

    public void setActivityGoodsCountVO(ActivityGoodsCountVO activityGoodsCountVO) {
        this.activityGoodsCountVO = activityGoodsCountVO;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("allActivityCount", allActivityCount)
                .append("checkActivityCount", checkActivityCount)
                .append("checkActivityGoodCount", checkActivityGoodCount)
                .append("revokingActivityCount", revokingActivityCount)
                .append("revokingGoodsCount", revokingGoodsCount)
                .append("passActivityCount", passActivityCount)
                .append("passGoodsCount", passGoodsCount)
                .append("returnActivityCount", returnActivityCount)
                .append("returnGoodsCount", returnGoodsCount)
                .append("activityGoodsCountVO", activityGoodsCountVO)
                .toString();
    }
}
