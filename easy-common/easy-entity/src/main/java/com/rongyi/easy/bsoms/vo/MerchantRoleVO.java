package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商家角色VO
 * @author hebo 2015/08/07
 *
 */
public class MerchantRoleVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer type;
	private Integer identity;
	/** 商场的mongoId */
	private String mallId;
	private String mallName;
	/** 集团的mongoId */
	private String groupId;
	private String groupName;
	/** 品牌的mongoId */
	private String brandId;
	private String brandName;
	private List<String> auths;
	
	private Integer id;
	private String name;//商家角色名
	private Integer status;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String stopReason;
	private Date stopTime;
	private Integer createSource;
	//分公司的MongoId
	private String filialeId;
	//店铺的MongoId
	private String shopId;
	
	/** 分公司名称 */
	private String filialeName; 
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<String> getAuths() {
		return auths;
	}
	public void setAuths(List<String> auths) {
		this.auths = auths;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getStopReason() {
		return stopReason;
	}
	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public Date getStopTime() {
		return stopTime;
	}
	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}
	public Integer getCreateSource() {
		return createSource;
	}
	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}
	public String getFilialeId() {
		return filialeId;
	}
	public void setFilialeId(String filialeId) {
		this.filialeId = filialeId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getFilialeName() {
		return filialeName;
	}
	public void setFilialeName(String filialeName) {
		this.filialeName = filialeName;
	}
	
}
