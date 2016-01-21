package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.util.Date;

public class CouponParamVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;// 券id
	  
	private String title;// 券名称
	
	private Integer totalCount;// 总量
	
    private Integer limitCount;// 每人限购数量
 
    private Integer discount;// 折扣价

    private String recommend;// 推荐说明
    
    private Date publishBeginDate;// 发布开始时间

    private Date publishEndDate;// 发布结束时间
    
    private Date validBeginDate;// 有效期开始时间

    private Date validEndDate;// 有效期结束时间
    
    private String synTarget;// 信息同步终端包含“互动屏:1、微信:1、摩生活:1”。（考虑）
    
    private String createUser;// 创建人id

    private Date createDate;// 创建时间

    private String updateUser;// 修改人id

    private Date updateDate;// 修改时间
    
    private String useDescription;// 使用说明 对应老优惠券使用方式
    
    public CouponParamVO(){
    	
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public Date getPublishBeginDate() {
		return publishBeginDate;
	}

	public void setPublishBeginDate(Date publishBeginDate) {
		this.publishBeginDate = publishBeginDate;
	}

	public Date getPublishEndDate() {
		return publishEndDate;
	}

	public void setPublishEndDate(Date publishEndDate) {
		this.publishEndDate = publishEndDate;
	}

	public Date getValidBeginDate() {
		return validBeginDate;
	}

	public void setValidBeginDate(Date validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

	public Date getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	public String getSynTarget() {
		return synTarget;
	}

	public void setSynTarget(String synTarget) {
		this.synTarget = synTarget;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUseDescription() {
		return useDescription;
	}

	public void setUseDescription(String useDescription) {
		this.useDescription = useDescription;
	}
    
}
