package com.rongyi.easy.ryoms.advert.entity;

/**
 * @ClassName: MaterialEntity
 * @Description: 素材新增/修改保存的实类
 * @author wangjh
 * @date 2016年2月15日 下午4:37:33
 */
public class AdDefaultEntity {

	// public int getContentType() {
	// return contentType;
	// }
	//
	// public void setContentType(int contentType) {
	// this.contentType = contentType;
	// }

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
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

	public int getDefaultId() {
		return defaultId;
	}

	public void setDefaultId(int defaultId) {
		this.defaultId = defaultId;
	}

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
}
