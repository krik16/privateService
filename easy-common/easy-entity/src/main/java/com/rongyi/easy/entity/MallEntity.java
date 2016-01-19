package com.rongyi.easy.entity;

import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("zones")
public class MallEntity implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    private ObjectId id;
    
//    private String _type;
    private String address;
//    private List<String> aliases;
//    private String appearance_pic;
//    private String web_appearance_pic;
//    private String business_hours;
//    private Integer business_status;
//    private Date created_at;
//    private Integer custom_category;
//    private String description;
//    private Integer has_cms;
    private String icon;
//    private String introduction_pic;
//    private String traffic_pic;
    private List<Double> location;
//    private Integer mall_valid;
//    private String mobile;
//    private String mold;
    private String name;
//    private String operator_id;
//    private String parent_id;
    private List<String> parent_ids;
//    private List<ParkingEntity> parking;
//    private Integer recommend;
//    private String slug;
//    private String telephone;
//    private String terminal_logo;
//    private Boolean terminal_mall;
//    private String transport_information;
//    private Date updated_at;
//    private String weixin;
//    private String wechat_pic;//微信图片
//    private String wechat_appId;//微信id
//    private String wechat_appSecret;//微信密钥
//    private String wechat_encodingAESKey;//微信加密解密密钥
    private String tags;
	
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
//	public String get_type() {
//		return _type;
//	}
//	public void set_type(String _type) {
//		this._type = _type;
//	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public List<String> getAliases() {
//		return aliases;
//	}
//	public void setAliases(List<String> aliases) {
//		this.aliases = aliases;
//	}
//	public String getAppearance_pic() {
//		return appearance_pic;
//	}
//	public void setAppearance_pic(String appearance_pic) {
//		this.appearance_pic = appearance_pic;
//	}
//	public String getWeb_appearance_pic() {
//		return web_appearance_pic;
//	}
//	public void setWeb_appearance_pic(String web_appearance_pic) {
//		this.web_appearance_pic = web_appearance_pic;
//	}
//	public String getBusiness_hours() {
//		return business_hours;
//	}
//	public void setBusiness_hours(String business_hours) {
//		this.business_hours = business_hours;
//	}
//	public Integer getBusiness_status() {
//		return business_status;
//	}
//	public void setBusiness_status(Integer business_status) {
//		this.business_status = business_status;
//	}
//	public Date getCreated_at() {
//		return created_at;
//	}
//	public void setCreated_at(Date created_at) {
//		this.created_at = created_at;
//	}
//	public Integer getCustom_category() {
//		return custom_category;
//	}
//	public void setCustom_category(Integer custom_category) {
//		this.custom_category = custom_category;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public Integer getHas_cms() {
//		return has_cms;
//	}
//	public void setHas_cms(Integer has_cms) {
//		this.has_cms = has_cms;
//	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
//	public String getIntroduction_pic() {
//		return introduction_pic;
//	}
//	public void setIntroduction_pic(String introduction_pic) {
//		this.introduction_pic = introduction_pic;
//	}
//	public String getTraffic_pic() {
//		return traffic_pic;
//	}
//	public void setTraffic_pic(String traffic_pic) {
//		this.traffic_pic = traffic_pic;
//	}
//	public List<Double> getLocation() {
//		return location;
//	}
//	public void setLocation(List<Double> location) {
//		this.location = location;
//	}
//	public Integer getMall_valid() {
//		return mall_valid;
//	}
//	public void setMall_valid(Integer mall_valid) {
//		this.mall_valid = mall_valid;
//	}
//	public String getMobile() {
//		return mobile;
//	}
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//	public String getMold() {
//		return mold;
//	}
//	public void setMold(String mold) {
//		this.mold = mold;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getOperator_id() {
//		return operator_id;
//	}
//	public void setOperator_id(String operator_id) {
//		this.operator_id = operator_id;
//	}
//	public String getParent_id() {
//		return parent_id;
//	}
//	public void setParent_id(String parent_id) {
//		this.parent_id = parent_id;
//	}
//	
	public List<String> getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(List<String> parent_ids) {
		this.parent_ids = parent_ids;
	}
//	public List<ParkingEntity> getParking() {
//		return parking;
//	}
//	public void setParking(List<ParkingEntity> parking) {
//		this.parking = parking;
//	}
//	public Integer getRecommend() {
//		return recommend;
//	}
//	public void setRecommend(Integer recommend) {
//		this.recommend = recommend;
//	}
//	public String getSlug() {
//		return slug;
//	}
//	public void setSlug(String slug) {
//		this.slug = slug;
//	}
//	public String getTelephone() {
//		return telephone;
//	}
//	public void setTelephone(String telephone) {
//		this.telephone = telephone;
//	}
//	public String getTerminal_logo() {
//		return terminal_logo;
//	}
//	public void setTerminal_logo(String terminal_logo) {
//		this.terminal_logo = terminal_logo;
//	}
//	public Boolean getTerminal_mall() {
//		return terminal_mall;
//	}
//	public void setTerminal_mall(Boolean terminal_mall) {
//		this.terminal_mall = terminal_mall;
//	}
//	public String getTransport_information() {
//		return transport_information;
//	}
//	public void setTransport_information(String transport_information) {
//		this.transport_information = transport_information;
//	}
//	public Date getUpdated_at() {
//		return updated_at;
//	}
//	public void setUpdated_at(Date updated_at) {
//		this.updated_at = updated_at;
//	}
//	public String getWeixin() {
//		return weixin;
//	}
//	public void setWeixin(String weixin) {
//		this.weixin = weixin;
//	}
//    public String getWechat_pic() {
//        return wechat_pic;
//    }
//    public void setWechat_pic(String wechat_pic) {
//        this.wechat_pic = wechat_pic;
//    }
//    public String getWechat_appId() {
//        return wechat_appId;
//    }
//    public void setWechat_appId(String wechat_appId) {
//        this.wechat_appId = wechat_appId;
//    }
//    public String getWechat_appSecret() {
//        return wechat_appSecret;
//    }
//    public void setWechat_appSecret(String wechat_appSecret) {
//        this.wechat_appSecret = wechat_appSecret;
//    }
//    public String getWechat_encodingAESKey() {
//        return wechat_encodingAESKey;
//    }
//    public void setWechat_encodingAESKey(String wechat_encodingAESKey) {
//        this.wechat_encodingAESKey = wechat_encodingAESKey;
//    }
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
}
