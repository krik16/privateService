package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.activitymanage.entity.ActivityGoodsRule;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.activitymanage.vo easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/25
 * TIME : 16:41
 * easy-api.
 */
public class ActivityInfoListVOV2 implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4266300898438841928L;
	/**活动id*/
    private Integer id;
   /**活动名称*/
    private String name;
   /**活动开始时间*/
    private Date startAt;
    /**活动结束时间*/
    private Date endAt;
    /**活动类型7秒杀'*/
    private Integer type;
    /**发布终端*/
    private String synTarget;
    private Date enrollStartAt;//报名开始时间
    private Date enrollEndAt;//报名结束时间
    /**活动状态  0.未开始、1已开始、2已结束、3已下线
     */
    private Integer status;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
   /**通过审核商品个数*/
    private Integer goodsAlowedCount;
    /**场次个数*/
    private Integer activityRoundCount;
    /**报名商品总数*/
    private Integer goodsJoininTotalCount;
    /**已经分配的商品数*/
    private Integer goodsApplyToRoundCount;
    /**待审核的商品数*/
    private Integer goodsNeedAlowedCount;
    
    /**撤销商品数*/
    private Integer goodsCancelCount;
    
    
    /**模板编辑状态 */
    private boolean isTemplateEdit;


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


	public Integer getGoodsAlowedCount() {
		return goodsAlowedCount;
	}


	public void setGoodsAlowedCount(Integer goodsAlowedCount) {
		this.goodsAlowedCount = goodsAlowedCount;
	}


	public Integer getActivityRoundCount() {
		return activityRoundCount;
	}


	public void setActivityRoundCount(Integer activityRoundCount) {
		this.activityRoundCount = activityRoundCount;
	}


	public Integer getGoodsJoininTotalCount() {
		return goodsJoininTotalCount;
	}


	public void setGoodsJoininTotalCount(Integer goodsJoininTotalCount) {
		this.goodsJoininTotalCount = goodsJoininTotalCount;
	}


	public Integer getGoodsApplyToRoundCount() {
		return goodsApplyToRoundCount;
	}


	public void setGoodsApplyToRoundCount(Integer goodsApplyToRoundCount) {
		this.goodsApplyToRoundCount = goodsApplyToRoundCount;
	}


	public Integer getGoodsNeedAlowedCount() {
		return goodsNeedAlowedCount;
	}


	public void setGoodsNeedAlowedCount(Integer goodsNeedAlowedCount) {
		this.goodsNeedAlowedCount = goodsNeedAlowedCount;
	}


	public Integer getGoodsCancelCount() {
		return goodsCancelCount;
	}


	public void setGoodsCancelCount(Integer goodsCancelCount) {
		this.goodsCancelCount = goodsCancelCount;
	}


	public boolean isTemplateEdit() {
		return isTemplateEdit;
	}


	public void setTemplateEdit(boolean isTemplateEdit) {
		this.isTemplateEdit = isTemplateEdit;
	}


	@Override
	public String toString() {
		return "ActivityInfoListVOV2 [id=" + id + ", name=" + name + ", startAt=" + startAt + ", endAt=" + endAt
				+ ", type=" + type + ", synTarget=" + synTarget + ", enrollStartAt=" + enrollStartAt + ", enrollEndAt="
				+ enrollEndAt + ", status=" + status + ", createUser=" + createUser + ", createAt=" + createAt
				+ ", updateUser=" + updateUser + ", updateAt=" + updateAt + ", goodsAlowedCount=" + goodsAlowedCount
				+ ", activityRoundCount=" + activityRoundCount + ", goodsJoininTotalCount=" + goodsJoininTotalCount
				+ ", goodsApplyToRoundCount=" + goodsApplyToRoundCount + ", goodsNeedAlowedCount="
				+ goodsNeedAlowedCount + ", goodsCancelCount=" + goodsCancelCount + ", isTemplateEdit=" + isTemplateEdit
				+ "]";
	}
   
    
    
	

}
