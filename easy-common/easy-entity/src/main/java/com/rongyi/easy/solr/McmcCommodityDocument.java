package com.rongyi.easy.solr;

import java.util.Date;
import java.util.List;

import org.apache.solr.client.solrj.beans.Field;
import org.apache.solr.common.SolrDocument;

public class McmcCommodityDocument implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6516058338575306587L;
	@Field
	private String id;
	@Field("category1")
	private String category1;
	@Field("category2")
	private String category2;
	@Field("category3")
	private String category3;
	@Field("category4")
	private String category4;
	@Field("commodityName")
	private String commodityName;
	@Field("commodityCode")
	private String commodityCode;
	@Field("commodityShopId")
	private String commodityShopId;
	@Field("zone_ids")
	private List<String> zone_ids;
	@Field("status")
	private Integer status;
	@Field("sold")
	private Integer sold;
	@Field("public_start")
	private Date public_start;
	@Field("position")
	private String position;
	@Field("brand_id")
	private String brand_id;
	@Field("category_ids")
	private List<String> category_ids;
	@Field("commodityMallId")
	private String commodityMallId;
	@Field("commodityBrandId")
	private String commodityBrandId;
	@Field("price")
	private double price;
	@Field("isSpot")
	private boolean isSpot;
	@Field("type")
	private int type;
	@Field("liveId")
	private String liveId;
	@Field("liveStartTime")
	private Date liveStartTime;
	@Field("liveEndTime")
	private Date liveEndTime;
	@Field("createBy")
	private String createBy;
	@Field("commodityNameSubdiv")
	private String commodityNameSubdiv;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String getCommodityMallId() {
		return commodityMallId;
	}

	public void setCommodityMallId(String commodityMallId) {
		this.commodityMallId = commodityMallId;
	}

	public String getCommodityBrandId() {
		return commodityBrandId;
	}

	public void setCommodityBrandId(String commodityBrandId) {
		this.commodityBrandId = commodityBrandId;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public List<String> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<String> category_ids) {
		this.category_ids = category_ids;
	}

	public List<String> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSold() {
		return sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}

	public Date getPublic_start() {
		return public_start;
	}

	public void setPublic_start(Date public_start) {
		this.public_start = public_start;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityShopId() {
		return commodityShopId;
	}

	public void setCommodityShopId(String commodityShopId) {
		this.commodityShopId = commodityShopId;
	}

	public McmcCommodityDocument(){
		
	}
	
	public McmcCommodityDocument(SolrDocument doc){
		this.id = doc.getFieldValue("id").toString();
		this.category1 = doc.getFieldValue("category1").toString();
		this.category2 = doc.getFieldValue("category2").toString();
		this.category3 = doc.getFieldValue("category3").toString();
//		this.category4 = doc.getFieldValue("category4").toString();
		this.commodityName = doc.getFieldValue("commodityName").toString();
		this.commodityCode = doc.getFieldValue("commodityCode").toString();
		this.commodityShopId = doc.getFieldValue("commodityShopId").toString();
		this.commodityNameSubdiv = doc.getFieldValue("commodityNameSubdiv").toString();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory1() {
		return category1;
	}
	public void setCategory1(String category1) {
		this.category1 = category1;
	}
	public String getCategory2() {
		return category2;
	}
	public void setCategory2(String category2) {
		this.category2 = category2;
	}
	public String getCategory3() {
		return category3;
	}
	public void setCategory3(String category3) {
		this.category3 = category3;
	}
	public String getCategory4() {
		return category4;
	}
	public void setCategory4(String category4) {
		this.category4 = category4;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityNameSubdiv() {
		return commodityNameSubdiv;
	}
	public void setCommodityNameSubdiv(String commodityNameSubdiv) {
		this.commodityNameSubdiv = commodityNameSubdiv;
	}

	public boolean isSpot() {
		return isSpot;
	}

	public void setSpot(boolean isSpot) {
		this.isSpot = isSpot;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public Date getLiveStartTime() {
		return liveStartTime;
	}

	public void setLiveStartTime(Date liveStartTime) {
		this.liveStartTime = liveStartTime;
	}

	public Date getLiveEndTime() {
		return liveEndTime;
	}

	public void setLiveEndTime(Date liveEndTime) {
		this.liveEndTime = liveEndTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

}
