package com.rongyi.easy.mcmc;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
@Entity(value="mcmc_commodity_category",noClassnameStored=true)
public class CommodityCategory extends MalllifeBaseParam  implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3491400779856182500L;
	@Id
	private ObjectId id;
	private String name;
	private String logoUrl;
	private Date createAt;
	private List<ObjectId> parentids;
	private ObjectId parentid;
	private int type;
	private List<ObjectId> columnIds;//商品分类对应的规格项id
	private int commodityCount;
	private boolean isPopular=false;//是否是热门分类 true表示热门分类
	private boolean a=true;
	public int getCommodityCount() {
		return commodityCount;
	}
	public void setCommodityCount(int commodityCount) {
		this.commodityCount = commodityCount;
	}
	public List<ObjectId> getColumnIds() {
		return columnIds;
	}
	public void setColumnIds(List<ObjectId> columnIds) {
		this.columnIds = columnIds;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
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
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public List<ObjectId> getParentids() {
		return parentids;
	}
	public void setParentids(List<ObjectId> parentids) {
		this.parentids = parentids;
	}
	public ObjectId getParentid() {
		return parentid;
	}
	public void setParentid(ObjectId parentid) {
		this.parentid = parentid;
	}

	public boolean isPopular() {
		return isPopular;
	}

	public void setIsPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}

	@Override
	public String toString() {
		return "CommodityCategory [id=" + id + ", name=" + name + ", logoUrl=" + logoUrl + ", createAt=" + createAt
				+ ", parentids=" + parentids + ", parentid=" + parentid + ", type=" + type + ", columnIds=" + columnIds
				+ ", commodityCount=" + commodityCount + "]";
	}
}
