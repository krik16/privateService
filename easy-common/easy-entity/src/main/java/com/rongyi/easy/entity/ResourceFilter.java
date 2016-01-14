package com.rongyi.easy.entity;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 商超广告资源过滤
 * @author PC
 *
 */
@Entity(value="resource_filter", noClassnameStored=true)
public class ResourceFilter {

	@Id
	private ObjectId id;
	
	/**
	 * 资源id
	 */
	@Property("resource_id")
	private String resourceId;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	
}
