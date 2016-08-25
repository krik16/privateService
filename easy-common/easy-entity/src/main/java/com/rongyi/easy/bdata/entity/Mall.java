package com.rongyi.easy.bdata.entity;

/**
 * Desc: mall entity
 * User: chris
 * Date: 2015/10/27 16:32
 */

import com.rongyi.easy.roa.entity.ParkingEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Entity(value ="zones", noClassnameStored = true)
public class Mall implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;

    private String _type;
    private Integer system_status;
    private String address;
    private List<String> aliases;
    private String appearance_pic;
    private String web_appearance_pic;
    private String business_hours;
    private Integer business_status;
    private Date created_at;
    private Integer custom_category;
    private String description;
    private String icon;
    private String introduction_pic;
    private String traffic_pic;
    private List<Double> location;
    private Integer mall_valid;
    private String mobile;
    private String mold;
    private String name;
    private String operator_id;
    private ObjectId parent_id;
    private List<ObjectId> parent_ids;
    private List<ParkingEntity> parking;
    private Integer recommend;
    private String slug;
    private String telephone;
    private String terminal_logo;
    private Boolean terminal_mall;
    private String transport_information;
    private Date updated_at;
    private String weixin;
    private String wechat_pic;//微信图片
    private String app_picture;
    private String show_cate;
    private String show_shop;
    private String tags;
    private Integer rank;
    private Integer systemStatus;
    private Integer hot_district;
    private Integer parking_count;
    private boolean has_building;
    private Integer position;
    private String  picture;
    private Integer ry_ad_num;
    private Integer mall_ad_num;
    private Integer ry_banner_num;
    private Integer mall_banner_num;
    private String merlog_pic;//商家后台logo
    private String mall_level;//商场等级
    private String open_at;//开业时间
    private String last_update_id;//最近修改人
    private String validReason;
    private String businessStatusReason;
    private String ename;
    private String description_en;
   
   

	public String getValidReason() {
		return validReason;
	}

	public void setValidReason(String validReason) {
		this.validReason = validReason;
	}

	public String getBusinessStatusReason() {
		return businessStatusReason;
	}

	public void setBusinessStatusReason(String businessStatusReason) {
		this.businessStatusReason = businessStatusReason;
	}

	public String getOpen_at() {
		return open_at;
	}

	public void setOpen_at(String open_at) {
		this.open_at = open_at;
	}

	public String getLast_update_id() {
		return last_update_id;
	}

	public void setLast_update_id(String last_update_id) {
		this.last_update_id = last_update_id;
	}

	public String getMall_level() {
		return mall_level;
	}

	public void setMall_level(String mall_level) {
		this.mall_level = mall_level;
	}

	public String getMerlog_pic() {
		return merlog_pic;
	}

	public void setMerlog_pic(String merlog_pic) {
		this.merlog_pic = merlog_pic;
	}

	public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public Integer getSystem_status() {
        return system_status;
    }

    public void setSystem_status(Integer system_status) {
        this.system_status = system_status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public String getAppearance_pic() {
        return appearance_pic;
    }

    public void setAppearance_pic(String appearance_pic) {
        this.appearance_pic = appearance_pic;
    }

    public String getWeb_appearance_pic() {
        return web_appearance_pic;
    }

    public void setWeb_appearance_pic(String web_appearance_pic) {
        this.web_appearance_pic = web_appearance_pic;
    }

    public String getBusiness_hours() {
        return business_hours;
    }

    public void setBusiness_hours(String business_hours) {
        this.business_hours = business_hours;
    }

    public Integer getBusiness_status() {
        return business_status;
    }

    public void setBusiness_status(Integer business_status) {
        this.business_status = business_status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Integer getCustom_category() {
        return custom_category;
    }

    public void setCustom_category(Integer custom_category) {
        this.custom_category = custom_category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIntroduction_pic() {
        return introduction_pic;
    }

    public void setIntroduction_pic(String introduction_pic) {
        this.introduction_pic = introduction_pic;
    }

    public String getTraffic_pic() {
        return traffic_pic;
    }

    public void setTraffic_pic(String traffic_pic) {
        this.traffic_pic = traffic_pic;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public Integer getMall_valid() {
        return mall_valid;
    }

    public void setMall_valid(Integer mall_valid) {
        this.mall_valid = mall_valid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMold() {
        return mold;
    }

    public void setMold(String mold) {
        this.mold = mold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
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

    public List<ParkingEntity> getParking() {
        return parking;
    }

    public void setParking(List<ParkingEntity> parking) {
        this.parking = parking;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTerminal_logo() {
        return terminal_logo;
    }

    public void setTerminal_logo(String terminal_logo) {
        this.terminal_logo = terminal_logo;
    }

    public Boolean getTerminal_mall() {
        return terminal_mall;
    }

    public void setTerminal_mall(Boolean terminal_mall) {
        this.terminal_mall = terminal_mall;
    }

    public String getTransport_information() {
        return transport_information;
    }

    public void setTransport_information(String transport_information) {
        this.transport_information = transport_information;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getWechat_pic() {
        return wechat_pic;
    }

    public void setWechat_pic(String wechat_pic) {
        this.wechat_pic = wechat_pic;
    }

    public String getApp_picture() {
        return app_picture;
    }

    public void setApp_picture(String app_picture) {
        this.app_picture = app_picture;
    }

    public String getShow_cate() {
        return show_cate;
    }

    public void setShow_cate(String show_cate) {
        this.show_cate = show_cate;
    }

    public String getShow_shop() {
        return show_shop;
    }

    public void setShow_shop(String show_shop) {
        this.show_shop = show_shop;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(Integer systemStatus) {
        this.systemStatus = systemStatus;
    }

    public Integer getHot_district() {
        return hot_district;
    }

    public void setHot_district(Integer hot_district) {
        this.hot_district = hot_district;
    }

    public Integer getParking_count() {
        return parking_count;
    }

    public void setParking_count(Integer parking_count) {
        this.parking_count = parking_count;
    }

    public boolean isHas_building() {
        return has_building;
    }

    public void setHas_building(boolean has_building) {
        this.has_building = has_building;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getRy_ad_num() {
        return ry_ad_num;
    }

    public void setRy_ad_num(Integer ry_ad_num) {
        this.ry_ad_num = ry_ad_num;
    }

    public Integer getMall_ad_num() {
        return mall_ad_num;
    }

    public void setMall_ad_num(Integer mall_ad_num) {
        this.mall_ad_num = mall_ad_num;
    }

    public Integer getRy_banner_num() {
        return ry_banner_num;
    }

    public void setRy_banner_num(Integer ry_banner_num) {
        this.ry_banner_num = ry_banner_num;
    }

    public Integer getMall_banner_num() {
        return mall_banner_num;
    }

    public void setMall_banner_num(Integer mall_banner_num) {
        this.mall_banner_num = mall_banner_num;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDescription_en() {
        return description_en;
    }

    public void setDescription_en(String description_en) {
        this.description_en = description_en;
    }
}
