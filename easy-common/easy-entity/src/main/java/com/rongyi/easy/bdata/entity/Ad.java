package com.rongyi.easy.bdata.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Desc: ad entity
 * User: chris
 * Date: 2015/10/27 1:33
 */
@Entity(value="terminal_ads", noClassnameStored = true)
public class Ad implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId  id;
    private ObjectId  mall_id;//商场id
    private String    mall_name;//商场名字
    private Integer   holder;//所属  0容易网 1商家
    private Integer   position;//位置
    private Integer   type;//0全屏广告  1banner广告
    private Date      publish_start;
    private Date      publish_end;
    private ObjectId  material_id;
    private Integer   material_detail_type;//详情素材（给banner广告用）0图片|1Url|2无
    private String    material_detail_url;//详情素材Url（给banner广告用）
    private List<ObjectId> material_detail_ids;//详情素材关联id 图片（给banner广告用）
    private Integer   valid;//系统状态
    private Integer   verify_stu; //0未审核 1审核未通过 2审核通过
    private Integer   published; // 0未发布 1发布失败 2发布成功
    private Date      created_at;
    private Date      updated_at;
    private String adTime;
    private String adOrder;
    private String adGroup;
    private String adRules;
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

    public Integer getHolder() {
        return holder;
    }

    public void setHolder(Integer holder) {
        this.holder = holder;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
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

    public Integer getMaterial_detail_type() {
        return material_detail_type;
    }

    public void setMaterial_detail_type(Integer material_detail_type) {
        this.material_detail_type = material_detail_type;
    }

    public String getMaterial_detail_url() {
        return material_detail_url;
    }

    public void setMaterial_detail_url(String material_detail_url) {
        this.material_detail_url = material_detail_url;
    }

    public List<ObjectId> getMaterial_detail_ids() {
        return material_detail_ids;
    }

    public void setMaterial_detail_ids(List<ObjectId> material_detail_ids) {
        this.material_detail_ids = material_detail_ids;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getVerify_stu() {
        return verify_stu;
    }

    public void setVerify_stu(Integer verify_stu) {
        this.verify_stu = verify_stu;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
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

	public String getAdTime() {
		return adTime;
	}

	public void setAdTime(String adTime) {
		this.adTime = adTime;
	}

	public String getAdOrder() {
		return adOrder;
	}

	public void setAdOrder(String adOrder) {
		this.adOrder = adOrder;
	}

	public String getAdGroup() {
		return adGroup;
	}

	public void setAdGroup(String adGroup) {
		this.adGroup = adGroup;
	}

	public String getAdRules() {
		return adRules;
	}

	public void setAdRules(String adRules) {
		this.adRules = adRules;
	}
}
