package com.rongyi.easy.mcmc;


import java.io.Serializable;
import java.util.*;

import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
import com.rongyi.easy.mcmc.vo.OperateCommodityVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity(value="mcmc_commodity_spec",noClassnameStored=true)
public class CommoditySpec implements  Serializable {

	/**
	 * 商品规格
	 */
	private static final long serialVersionUID = 3600412246221700037L;

	@Id
	private ObjectId id;
	private String stock;//剩余库存
	private String originalPrice;//规格原价
	private String currentPrice;//规格现价
	private List<ObjectId> columnIds;//规格id
	private List<String> columnValues;//规格属性
	private List<String> columnValueIds;//规格属性id
	private List<String> columnNotes;//规格备注
	private String extendColums;
	private Date createAt;//创建时间
	private Date updateAt;//修改时间
	private String updateBy;//修改人
	private String pictureUrl;//规格图片
	private String lockedStock;//锁定库存
	private String total;//规格商品总数 包括卖出和未卖出的
	private String sku;//规格sku
	private String referencePrice;

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

	public String getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(String referencePrice) {
		this.referencePrice = referencePrice;
	}

	public List<String> getColumnValueIds() {
		return columnValueIds;
	}

	public void setColumnValueIds(List<String> columnValueIds) {
		this.columnValueIds = columnValueIds;
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
		result = prime * result
				+ ((columnValueIds == null) ? 0 : columnValueIds.hashCode());
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
		if (columnValueIds == null) {
			if (other.columnValueIds != null)
				return false;
		} else if (!columnValueIds.equals(other.columnValueIds))
			return false;
		return true;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getLockedStock() {
		return lockedStock;
	}

	public void setLockedStock(String lockedStock) {
		this.lockedStock = lockedStock;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void wrapSpecInfo(CommoditySpecVO vo) {
		this.setCreateAt(new Date());
		this.setUpdateAt(new Date());
		this.setOriginalPrice(vo.getSpecOriginalPrice());
		this.setCurrentPrice(vo.getSpecOriginalPrice());
		this.setSku(vo.getSku());
		this.setCurrentPrice(vo.getSpecCurrentPrice());
		if(vo.getSpecStock() == null || vo.getSpecStock().isEmpty()) {
			vo.setSpecStock("99");
		}
		this.setTotal(vo.getSpecStock());
		this.setStock(vo.getSpecStock());
		this.setPictureUrl(vo.getSpecPictureUrl());
		this.setReferencePrice(vo.getReferencePrice());
	}

	/**
	 * 重构：新vo
	 * @param vo
	 */
	public void wrapSpecInfo(com.rongyi.easy.mcmc.vo.commodity.new1.CommoditySpecVO vo) {
		// 编辑时，查出的spec的创建时间保留不变
		if (null == this.createAt) {
			this.setCreateAt(new Date());
		}
		this.setUpdateAt(new Date());
		this.setOriginalPrice(vo.getSpecOriginalPrice());
		this.setSku(vo.getSku());
		this.setCurrentPrice(StringUtils.isNotBlank(vo.getSpecCurrentPrice()) ? vo.getSpecCurrentPrice() : vo.getSpecOriginalPrice());
		if(vo.getSpecStock() == null || vo.getSpecStock().isEmpty()) {
			vo.setSpecStock("99");
		}
		if (null != vo.getSpecId() && StringUtils.isNotBlank(getTotal()) && getTotal().matches("\\d+")
				&& StringUtils.isNotBlank(vo.getSpecStock()) && vo.getSpecStock().matches("\\d+")
				&& StringUtils.isNotBlank(getStock()) && getStock().matches("\\d+")) {
			this.setTotal(String.valueOf(Integer.valueOf(getTotal())
					+ Integer.valueOf(vo.getSpecStock())
					- Integer.valueOf(getStock())));
		} else {
			this.setTotal(vo.getSpecStock());
		}

		this.setStock(vo.getSpecStock());
		this.setPictureUrl(vo.getSpecPictureUrl());
		this.setReferencePrice(vo.getReferencePrice());
	}
}
