package com.rongyi.easy.malllife.pojo;

import java.io.Serializable;
import java.util.Date;

public class ContentConnectPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8505219504906378600L;
	private Integer connectId;//主键
	private String type;//文章关联类型  city,mall,brand,shop,all'
	private Integer content_id;//关联文章id
	private String reference_id;//文章关联类型id mall_id,brand_id,shop_id,city_id
	private Double longitude; //经度
	private Double latitude; //纬度
	private String prov_mid;//省id
	private String city_mid;//城市id
	private String address;//详细地址
	private Date create_at;//记录开始时间
	private Date update_at;//记录更新时间
	private String relation;//文章关联 直接关联和间接关联区分字段  直接关联direct, 间接关联indirect
	
	public Integer getConnectId() {
		return connectId;
	}
	public void setConnectId(Integer connectId) {
		this.connectId = connectId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getContent_id() {
		return content_id;
	}
	public void setContent_id(Integer content_id) {
		this.content_id = content_id;
	}
	public String getReference_id() {
		return reference_id;
	}
	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public String getProv_mid() {
		return prov_mid;
	}
	public void setProv_mid(String prov_mid) {
		this.prov_mid = prov_mid;
	}
	public String getCity_mid() {
		return city_mid;
	}
	public void setCity_mid(String city_mid) {
		this.city_mid = city_mid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
}
