package com.rongyi.easy.roa.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.List;

@Entity("categories")
public class CategoriesEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    private ObjectId id;
    private String name;
    private ObjectId parent_id;
    private List<ObjectId> parent_ids;
    private List<String> production_ids;
    private Integer position;
    private boolean app_show = false;
    private String app_picture ;
    private boolean is_hot;
	public boolean isIs_hot() {
		return is_hot;
	}
	public void setIs_hot(boolean is_hot) {
		this.is_hot = is_hot;
	}
	public boolean isApp_show() {
		return app_show;
	}
	public void setApp_show(boolean app_show) {
		this.app_show = app_show;
	}
	public String getApp_picture() {
		return app_picture;
	}
	public void setApp_picture(String app_picture) {
		this.app_picture = app_picture;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ObjectId getParent_id() {
		return parent_id;
	}
	public void setParent_id(ObjectId parent_id) {
		this.parent_id = parent_id;
	}
	public List<ObjectId> getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(List<ObjectId> parent_ids) {
		this.parent_ids = parent_ids;
	}
	public List<String> getProduction_ids() {
		return production_ids;
	}
	public void setProduction_ids(List<String> production_ids) {
		this.production_ids = production_ids;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
}
