package com.rongyi.easy.shop.entity;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import com.rongyi.easy.shop.mvc.DateJson.JsonObjectIdSerializer;
import com.rongyi.easy.shop.mvc.DateJson.ObjectIdJsonDeserializer;
import com.rongyi.easy.shop.param.ShopParam;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SuppressWarnings("serial")
@Entity(value="rmmm_shop",noClassnameStored=true)
public class RmmmShopEntity implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -4456592329869527608L;

	@Id
	private ObjectId id;
	private ObjectId shop_mid;
	private String cooperation_shop_id;
	private int shop_status;
	private Date createAt;
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public ObjectId getShop_mid() {
		return shop_mid;
	}
	public void setShop_mid(ObjectId shop_mid) {
		this.shop_mid = shop_mid;
	}
	public String getCooperation_shop_id() {
		return cooperation_shop_id;
	}
	public void setCooperation_shop_id(String cooperation_shop_id) {
		this.cooperation_shop_id = cooperation_shop_id;
	}
	public int getShop_status() {
		return shop_status;
	}
	public void setShop_status(int shop_status) {
		this.shop_status = shop_status;
	}
}
