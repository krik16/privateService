package com.rongyi.easy.mcmc;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("mcmc_commodity_spec")
public class CommoditySpec implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3600412246221700037L;

	@Id
	private ObjectId id;
	private String stock;
	private String originalPrice;
	private String currentPrice;
	private List<ObjectId> columnIds;
	private List<String> columnValues;//规格属性
	private List<String> columnNotes;//规格备注
	private String extendColums;
	private Date createAt;
	private Date updateAt;
	private String updateBy;
	private String pictureUrl;//规格图片
	private String total;//规格商品总数
	public List<ObjectId> getColumnIds() {
		return columnIds;
	}
	public void setColumnIds(List<ObjectId> columnIds) {
		this.columnIds = columnIds;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getExtendColums() {
		return extendColums;
	}
	public void setExtendColums(String extendColums) {
		this.extendColums = extendColums;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public List<String> getColumnValues() {
		return columnValues;
	}
	public void setColumnValues(List<String> columnValues) {
		this.columnValues = columnValues;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public List<String> getColumnNotes() {
		return columnNotes;
	}
	public void setColumnNotes(List<String> columnNotes) {
		this.columnNotes = columnNotes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((columnIds == null) ? 0 : columnIds.hashCode());
		result = prime * result
				+ ((columnNotes == null) ? 0 : columnNotes.hashCode());
		result = prime * result
				+ ((columnValues == null) ? 0 : columnValues.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommoditySpec other = (CommoditySpec) obj;
		if (columnIds == null) {
			if (other.columnIds != null)
				return false;
		} else if (!columnIds.equals(other.columnIds))
			return false;
		if (columnNotes == null) {
			if (other.columnNotes != null)
				return false;
		} else if (!columnNotes.equals(other.columnNotes))
			return false;
		if (columnValues == null) {
			if (other.columnValues != null)
				return false;
		} else if (!columnValues.equals(other.columnValues))
			return false;
		return true;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
	
}
