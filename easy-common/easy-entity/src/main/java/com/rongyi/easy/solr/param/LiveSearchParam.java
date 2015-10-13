package com.rongyi.easy.solr.param;

import java.io.Serializable;
/**
 * 直播
 * @author zzq
 *
 */
public class LiveSearchParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  	private String coord_x;   //坐标x
	private String coord_y;   //坐标y
	private String cat_id;    //0店铺1商场2品牌3分类（类似于美食）
 	private String sort;      //排序规则（distance，null，couponRequired（commodityRequired），date）
	private int from;         //页
	private int size = 50;         //一页数量
 	private String zone_id;   //区域id
 	private String mall_id;  //商场id 
 	private String city_name; //城市名（如  上海&上海市）
 	private String liveId;
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(String coord_x) {
		this.coord_x = coord_x;
	}
	public String getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(String coord_y) {
		this.coord_y = coord_y;
	}
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
 
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getZone_id() {
		return zone_id;
	}
	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}
 
	public String getMall_id() {
		return mall_id;
	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}
	
	
	
}
