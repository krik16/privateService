package com.rongyi.easy.malllife.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Result implements Serializable{

@Expose
private String addr;
@SerializedName("city_name")
@Expose
private String cityName;
@SerializedName("created_at")
@Expose
private String createdAt;
@Expose
private String description;
@Expose
private String id;
@Expose
private String label;
@Expose
private List<Double> location = new ArrayList<Double>();
@Expose
private String name;
@SerializedName("pic_url")
@Expose
private String picUrl;
@SerializedName("shop_own")
@Expose
private String shopOwn;
@Expose
private List<String> zones = new ArrayList<String>();
@SerializedName("holder_id")
@Expose
private String holderId;
@SerializedName("holder_type")
@Expose
private String holderType;
@Expose
private String thumbnail;
@Expose
private String title;
@Expose
private String type;

private String distance;

/** 0:,1: */
@Expose
private String grouponStyle;

private String grouponPrice;

private String grouponOriginal;

/** 踩过人数 */
private String vistedNum;

private String start_time;

private String end_time;

public String getDistance() {
	return distance;
}

public void setDistance(String distance) {
	this.distance = distance;
}

public String getAddr() {
return addr;
}

public void setAddr(String addr) {
this.addr = addr;
}

public String getCityName() {
return cityName;
}

public void setCityName(String cityName) {
this.cityName = cityName;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
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

public String getLabel() {
return label;
}

public void setLabel(String label) {
this.label = label;
}

public List<Double> getLocation() {
return location;
}

public void setLocation(List<Double> location) {
this.location = location;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getPicUrl() {
return picUrl;
}

public void setPicUrl(String picUrl) {
this.picUrl = picUrl;
}

public String getShopOwn() {
return shopOwn;
}

public void setShopOwn(String shopOwn) {
this.shopOwn = shopOwn;
}

public List<String> getZones() {
return zones;
}

public void setZones(List<String> zones) {
this.zones = zones;
}

public String getHolderId() {
return holderId;
}

public void setHolderId(String holderId) {
this.holderId = holderId;
}

public String getHolderType() {
return holderType;
}

public void setHolderType(String holderType) {
this.holderType = holderType;
}

public String getThumbnail() {
return thumbnail;
}

public void setThumbnail(String thumbnail) {
this.thumbnail = thumbnail;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getGrouponStyle() {
    return grouponStyle;
}

public void setGrouponStyle(String grouponStyle) {
    this.grouponStyle = grouponStyle;
}

public String getVistedNum() {
    return vistedNum;
}

public void setVistedNum(String vistedNum) {
    this.vistedNum = vistedNum;
}


public String getGrouponPrice() {
    return grouponPrice;
}


public void setGrouponPrice(String grouponPrice) {
    this.grouponPrice = grouponPrice;
}


public String getGrouponOriginal() {
    return grouponOriginal;
}

public void setGrouponOriginal(String grouponOriginal) {
    this.grouponOriginal = grouponOriginal;
}

public String getStart_time() {
    return start_time;
}

public void setStart_time(String start_time) {
    this.start_time = start_time;
}

public String getEnd_time() {
    return end_time;
}

public void setEnd_time(String end_time) {
    this.end_time = end_time;
}

}
