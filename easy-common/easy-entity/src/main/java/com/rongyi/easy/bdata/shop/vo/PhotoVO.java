package com.rongyi.easy.bdata.shop.vo;

import java.io.Serializable;

/**
 * 图片
 * 
 * @author xiaobo
 *
 */
public class PhotoVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 图片id
	 */
	private String id;
	/**
	 * 创建时间
	 */
	private long createdAt;
	/**
	 * 图片名
	 */
	private String file;
	/**
	 * 拥有者id
	 */
	private String ownerId;
	/**
	 * 拥有者类型
	 */
	private String ownerType;
	/**
	 * 图片位置
	 */
	private int position;
	/**
	 * 状态
	 */
	private Double status;
	/**
	 * 更新时间
	 */
	private long updatedAt;
	
	/**
	 * 图片路径
	 */
	private String path;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Double getStatus() {
		return status;
	}

	public void setStatus(Double status) {
		this.status = status;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}	
}
