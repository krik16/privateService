package com.rongyi.easy.shop.dto;

import com.rongyi.easy.malllife.constants.Constants;
import com.rongyi.easy.mcmc.Zones;
import com.rongyi.easy.roa.entity.CategoriesEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 区域
 * @author rongyi
 *
 */
public class ZoneDTO implements Serializable {
	/**
	 * 区域id
	 */
	private String id;

	/**
	 * 区域类型
	 */
	private String type;

	private String address;

	/**
	 * 名称
	 */
	private String name;

	public ZoneDTO(Zones zone) {
		id=zone.getId().toString();
		type=zone.get_type();
		address=zone.getAddress();
		name=zone.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
