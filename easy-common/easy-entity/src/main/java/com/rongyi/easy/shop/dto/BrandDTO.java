package com.rongyi.easy.shop.dto;

import com.rongyi.easy.entity.BrandEntity;
import org.apache.commons.collections.CollectionUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity("brands")
public class BrandDTO implements Serializable{

	private String id;
	private String name;
	private String icon;
	private List<String> category_ids;
	private String categories_tags;// 品类

	public BrandDTO(BrandEntity brand) {
		id=brand.getId();
		name=brand.getName();
		icon=brand.getIcon();
		if(CollectionUtils.isNotEmpty(brand.getCategory_ids())){
			category_ids=new ArrayList<String>();
			for(ObjectId id:brand.getCategory_ids()){
				category_ids.add(id.toString());
			}
		}
		categories_tags=brand.getCategories_tags();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<String> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<String> category_ids) {
		this.category_ids = category_ids;
	}

	public String getCategories_tags() {
		return categories_tags;
	}

	public void setCategories_tags(String categories_tags) {
		this.categories_tags = categories_tags;
	}


	/*@Id
	private String id;

	private String cname;
	private String ename;

	private String operator_id;
	private String key_tags;// 关键标签，shop需要
	private List<String> aliases;

	private String valid;
	private Date created_at;
	private Date updated_at;

	private String description;// 品牌描述
	private String average_consumption;

	private String keyTags; // 关键标签，shop需要.数据库里面是key_tags

	private String tags;// 品牌标签


	public String getIcon() {
		return icon;
	}

	public String getEname() {
		return ename;
	}

	public String getName() {
		return name;
	}

	public String getKeyTags() {
		return keyTags;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKeyTags(String keyTags) {
		this.keyTags = keyTags;
	}

	public String getFullIcon() {
		return "http://rongyi.b0.upaiyun.com/system/brand/icon/" + id + "/" + icon;
}

	public void setFullIcon(String icon){

	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategories_tags() {
		return categories_tags;
	}

	public void setCategories_tags(String categories_tags) {
		this.categories_tags = categories_tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}

	public String getKey_tags() {
		return key_tags;
	}

	public void setKey_tags(String key_tags) {
		this.key_tags = key_tags;
	}

	public List<String> getAliases() {
		return aliases;
	}

	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}

	public List<ObjectId> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<ObjectId> category_ids) {
		this.category_ids = category_ids;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getAverage_consumption() {
		return average_consumption;
	}

	public void setAverage_consumption(String average_consumption) {
		this.average_consumption = average_consumption;
	}
*/
}
