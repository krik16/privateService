package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.inject.internal.Lists;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 活动详情
 * Created by Leon on 2016/1/28.
 */
public class ActivityInfoVOV2 implements Serializable {

    /**
     * 活动id
     */
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动开始时间
     */
    private Date startAt;

    /**
     * 活动结束时间
     */
    private Date endAt;

    /**
     * 活动类型 7秒杀
     */
    private Integer type;

    
    
    /**
     * 支付过期时间
     */
    private Integer cancleTime;
    
    /**报名开始时间*/
    private Date enrollStartAt;
    
    /**报名开始时间*/
    private Date enrollEndAt;
    
    /**可报名用户1店长2导购3买手*/
    private String  enrollUserType;
    
    
    /**参与商品类型*/
    private EntryLimitMallShopDTO entryLimitMallShop;//分类

    private List<EntryLimitGoodsCategory> entryLimitGoodsCategorys = Lists.newArrayList();
    
    
    
    private String activityDesc;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updateAt;

    

    
    
    
    

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








	public Integer getCancleTime() {
		return cancleTime;
	}








	public void setCancleTime(Integer cancleTime) {
		this.cancleTime = cancleTime;
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








	public String getEnrollUserType() {
		return enrollUserType;
	}








	public void setEnrollUserType(String enrollUserType) {
		this.enrollUserType = enrollUserType;
	}








	public EntryLimitMallShopDTO getEntryLimitMallShop() {
		return entryLimitMallShop;
	}








	public void setEntryLimitMallShop(EntryLimitMallShopDTO entryLimitMallShop) {
		this.entryLimitMallShop = entryLimitMallShop;
	}








	public List<EntryLimitGoodsCategory> getEntryLimitGoodsCategorys() {
		return entryLimitGoodsCategorys;
	}








	public void setEntryLimitGoodsCategorys(List<EntryLimitGoodsCategory> entryLimitGoodsCategorys) {
		this.entryLimitGoodsCategorys = entryLimitGoodsCategorys;
	}








	public String getActivityDesc() {
		return activityDesc;
	}








	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
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








	@Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("type", type)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("cancleTime", cancleTime)
                .toString();
    }
}
