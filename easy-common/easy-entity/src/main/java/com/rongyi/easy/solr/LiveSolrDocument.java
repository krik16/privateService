/** 
* @Title: LiveSolrDocument.java 
* @Package com.rongyi.easy.solr 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年10月20日 上午10:42:02 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.solr.client.solrj.beans.Field;

/**
 * @author ZhengYl
 *
 */
public class LiveSolrDocument implements Serializable {

	/**  */
	private static final long serialVersionUID = -96563689157632330L;

	@Field("_id")
	private String _id;
	
	@Field("name")
	private String name;

	@Field("beginTime")
	private Date beginTime;
	
	@Field("endTime")
	private Date endTime;
	
	@Field("status")
	private Integer status;
	
	@Field("detail")
	private String detail;
	
	@Field("locId")
	private String locId;
	
	@Field("locName")
	private String locName;
	
	@Field("createTime")
	private Date createTime;
	
	@Field("zone_ids")
	private List<String> zone_ids;
	
	@Field("category_ids")
	private List<String> category_ids;
	
	@Field("position")
	private String position;

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<String> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public List<String> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<String> category_ids) {
		this.category_ids = category_ids;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
