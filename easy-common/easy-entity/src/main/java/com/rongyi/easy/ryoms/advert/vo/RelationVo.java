package com.rongyi.easy.ryoms.advert.vo;

import java.io.Serializable;

public class RelationVo implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -2734103998099757946L;
	private Integer relation_id;
	private String name;
	private String code;
	private Integer status;
	private Integer content_type;
	private String content_url;
	private String create_by;
	private Long create_at;
	private String update_by;
	private Long update_at;
	/**
	 * @return the relation_id
	 */
	public Integer getRelation_id() {
		return relation_id;
	}
	/**
	 * @param relation_id the relation_id to set
	 */
	public void setRelation_id(Integer relation_id) {
		this.relation_id = relation_id;
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
	/**
	 * @return the create_by
	 */
	public String getCreate_by() {
		return create_by;
	}
	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	/**
	 * @return the create_at
	 */
	public Long getCreate_at() {
		return create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Long create_at) {
		this.create_at = create_at;
	}
	/**
	 * @return the update_by
	 */
	public String getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	/**
	 * @return the update_at
	 */
	public Long getUpdate_at() {
		return update_at;
	}
	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Long update_at) {
		this.update_at = update_at;
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
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月15日 下午4:04:20
	* @throws 
	*/
	@Override
	public String toString() {
		return "RelationVo [relation_id=" + relation_id + ", name=" + name + ", code=" + code + ", status=" + status
				+ ", content_type=" + content_type + ", content_url=" + content_url + ", create_by=" + create_by
				+ ", create_at=" + create_at + ", update_by=" + update_by + ", update_at=" + update_at + "]";
	}
}
