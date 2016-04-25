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
	 * 商品分类
	 */
	private static final long serialVersionUID = -3491400779856182500L;
	@Id
	private ObjectId id;
	private String name;//分类名
	private String logoUrl;//图标
	private Date createAt;//创建时间
	private List<ObjectId> parentids;//所有父类id
	private ObjectId parentid;//直属父类id
	private int type;//分类级别 1 2 3
	private List<ObjectId> columnIds;//商品分类对应的规格项id
	private int commodityCount;//该分类下属商品数量
	private boolean isPopular=false;//是否是热门分类 true表示热门分类
	private String popularImg;//热门分类图片
	private int sequence = 0; ///< 排序字段,数字越大越靠前

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

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

	public String getPopularImg() {
		return popularImg;
	}

	public void setPopularImg(String popularImg) {
		this.popularImg = popularImg;
	}

	@Override
	public String toString() {
		return "CommodityCategory{" +
				"columnIds=" + columnIds +
				", id=" + id +
				", name='" + name + '\'' +
				", logoUrl='" + logoUrl + '\'' +
				", createAt=" + createAt +
				", parentids=" + parentids +
				", parentid=" + parentid +
				", type=" + type +
				", commodityCount=" + commodityCount +
				", isPopular=" + isPopular +
				", popularImg='" + popularImg + '\'' +
				'}';
	}
}
