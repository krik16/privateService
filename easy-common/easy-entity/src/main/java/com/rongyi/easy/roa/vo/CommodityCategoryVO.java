package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.CommodityCategory;

/**
 * roa 终端屏&微信 商品品类VO对象
 * @author ll
 * @date 2016-03-17
 */
public class CommodityCategoryVO implements Serializable {
	private static final long serialVersionUID = 1538837916482826353L;
	
	private String id;
	private String name;
	private int type;
	private List<String> parentIds;
	private String parentId;
	private String logoUrl;
	
	public CommodityCategoryVO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<String> getParentIds() {
		return parentIds;
	}

	public void setParentIds(List<String> parentIds) {
		this.parentIds = parentIds;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	@Override
	public String toString() {
		return "CommodityCategoryVO [id=" + id + ", name=" + name + ", type=" + type + ", parentIds=" + parentIds
				+ ", parentId=" + parentId + ", logoUrl=" + logoUrl + "]";
	}
	
	public CommodityCategoryVO toCommodityCategoryVO(CommodityCategory commodityCategory) {
		this.setId(commodityCategory.getId().toString());
		this.setLogoUrl(commodityCategory.getLogoUrl());
		this.setName(commodityCategory.getName());
		this.setParentId(commodityCategory.getParentid() != null ? commodityCategory.getParentid().toString() : null);
		if (commodityCategory.getParentids() != null) {
			List<String> pids = new ArrayList<String>();
			for (ObjectId objectId : commodityCategory.getParentids()) {
				pids.add(objectId.toString());
			}
			this.setParentIds(pids);
		}
		this.setType(commodityCategory.getType());
		return this;
	}
}
