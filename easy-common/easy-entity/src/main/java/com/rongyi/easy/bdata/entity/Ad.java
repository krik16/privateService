package com.rongyi.easy.bdata.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * Desc: ad entity
 * User: chris
 * Date: 2015/10/27 1:33
 */
@Entity("terminal_ads")
public class Ad implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;
    private ObjectId mall_id;
    private String   mall_name;
    private int      holder;
    private int      position;
    private int      type;
    private Date     publish_start;
    private Date     publish_end;
    private ObjectId   material_id;
    private int      valid;
    private int      verify_stu;
    private int      published;
    private Date     created_at;
    private Date     updated_at;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getMall_id() {
        return mall_id;
    }

    public void setMall_id(ObjectId mall_id) {
        this.mall_id = mall_id;
    }

    public String getMall_name() {
        return mall_name;
    }

    public void setMall_name(String mall_name) {
        this.mall_name = mall_name;
    }

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getPublish_start() {
        return publish_start;
    }

    public void setPublish_start(Date publish_start) {
        this.publish_start = publish_start;
    }

    public Date getPublish_end() {
        return publish_end;
    }

    public void setPublish_end(Date publish_end) {
        this.publish_end = publish_end;
    }

    public ObjectId getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(ObjectId material_id) {
        this.material_id = material_id;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public int getVerify_stu() {
        return verify_stu;
    }

    public void setVerify_stu(int verify_stu) {
        this.verify_stu = verify_stu;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
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
}
