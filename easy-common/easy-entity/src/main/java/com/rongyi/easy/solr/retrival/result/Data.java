package com.rongyi.easy.solr.retrival.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Data  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7822745933509989686L;
	private String id;
	private String name;
	private String addr;
	private String telephone;//四期电话添加
	private String pic_url;
	private double[] location;
	private ArrayList<String> zones=new ArrayList<String>();
	private ArrayList<String> categories=new ArrayList<String>();
//	private double _score;
	private String description;
	private String rank;
	private String city_name;
	private String shop_own;
	private String label;
	
	private Date created_at;
//	private String highlight;
//	private String _index;
//	private String _version;
//	private String _explannation;
//	private String sort;
//	private String _type;
	
	private String appearance_pic;
	
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getShop_own() {
		return shop_own;
	}
	public void setShop_own(String shop_own) {
		this.shop_own = shop_own;
	}	

	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}	
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public double[] getLocation() {
		return location;
	}
	public void setLocation(double[] location) {
		this.location = location;
	}
	public ArrayList<String> getZones() {
		return zones;
	}
	public void setZones(ArrayList<String> zones) {
		this.zones = zones;
	}
	public ArrayList<String> getCategories() {
		return categories;
	}
	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}
//	public double get_score() {
//		return _score;
//	}
//	public void set_score(double _score) {
//		this._score = _score;
//	}
//	public String getHighlight() {
//		return highlight;
//	}
//	public void setHighlight(String highlight) {
//		this.highlight = highlight;
//	}
//	public String get_index() {
//		return _index;
//	}
//	public void set_index(String _index) {
//		this._index = _index;
//	}
//	public String get_version() {
//		return _version;
//	}
//	public void set_version(String _version) {
//		this._version = _version;
//	}
//	public String get_explannation() {
//		return _explannation;
//	}
//	public void set_explannation(String _explannation) {
//		this._explannation = _explannation;
//	}
//	public String getSort() {
//		return sort;
//	}
//	public void setSort(String sort) {
//		this.sort = sort;
//	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
//	public String get_type() {
//		return _type;
//	}
//	public void set_type(String _type) {
//		this._type = _type;
//	}
	public String getAppearance_pic() {
		return appearance_pic;
	}
	public void setAppearance_pic(String appearance_pic) {
		this.appearance_pic = appearance_pic;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
