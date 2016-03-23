package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.malllife.constants.Constants;
import com.rongyi.easy.roa.entity.CategoriesEntity;
import com.rongyi.easy.shop.dto.ZoneDTO;
import com.rongyi.easy.smms.Category;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 区域
 * @author rongyi
 *
 */
@Entity(value="zones",noClassnameStored=true)
public class Zones implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 区域id
	 */
	@Id
	private ObjectId id;

	private int mall_valid;

	private List<CategoriesEntity> main_categories;

	private int rank;

	/**
	 * 区域类型
	 */
	private String _type;

	private String slug;//名称拼音

	private String address;

	private String appearance_pic;

	private String telephone;

	/**
	 * app图片名
	 */
	private String app_picture;
	/**
	 * 创建时间
	 */
	private Date created_at;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 是否热门 1热门 0非热门
	 */
	private int hot_district;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 旧编号
	 */
	private String old_code;
	/**
	 * 旧id
	 */
	private int old_id;
	/**
	 * 父id
	 */
	private ObjectId parent_id;
	/**
	 * 父id列表
	 */
	private List<ObjectId> parent_ids;
	/**
	 * 位置
	 */
	private int position;
	/**
	 * 更新时间
	 */
	private Date updated_at;//更新时间
	/**
	 * 更新人id
	 */
	private int updated_user_id;
	
	/**
	 * 坐标
	 */
	private List<Double> location;
	
	/**
	 * 分类ids
	 */
	private List<ObjectId> category_ids;
	
	private List<ObjectId> watcher_ids;

	//商场logo
	private String icon;

	private String province;
	private String city;
	private String district;
	private String bussinessDistrict;
	private String operator_id;
	private String mold;
	private String valid;
	private String terminal_mall;
	private String business_status;


	private ArrayList<ObjectId> zone_ids;

	private String shopCount;
	//进行空值判断，不建索引，1表示有值
	private List<Object> parking;
	private String transport_information;
	private String business_hours;
	private String apperance_pic;
	private String web_apperance_pic;
	private String traffic_pic;
	private String introduction_pic;
	private String terminal_logo;
	private String recommend;
	private ArrayList<String> aliases;//别名
	private String floor;//楼层
	private int system_status;
	private int systemStatus;


	public Zones() {
	}

	public Zones(ZoneDTO zone) {
		id=new ObjectId(zone.getId());
		name=zone.getName();
		_type=zone.getType();
		address=zone.getAddress();
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

	public String getApp_picture() {
		return app_picture;
	}

	public void setApp_picture(String app_picture) {
		this.app_picture = app_picture;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHot_district() {
		return hot_district;
	}

	public void setHot_district(int hot_district) {
		this.hot_district = hot_district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOld_code() {
		return old_code;
	}

	public void setOld_code(String old_code) {
		this.old_code = old_code;
	}

	public int getOld_id() {
		return old_id;
	}

	public void setOld_id(int old_id) {
		this.old_id = old_id;
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

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getUpdated_user_id() {
		return updated_user_id;
	}

	public void setUpdated_user_id(int updated_user_id) {
		this.updated_user_id = updated_user_id;
	}

	public List<ObjectId> getWatcher_ids() {
		return watcher_ids;
	}

	public void setWatcher_ids(List<ObjectId> watcher_ids) {
		this.watcher_ids = watcher_ids;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public List<ObjectId> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<ObjectId> category_ids) {
		this.category_ids = category_ids;
	}

	public String getFullIcon() {
		return Constants.Common.UPAIYUN_URL_MALL_ICON + getId().toString() + "/" + getIcon().toString();
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getMall_valid() {
		return mall_valid;
	}

	public void setMall_valid(int mall_valid) {
		this.mall_valid = mall_valid;
	}

	public List<CategoriesEntity> getMain_categories() {
		return main_categories;
	}

	public void setMain_categories(List<CategoriesEntity> main_categories) {
		this.main_categories = main_categories;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAppearance_pic() {
		return appearance_pic;
	}

	public void setAppearance_pic(String appearance_pic) {
		this.appearance_pic = appearance_pic;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBussinessDistrict() {
		return bussinessDistrict;
	}

	public void setBussinessDistrict(String bussinessDistrict) {
		this.bussinessDistrict = bussinessDistrict;
	}

	public String getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}

	public String getMold() {
		return mold;
	}

	public void setMold(String mold) {
		this.mold = mold;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getTerminal_mall() {
		return terminal_mall;
	}

	public void setTerminal_mall(String terminal_mall) {
		this.terminal_mall = terminal_mall;
	}

	public String getBusiness_status() {
		return business_status;
	}

	public void setBusiness_status(String business_status) {
		this.business_status = business_status;
	}

	public ArrayList<ObjectId> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(ArrayList<ObjectId> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public String getShopCount() {
		return shopCount;
	}

	public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}

	public List<Object> getParking() {
		return parking;
	}

	public void setParking(List<Object> parking) {
		this.parking = parking;
	}

	public String getTransport_information() {
		return transport_information;
	}

	public void setTransport_information(String transport_information) {
		this.transport_information = transport_information;
	}

	public String getBusiness_hours() {
		return business_hours;
	}

	public void setBusiness_hours(String business_hours) {
		this.business_hours = business_hours;
	}

	public String getApperance_pic() {
		return apperance_pic;
	}

	public void setApperance_pic(String apperance_pic) {
		this.apperance_pic = apperance_pic;
	}

	public String getWeb_apperance_pic() {
		return web_apperance_pic;
	}

	public void setWeb_apperance_pic(String web_apperance_pic) {
		this.web_apperance_pic = web_apperance_pic;
	}

	public String getTraffic_pic() {
		return traffic_pic;
	}

	public void setTraffic_pic(String traffic_pic) {
		this.traffic_pic = traffic_pic;
	}

	public String getIntroduction_pic() {
		return introduction_pic;
	}

	public void setIntroduction_pic(String introduction_pic) {
		this.introduction_pic = introduction_pic;
	}

	public String getTerminal_logo() {
		return terminal_logo;
	}

	public void setTerminal_logo(String terminal_logo) {
		this.terminal_logo = terminal_logo;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public ArrayList<String> getAliases() {
		return aliases;
	}

	public void setAliases(ArrayList<String> aliases) {
		this.aliases = aliases;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public int getSystem_status() {
		return system_status;
	}

	public void setSystem_status(int system_status) {
		this.system_status = system_status;
	}

	public int getSystemStatus() {
		return systemStatus;
	}

	public void setSystemStatus(int systemStatus) {
		this.systemStatus = systemStatus;
	}
}
