package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 优惠券模板
 * 
 * @author lijing
 *
 */
@Entity(value = "coupon_template", noClassnameStored = true)
public class CouponTemplate implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 优惠卷模版id */
	@Id
	private ObjectId id;// 优惠卷模版id

	/** 模板类型:使用方式[1],使用限制[2] */
	private String type;

	/** 优惠卷模版文字 */
	@Property("content")
	private String content;// 优惠卷模版文字

	/** 商铺id */
	@Property("shop_id")
	private String shopId;// 商铺id

	/** 创建时间 */
	@Property("create_time")
	private Date createTime; // 创建时间

	/** 修改时间 */
	@Property("update_time")
	private Date updateTime; // 修改时间

	/** 是否删除 0表示新增 1表示删除 */
	@Property("is_delete")
	private String isDelete;// 是否删除 0表示新增 1表示删除

	/** 0表示不是默认 1表示默认 */
	@Property("is_default")
	private String isDefault;// 是否默认 0表示不是默认 1表示默认

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
