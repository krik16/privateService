package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: MaterialEntity
 * @Description: 素材新增/修改保存的实类
 * @author wangjh
 * @date 2016年2月15日 下午4:37:33
 */
public class AdDefaultEntity implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 132747644348319583L;
	// 默认素材ID
	private int defaultId = 0;
	// 素材名称
	private String name = "";
	// 广告位置ID
	private int position = 0;
	// 素材ID
	private int materialId = 0;
	// 用户ID
	private int userId = 0;
	// 排序
	private int seq = 0;
	private Integer create_by;
	private Date create_at;
	private Integer update_by;
	private Date update_at;
	private Integer content_type;
	private String content_url;
	private Integer status;
	private Integer module_type;//素材模板类型 素材模板 11 全屏模板-A 21 首页Banner-A 31 内页广告模板 12 全屏模板B-浮窗

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
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	/**
	 * @return the materialId
	 */
	public int getMaterialId() {
		return materialId;
	}
	/**
	 * @param materialId the materialId to set
	 */
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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

	public Integer getModule_type() {
		return module_type;
	}

	public void setModule_type(Integer module_type) {
		this.module_type = module_type;
	}
}
