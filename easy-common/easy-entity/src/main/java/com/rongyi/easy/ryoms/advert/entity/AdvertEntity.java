package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;

public class AdvertEntity implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 1174088826172866340L;
	private Integer id;
	private Integer position;//广告位置，参考ad_option中定义 1:全屏 2:首页banner
	private Integer adtime;//播放时长
	private Integer module_type;//素材模板 11 全屏模板-A 22 首页Banner-A
	private String content;//素材内容
	private Integer content_type;//素材类型 1:图片,2:视频
	private Integer status;//广告状态 1待审核, 2审核未通过, 3(待发布,进行中,已结束),4已下线, 5已删除
	private Date publish_start;//发布开始时间
	private Date publish_end;//发布结束时间
	private Long group_id;//广告组id
	private Integer create_by;//创建人账号ID
	private Date create_at;//记录创建时间
	private Integer update_by;//更新人账号ID
	private Date update_at;//记录更新时间
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
	 * @return the position
	 */
	public Integer getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}
	/**
	 * @return the adtime
	 */
	public Integer getAdtime() {
		return adtime;
	}
	/**
	 * @param adtime the adtime to set
	 */
	public void setAdtime(Integer adtime) {
		this.adtime = adtime;
	}
	/**
	 * @return the module_type
	 */
	public Integer getModule_type() {
		return module_type;
	}
	/**
	 * @param module_type the module_type to set
	 */
	public void setModule_type(Integer module_type) {
		this.module_type = module_type;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
	 * @return the publish_start
	 */
	public Date getPublish_start() {
		return publish_start;
	}
	/**
	 * @param publish_start the publish_start to set
	 */
	public void setPublish_start(Date publish_start) {
		this.publish_start = publish_start;
	}
	/**
	 * @return the publish_end
	 */
	public Date getPublish_end() {
		return publish_end;
	}
	/**
	 * @param publish_end the publish_end to set
	 */
	public void setPublish_end(Date publish_end) {
		this.publish_end = publish_end;
	}
	/**
	 * @return the group_id
	 */
	public Long getGroup_id() {
		return group_id;
	}
	/**
	 * @param group_id the group_id to set
	 */
	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
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
