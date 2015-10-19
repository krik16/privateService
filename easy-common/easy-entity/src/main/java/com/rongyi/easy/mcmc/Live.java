package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 买手直播
 * @author xiaobo
 *
 */
@Entity("mcmc_live")
public class Live implements  Serializable{	
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
	 * 直播状态 [0:发布/预热中，1:上线/进行中，2:下线(已过期)]
	 */
	private int status;
	/**
	 * 描述
	 */
	private String detail;
	/**
	 * 商场或者街边店id
	 */
	private Object zoneId;
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
	public Object getZoneId() {
		return zoneId;
	}
	public void setZoneId(Object zoneId) {
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

	
	
}
