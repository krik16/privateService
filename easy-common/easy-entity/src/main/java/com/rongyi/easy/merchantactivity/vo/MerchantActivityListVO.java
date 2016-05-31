package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * 商家活动模版列表
 * User:lijing
 * DATE : 2016/3/17
 * TIME : 13:48
 * ideaworkspace.
 */
public class MerchantActivityListVO implements Serializable {
    /**活动id*/
    private Integer id;
    /**活动名称*/
    private String name;
    /**活动开始时间*/
    private Date startAt;
    /**活动结束时间*/
    private Date endAt;
    /**活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖'*/
    private Integer type;
    /**发布终端:[1,1,1,1]表示容易逛、终端屏、微信、微商端全部选中[1,0,0,0]表示第一个选中*/
    private String synTarget;
    private Date enrollStartAt;//报名开始时间
    private Date enrollEndAt;//报名结束时间
    /**活动状态  0.待审核
     1.不通过
     2.未开始
     3.进行中
     4.已结束
     5 强下线
     6 申请撤销中
     */
    private Integer status;
    /**活动状态  0.待审核
     1.不通过
     2.未开始
     3.进行中
     4.已结束
     5 强下线
     */
    private Integer oriStatus;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
    /**待审核商品个数*/
    private Integer pendGoods;
    
    private Integer revokeGoods;

    private String relevanceId;
    private Integer relevanceType;
    /**模版类型*/
    private Integer activityType;
    /**报名商品总数*/
    private Integer goodsTotal;
    /**
     * 通过报名的商品
     */
    private Integer passGoods;
    /**
     * 是否自营
     */
    private Integer isAuto = 1;
    /**
     *
     */
    private String source;

    private List<MerchantRecordVo> records = new ArrayList<MerchantRecordVo>();
    /**
     * 商品数量
     */
    private ActivityGoodsCountVO activityGoodsCountVO;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
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

    public Integer getOriStatus() {
        return oriStatus;
    }

    public void setOriStatus(Integer oriStatus) {
        this.oriStatus = oriStatus;
    }

    public Integer getPendGoods() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getAuditGoodsCount();
        }
        return pendGoods;
    }

    public void setPendGoods(Integer pendGoods) {
        this.pendGoods = pendGoods;
    }

    public Integer getRevokeGoods() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getRevokeGoodsCount();
        }
        return revokeGoods;
    }

    public List<MerchantRecordVo> getRecords() {
        return records;
    }

    public void setRecords(List<MerchantRecordVo> records) {
        this.records = records;
    }

    public void setRevokeGoods(Integer revokeGoods) {
        this.revokeGoods = revokeGoods;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getGoodsTotal() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getAllGoodsCount();
        }
        return goodsTotal;
    }

    public void setGoodsTotal(Integer goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    public Integer getPassGoods() {
        if(activityGoodsCountVO != null){
            return activityGoodsCountVO.getPassGoodsCount();
        }
        return passGoods;
    }

    public void setPassGoods(Integer passGoods) {
        this.passGoods = passGoods;
    }

    public Integer getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(Integer isAuto) {
        this.isAuto = isAuto;
    }

    public ActivityGoodsCountVO getActivityGoodsCountVO() {
        return activityGoodsCountVO;
    }

    public void setActivityGoodsCountVO(ActivityGoodsCountVO activityGoodsCountVO) {
        this.activityGoodsCountVO = activityGoodsCountVO;
    }

    public String getRelevanceId() {
        return relevanceId;
    }

    public void setRelevanceId(String relevanceId) {
        this.relevanceId = relevanceId;
    }

    public Integer getRelevanceType() {
        return relevanceType;
    }

    public void setRelevanceType(Integer relevanceType) {
        this.relevanceType = relevanceType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("type", type)
                .append("synTarget", synTarget)
                .append("enrollStartAt", enrollStartAt)
                .append("enrollEndAt", enrollEndAt)
                .append("status", status)
                .append("oriStatus", oriStatus)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("pendGoods", pendGoods)
                .append("revokeGoods", revokeGoods)
                .append("relevanceId", relevanceId)
                .append("relevanceType", relevanceType)
                .append("activityType", activityType)
                .append("goodsTotal", goodsTotal)
                .append("passGoods", passGoods)
                .append("isAuto", isAuto)
                .append("records", records)
                .append("source", source)
                .append("activityGoodsCountVO", activityGoodsCountVO)
                .toString();
    }
}
