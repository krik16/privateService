package com.rongyi.easy.solr;

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

}
