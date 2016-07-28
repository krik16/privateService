package com.rongyi.easy.bdata.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.List;

/**
 * Desc: area
 * User: chris
 * Date: 2015/10/31 15:17
 */
@Entity(value="zones", noClassnameStored = true)
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String _type;
    private String name;
    private String parent_id;
    private List<ObjectId> parent_ids;
    private String hot_district;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public List<ObjectId> getParent_ids() {
        return parent_ids;
    }

    public void setParent_ids(List<ObjectId> parent_ids) {
        this.parent_ids = parent_ids;
    }

    public String getHot_district() {
        return hot_district;
    }

    public void setHot_district(String hot_district) {
        this.hot_district = hot_district;
    }
}
