package com.rongyi.easy.mcmc.vo;


import java.io.Serializable;
import java.util.List;

public class CommoditySpecVO2 implements  Serializable {
	
	private static final long serialVersionUID = -3491400779856182500L;
	
	private String id;
	private String originalPrice;//原价
	private String currentPrice;//现价
	private List<String> columnIds;//规格id
	private List<String> columnNames;//规格名字
	private List<String> columnValues;//规格属性
	private List<String> columnNotes;//规格备注	
	private String systemNumber;//系统编号
	private String shopMid;//对应商品所属店铺
	private String shopName;//对应商品所属店铺
	private String filialeMid;//店铺对应分公司
	private String filialeName;//店铺对应分公司
	private String position;//地理位置
	private String pictureUrl;//规格图片
	private int stock;//库存
	private int remain;//剩余量
	private int lockedStock;//锁定库存
	private String sku;

	private String commodityId;
	private String groupMid;
	private String groupName;
	private String mallMid;
	private String mallName;
	private Integer merchantType;

	public Integer getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(Integer merchantType) {
		this.merchantType = merchantType;
	}

	public String getGroupMid() {
		return groupMid;
	}

	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
	
	public List<String> getColumnIds() {
		return columnIds;
	}
	
	public void setColumnIds(List<String> columnIds) {
		this.columnIds = columnIds;
	}
	
	public List<String> getColumnNames() {
		return columnNames;
	}
	
	public void setColumnNames(List<String> columnNames) {
		this.columnNames = columnNames;
	}
	
	public List<String> getColumnValues() {
		return columnValues;
	}
	
	public void setColumnValues(List<String> columnValues) {
		this.columnValues = columnValues;
	}
	
	public String getSystemNumber() {
		return systemNumber;
	}
	
	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	public String getFilialeName() {
		return filialeName;
	}
	
	public void setFilialeName(String filialeName) {
		this.filialeName = filialeName;
	}
	
	public String getPictureUrl() {
		return pictureUrl;
	}
	
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getRemain() {
		return remain;
	}
	
	public void setRemain(int remain) {
		this.remain = remain;
	}
	
	public String getShopMid() {
		return shopMid;
	}
	
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	
	public String getFilialeMid() {
		return filialeMid;
	}
	
	public void setFilialeMid(String filialeMid) {
		this.filialeMid = filialeMid;
	}
	
	public List<String> getColumnNotes() {
		return columnNotes;
	}
	
	public void setColumnNotes(List<String> columnNotes) {
		this.columnNotes = columnNotes;
	}
	
	public int getLockedStock() {
		return lockedStock;
	}
	
	public void setLockedStock(int lockedStock) {
		this.lockedStock = lockedStock;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
}
