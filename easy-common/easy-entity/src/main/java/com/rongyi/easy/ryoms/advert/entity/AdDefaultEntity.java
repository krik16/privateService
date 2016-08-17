package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	//private int materialId = 0;
	// 用户ID
	private int userId = 0;
	// 排序
	private int seq = 0;
	private Integer create_by;
	private Date create_at;
	private Integer update_by;
	private Date update_at;
	//private Integer content_type;
	//private String content_url;
	private Integer status;
	private Integer module_type;//素材模板类型 素材模板 11 全屏模板-A 21 首页Banner-A 31 内页广告模板 12 全屏模板B-浮窗
	private List<MaterialEntity> materials;
	public int getDefaultId() {
		return defaultId;
	}

	public void setDefaultId(int defaultId) {
		this.defaultId = defaultId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public Integer getCreate_by() {
		return create_by;
	}

	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Integer getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(Integer update_by) {
		this.update_by = update_by;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getModule_type() {
		return module_type;
	}

	public void setModule_type(Integer module_type) {
		this.module_type = module_type;
	}

	public List<MaterialEntity> getMaterials() {
		return materials;
	}

	public void setMaterials(List<MaterialEntity> materials) {
		this.materials = materials;
	}
}
