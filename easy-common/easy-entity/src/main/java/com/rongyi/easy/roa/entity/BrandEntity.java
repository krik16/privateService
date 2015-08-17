package com.rongyi.easy.roa.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * 品牌
 */
@Entity("brands")
public class BrandEntity {
    @Id
    private ObjectId id;
    private String name;
    private String cname;
    private String ename;
    private String description; //描述信息
    private List<String> aliases;//品牌别名
    private String icon;
    private String average_consumption;
    private List<ObjectId> category_ids;
    private Integer valid;
    private String key_tags;

    public String getKey_tags() {
		return key_tags;
	}

	public void setKey_tags(String key_tags) {
		this.key_tags = key_tags;
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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public String getIcon() {
        return icon;
    }

    public String getFullIcon() {
        return "http://rongyi.b0.upaiyun.com/system/brand/icon/" + id + "/" + icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAverage_consumption() {
        return average_consumption;
    }

    public void setAverage_consumption(String average_consumption) {
        this.average_consumption = average_consumption;
    }

    public List<ObjectId> getCategory_ids() {
        return category_ids;
    }

    public void setCategory_ids(List<ObjectId> category_ids) {
        this.category_ids = category_ids;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
