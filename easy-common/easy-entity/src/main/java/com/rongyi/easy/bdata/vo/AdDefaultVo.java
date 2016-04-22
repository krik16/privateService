package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

public class AdDefaultVo implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1145396268068654702L;
	// 默认素材Id
	private int defaultId = 0;
	// 素材名称
	private String name = "";
	// 广告位置ID
	private int position_id = 0;
	// 广告位置名称
	private String position_name = "";
	// 模板ID
	private int moduleId = 0;
	// 模板内容
	private String content_url = "";
	// 素材的类型
	private int content_type = 0;
	// 排序
	private int seq = 0;
	private String create_by;//记录创建人名称
	private Long create_at;//记录创建时间long
	private String update_by;//更新人名称
	private Long update_at;//记录更新时间long
	private Integer status;//状态 1 有效 0 无效
	private String sub_type;//全屏为空，330_home_a,330_home_d,318_home_b,318_home_d
	/**
	 * @return the defaultId
	 */
	public int getDefaultId() {
		return defaultId;
	}
	/**
	 * @param defaultId the defaultId to set
	 */
	public void setDefaultId(int defaultId) {
		this.defaultId = defaultId;
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
	 * @return the position_id
	 */
	public int getPosition_id() {
		return position_id;
	}
	/**
	 * @param position_id the position_id to set
	 */
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	/**
	 * @return the position_name
	 */
	public String getPosition_name() {
		return position_name;
	}
	/**
	 * @param position_name the position_name to set
	 */
	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}
	/**
	 * @return the moduleId
	 */
	public int getModuleId() {
		return moduleId;
	}
	/**
	 * @param moduleId the moduleId to set
	 */
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
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
	 * @return the content_type
	 */
	public int getContent_type() {
		return content_type;
	}
	/**
	 * @param content_type the content_type to set
	 */
	public void setContent_type(int content_type) {
		this.content_type = content_type;
	}
	/**
	 * @return the seq
	 */
	public int getSeq() {
		return seq;
	}
	/**
	 * @param seq the seq to set
	 */
	public void setSeq(int seq) {
		this.seq = seq;
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
	 * @return the sub_type
	 */
	public String getSub_type() {
		return sub_type;
	}
	/**
	 * @param sub_type the sub_type to set
	 */
	public void setSub_type(String sub_type) {
		this.sub_type = sub_type;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年4月1日 下午6:56:10
	* @throws 
	*/
	@Override
	public String toString() {
		return "AdDefaultVo [defaultId=" + defaultId + ", name=" + name + ", position_id=" + position_id
				+ ", position_name=" + position_name + ", moduleId=" + moduleId + ", content_url=" + content_url
				+ ", content_type=" + content_type + ", seq=" + seq + ", create_by=" + create_by + ", create_at="
				+ create_at + ", update_by=" + update_by + ", update_at=" + update_at + ", status=" + status
				+ ", sub_type=" + sub_type + "]";
	}
}
