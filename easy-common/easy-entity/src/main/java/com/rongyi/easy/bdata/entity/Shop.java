package com.rongyi.easy.bdata.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 店铺VO
 * 
 * @author xiaobo
 *
 */
@Entity("shops")
public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private ObjectId id;
	private Integer activity_count;
	private String address;
	private List<String> applied_card_type_ids;
	private String average_consumption;
	private String brand_id;
	private Integer business_status;
	private List<ObjectId> category_ids;
	private Integer comment_count;
	private List<String> coordinate;
	private List<String> door_coordinate;
	private Date created_at;
	private String crypted_password;
	private String description;
	private List<Double> location;
	private String name;
	private String name_temp;
	private String old_code;
	private Integer old_id;
	private Integer operator_id;
	private Integer rank;
	private Integer shop_nature;
	private String shop_number;
	private String shop_type;
	private String slug;
	private String subtitle;
	private String tags;
	private String telephone;
	private String terminal_shop;
	private String token;
	private Date updated_at;
	private Integer valid;
	private String zone_id;
	private List<ObjectId> zone_ids;
	private Integer recommend;
	private String business_hours;
	private List<String> watcher_ids;
	private List<ObjectId> parent_ids;
	private String filiale_id;
    private List<ObjectId> custom_category_ids;
    private String qrcode_pic;
    private List<String> photo_urls;//图片地址
    private String icon ;  //店铺自定义Logo
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getActivity_count() {
        return activity_count;
    }

    public void setActivity_count(Integer activity_count) {
        this.activity_count = activity_count;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getApplied_card_type_ids() {
        return applied_card_type_ids;
    }

    public void setApplied_card_type_ids(List<String> applied_card_type_ids) {
        this.applied_card_type_ids = applied_card_type_ids;
    }

    public String getAverage_consumption() {
        return average_consumption;
    }

    public void setAverage_consumption(String average_consumption) {
        this.average_consumption = average_consumption;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getBusiness_status() {
        return business_status;
    }

    public void setBusiness_status(Integer business_status) {
        this.business_status = business_status;
    }

    public List<ObjectId> getCategory_ids() {
        return category_ids;
    }

    public void setCategory_ids(List<ObjectId> category_ids) {
        this.category_ids = category_ids;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public List<String> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(List<String> coordinate) {
        this.coordinate = coordinate;
    }

    public List<String> getDoor_coordinate() {
        return door_coordinate;
    }

    public void setDoor_coordinate(List<String> door_coordinate) {
        this.door_coordinate = door_coordinate;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getCrypted_password() {
        return crypted_password;
    }

    public void setCrypted_password(String crypted_password) {
        this.crypted_password = crypted_password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_temp() {
        return name_temp;
    }

    public void setName_temp(String name_temp) {
        this.name_temp = name_temp;
    }

    public String getOld_code() {
        return old_code;
    }

    public void setOld_code(String old_code) {
        this.old_code = old_code;
    }

    public Integer getOld_id() {
        return old_id;
    }

    public void setOld_id(Integer old_id) {
        this.old_id = old_id;
    }

    public Integer getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(Integer operator_id) {
        this.operator_id = operator_id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getShop_nature() {
        return shop_nature;
    }

    public void setShop_nature(Integer shop_nature) {
        this.shop_nature = shop_nature;
    }

    public String getShop_number() {
        return shop_number;
    }

    public void setShop_number(String shop_number) {
        this.shop_number = shop_number;
    }

    public String getShop_type() {
        return shop_type;
    }

    public void setShop_type(String shop_type) {
        this.shop_type = shop_type;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTerminal_shop() {
        return terminal_shop;
    }

    public void setTerminal_shop(String terminal_shop) {
        this.terminal_shop = terminal_shop;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public String getZone_id() {
        return zone_id;
    }

    public void setZone_id(String zone_id) {
        this.zone_id = zone_id;
    }

    public List<ObjectId> getZone_ids() {
        return zone_ids;
    }

    public void setZone_ids(List<ObjectId> zone_ids) {
        this.zone_ids = zone_ids;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getBusiness_hours() {
        return business_hours;
    }

    public void setBusiness_hours(String business_hours) {
        this.business_hours = business_hours;
    }

    public List<String> getWatcher_ids() {
        return watcher_ids;
    }

    public void setWatcher_ids(List<String> watcher_ids) {
        this.watcher_ids = watcher_ids;
    }

    public List<ObjectId> getParent_ids() {
        return parent_ids;
    }

    public void setParent_ids(List<ObjectId> parent_ids) {
        this.parent_ids = parent_ids;
    }

    public String getFiliale_id() {
        return filiale_id;
    }

    public void setFiliale_id(String filiale_id) {
        this.filiale_id = filiale_id;
    }

    public List<ObjectId> getCustom_category_ids() {
        return custom_category_ids;
    }

    public void setCustom_category_ids(List<ObjectId> custom_category_ids) {
        this.custom_category_ids = custom_category_ids;
    }

	public String getQrcode_pic() {
		return qrcode_pic;
	}

	public void setQrcode_pic(String qrcode_pic) {
		this.qrcode_pic = qrcode_pic;
	}

    public List<String> getPhoto_urls() {
        return photo_urls;
    }

    public void setPhoto_urls(List<String> photo_urls) {
        this.photo_urls = photo_urls;
    }

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
