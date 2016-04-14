package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: AdvertReleaseEntity 
* @Description: 广告同步操作实体
* @author shaozhou 
* @date 2016年4月6日 下午2:07:45
 */
public class AdvertReleaseEntity implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1249228049985013295L;
	private Integer id;
	private Integer sync_by;
	private String sync_name;
	private Integer sync_status;
	private String memo;
	private String reason;
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
	 * @return the sync_by
	 */
	public Integer getSync_by() {
		return sync_by;
	}
	/**
	 * @param sync_by the sync_by to set
	 */
	public void setSync_by(Integer sync_by) {
		this.sync_by = sync_by;
	}
	/**
	 * @return the sync_name
	 */
	public String getSync_name() {
		return sync_name;
	}
	/**
	 * @param sync_name the sync_name to set
	 */
	public void setSync_name(String sync_name) {
		this.sync_name = sync_name;
	}
	/**
	 * @return the sync_status
	 */
	public Integer getSync_status() {
		return sync_status;
	}
	/**
	 * @param sync_status the sync_status to set
	 */
	public void setSync_status(Integer sync_status) {
		this.sync_status = sync_status;
	}
	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
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
}
