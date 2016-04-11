package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
* @ClassName: RelationEntity 
* @Description: 广告关联表
* @author shaozhou 
* @date 2016年3月14日 下午2:26:09
 */
public class RelationEntity implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -5878414723892305186L;
	private Integer id;
	private String name;
	private String code;
	private Integer content_type;//1jpg 2swf
	private String content_url;//url
	private Integer status;//关联状态
	private Integer create_by;
	private Date create_at;
	private Integer update_by;
	private Date update_at;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the content_type
	 */
	public Integer getContent_type() {
		return content_type;
	}
	/**
	 * @param content_type the content_type to set
	 */
	public void setContent_type(Integer content_type) {
		this.content_type = content_type;
	}
	/**
	 * @return the content_url
	 */
	public String getContent_url() {
		return content_url;
	}
	/**
	 * @param content_url the content_url to set
	 */
	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}
	/**
	 * @return the create_by
	 */
	public Integer getCreate_by() {
		return create_by;
	}
	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}
	/**
	 * @return the create_at
	 */
	public Date getCreate_at() {
		return create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	/**
	 * @return the update_by
	 */
	public Integer getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(Integer update_by) {
		this.update_by = update_by;
	}
	/**
	 * @return the update_at
	 */
	public Date getUpdate_at() {
		return update_at;
	}
	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}
