package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value="mcmc_commodity_spec_column",noClassnameStored=true)
public class CommoditySpecColumn implements  Serializable{

	/**
	 * 商品规格名
	 */
	private static final long serialVersionUID = 9099780604289373639L;
	@Id
	private ObjectId id;
	private String name;//规格名
	private boolean isRequired;//是否必填
	private String description;//规格说明
	private Boolean hasClassification;//是否含有分类
	private Integer status;//-1 删除状态，0正常
	private Integer createBy;//创建人id
	private Date createAt;//创建时间
	private Integer updateBy;//修改人id
	private Date updateAt;//修改时间
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getHasClassification() {
		return hasClassification;
	}
	public void setHasClassification(Boolean hasClassification) {
		this.hasClassification = hasClassification;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Integer getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "CommoditySpecColumn [id=" + id + ", name=" + name
				+ ", isRequired=" + isRequired + ", description=" + description
				+ ", hasClassification=" + hasClassification + ", status="
				+ status + ", createBy=" + createBy + ", createAt=" + createAt
				+ ", updateBy=" + updateBy + ", updateAt=" + updateAt + "]";
	}
	
}
