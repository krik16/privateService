package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.rongyi.core.enumerate.mcmc.LiveSortCode;
import com.rongyi.core.enumerate.mcmc.LiveStatus;

/**
 * 买手直播
 * 
 * @author xiaobo
 *
 */
@Entity(value="mcmc_live",noClassnameStored=true)
public class Live implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * mongo id
	 */
	@Id
	private ObjectId id;
	/**
	 * 直播名
	 */
	private String name;
	/**
	 * 直播开始时间
	 */
	private Date beginTime;
	/**
	 * 直播结束时间
	 */
	private Date endTime;
	/**
	 * 买手id
	 */
	private String bullId;
	/**
	 * 直播状态 [0:发布/预热中，1:上线/进行中，2:下线(已过期),-1代表删除]
	 */
	private int status;
	/**
	 * 描述
	 */
	private String detail;
	/**
	 * 商场或者街边店id
	 */
	private ObjectId zoneId;
	/**
	 * 商场或者街边店名称
	 */
	private String zoneName;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 坐标
	 */
	private List<Double> location;

	/**
	 * 品牌id列表
	 */
	private List<ObjectId> brandIds;

	/**
	 * 品牌名称列表
	 */
	private List<String> brandNames;

	/**
	 * 位置类型 0商场 1街边店
	 */
	private int zoneType;

	/**
	 * 买手名字
	 */
	private String bullName;

	/**
	 * 电话号
	 */
	private String phone;
	
	/**
	 * 排序字段
	 */
	private int sort;

	private List<String> urlList;

	public List<String> getUrlList() {
		return urlList;
	}

	public void setUrlList(List<String> urlList) {
		this.urlList = urlList;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getBullId() {
		return bullId;
	}

	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public ObjectId getZoneId() {
		return zoneId;
	}

	public void setZoneId(ObjectId zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public List<ObjectId> getBrandIds() {
		return brandIds;
	}

	public void setBrandIds(List<ObjectId> brandIds) {
		this.brandIds = brandIds;
	}

	public List<String> getBrandNames() {
		return brandNames;
	}

	public void setBrandNames(List<String> brandNames) {
		this.brandNames = brandNames;
	}

	public int getZoneType() {
		return zoneType;
	}

	public void setZoneType(int zoneType) {
		this.zoneType = zoneType;
	}

	public String getBullName() {
		return bullName;
	}

	public void setBullName(String bullName) {
		this.bullName = bullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSort() {
		return LiveSortCode.fromStatus(LiveStatus.fromValue(getStatus())).getValue();
	}

	@Override
	public String toString() {
		return "Live{" +
				"id=" + id +
				", name='" + name + '\'' +
				", beginTime=" + beginTime +
				", endTime=" + endTime +
				", bullId='" + bullId + '\'' +
				", status=" + status +
				", detail='" + detail + '\'' +
				", zoneId=" + zoneId +
				", zoneName='" + zoneName + '\'' +
				", createTime=" + createTime +
				", location=" + location +
				", brandIds=" + brandIds +
				", brandNames=" + brandNames +
				", zoneType=" + zoneType +
				", bullName='" + bullName + '\'' +
				", phone='" + phone + '\'' +
				", sort=" + sort +
				'}';
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Live live = new Live();
		live.setId(id);
		live.setName(name);
		live.setBeginTime(beginTime);
		live.setEndTime(endTime);
		live.setBullId(bullId);
		live.setStatus(status);
		live.setDetail(detail);
		live.setZoneId(zoneId);
		live.setZoneName(zoneName);
		live.setCreateTime(createTime);
		live.setLocation(location);
		live.setBrandIds(brandIds);
		live.setBrandNames(brandNames);
		live.setZoneType(zoneType);
		live.setBullName(bullName);
		live.setPhone(phone);
		live.setUrlList(urlList);
		return live;
	}

}
