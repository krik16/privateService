package com.rongyi.easy.malllife.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value = "mall_notification", noClassnameStored = true)
public class NotificationEntity implements Serializable{
	@Id
    private ObjectId id;
	@Property("biz_district_id")
	private String bizDistrictId;//biz区域id
	@Property("btn_label1")
	private String btnlabel1;//按钮1标签
	@Property("btn_label2")
	private String btnlabel2;//按钮2标签
	@Property("created_time")
	private Date createTime;//创建时间
	@Property("creator_id")
	private Date creatorId;//创建人id
	@Property("distance")
	private Integer distance;//距离
	@Property("frequencey")
	private Integer frequencey;//周期
	@Property("description")
	private String description;//描述
    @Property("location")
    private List<String> location;//坐标
    @Property("mall_ids")
    private List<String> mall_ids;//商场ids
    @Property("perFromHour")
	private Integer perFromHour;//开始时间小时
    @Property("perFromMin")
	private Integer perFromMin;//开始时间分钟 
    @Property("perToHour")
	private Integer perToHour;//到的时间小时 
    @Property("perToMin")
   	private Integer perToMin;//到的时间分钟
    @Property("status")
   	private Integer status;//状态
    @Property("updated_time")
    private Date updatedTime;//修改时间
    @Property("zone_ids")
    private List<String> zone_ids;//位置id
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getBizDistrictId() {
		return bizDistrictId;
	}
	public void setBizDistrictId(String bizDistrictId) {
		this.bizDistrictId = bizDistrictId;
	}
	public String getBtnlabel1() {
		return btnlabel1;
	}
	public void setBtnlabel1(String btnlabel1) {
		this.btnlabel1 = btnlabel1;
	}
	public String getBtnlabel2() {
		return btnlabel2;
	}
	public void setBtnlabel2(String btnlabel2) {
		this.btnlabel2 = btnlabel2;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Date creatorId) {
		this.creatorId = creatorId;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Integer getFrequencey() {
		return frequencey;
	}
	public void setFrequencey(Integer frequencey) {
		this.frequencey = frequencey;
	}
	public List<String> getLocation() {
		return location;
	}
	public void setLocation(List<String> location) {
		this.location = location;
	}
	public List<String> getMall_ids() {
		return mall_ids;
	}
	public void setMall_ids(List<String> mall_ids) {
		this.mall_ids = mall_ids;
	}
	public Integer getPerFromHour() {
		return perFromHour;
	}
	public void setPerFromHour(Integer perFromHour) {
		this.perFromHour = perFromHour;
	}
	public Integer getPerFromMin() {
		return perFromMin;
	}
	public void setPerFromMin(Integer perFromMin) {
		this.perFromMin = perFromMin;
	}
	public Integer getPerToHour() {
		return perToHour;
	}
	public void setPerToHour(Integer perToHour) {
		this.perToHour = perToHour;
	}
	public Integer getPerToMin() {
		return perToMin;
	}
	public void setPerToMin(Integer perToMin) {
		this.perToMin = perToMin;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	public List<String> getZone_ids() {
		return zone_ids;
	}
	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}
    
    
	
	
}
