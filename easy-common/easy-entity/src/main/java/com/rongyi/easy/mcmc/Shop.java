package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 店铺
 * 
 * @author xiaobo
 *
 */
@Entity(value="shops",noClassnameStored=true)
public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 店铺id
	 */
	@Id
	private ObjectId id;
	/**
	 * 活动数量
	 */
	private int activity_count;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 会员卡类型id列表
	 */
	private List<ObjectId> applied_card_type_ids;
	/**
	 * 平均消费
	 */
	private String average_consumption;
	/**
	 * 品牌id
	 */
	private ObjectId brand_id;
	/**
	 * 状态
	 */
	private int business_status;
	/**
	 * 分类id列表
	 */
	private List<ObjectId> category_ids;

	/**
	 * 点评数
	 */
	private int comment_count;
	/**
	 * 内部坐标
	 */
	private List<Double> coordinate;
	/**
	 * 创建时间
	 */
	private Date created_at;
	/**
	 * 描述
	 */
	private String description;

	private List<Double> door_coordinate;
	/**
	 * 坐标
	 */
	private List<Double> location;
	/**
	 * 名称
	 */
	private String name;

	private String name_temp;
	/**
	 * 旧编码
	 */
	private int old_code;
	/**
	 * 旧id
	 */
	private int old_id;
	/**
	 * 操作人id
	 */
	private int operator_id;
	/**
	 * 评分
	 */
	private int rank;
	/**
	 * 店铺类型 0：普通店，1：免税店，2：专柜,3:折扣店，4：旗舰店
	 */
	private int shop_nature;
	/**
	 * 铺位号
	 */
	private String shop_number;
	/**
	 * 铺位号(旧)
	 */
	private String shop_numble;
	/**
	 * 店铺性质 0: 商场商铺 1: 商场专柜 2：街边店
	 */
	private String shop_type;
	/**
	 * 拼音
	 */
	private String slug;
	/**
	 * 子标题
	 */
	private String subtitle;
	/**
	 * 标签
	 */
	private String tags;
	/**
	 * 手机
	 */
	private String telephone;
	private String terminal_shop;
	/**
	 * 更新时间
	 */
	private Date updated_at;
	/**
	 * 有效状态
	 */
	private int valid;
	/**
	 * 地址上一级id
	 */
	private ObjectId zone_id;
	/**
	 * 地理位置层级id数组
	 */
	private List<ObjectId> zone_ids;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getActivity_count() {
		return activity_count;
	}

	public void setActivity_count(int activity_count) {
		this.activity_count = activity_count;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<ObjectId> getApplied_card_type_ids() {
		return applied_card_type_ids;
	}

	public void setApplied_card_type_ids(List<ObjectId> applied_card_type_ids) {
		this.applied_card_type_ids = applied_card_type_ids;
	}

	public String getAverage_consumption() {
		return average_consumption;
	}

	public void setAverage_consumption(String average_consumption) {
		this.average_consumption = average_consumption;
	}

	public ObjectId getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(ObjectId brand_id) {
		this.brand_id = brand_id;
	}

	public int getBusiness_status() {
		return business_status;
	}

	public void setBusiness_status(int business_status) {
		this.business_status = business_status;
	}

	public List<ObjectId> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<ObjectId> category_ids) {
		this.category_ids = category_ids;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public List<Double> getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(List<Double> coordinate) {
		this.coordinate = coordinate;
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

	public List<Double> getDoor_coordinate() {
		return door_coordinate;
	}

	public void setDoor_coordinate(List<Double> door_coordinate) {
		this.door_coordinate = door_coordinate;
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

	public int getOld_code() {
		return old_code;
	}

	public void setOld_code(int old_code) {
		this.old_code = old_code;
	}

	public int getOld_id() {
		return old_id;
	}

	public void setOld_id(int old_id) {
		this.old_id = old_id;
	}

	public int getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getShop_nature() {
		return shop_nature;
	}

	public void setShop_nature(int shop_nature) {
		this.shop_nature = shop_nature;
	}

	public String getShop_number() {
		return shop_number;
	}

	public void setShop_number(String shop_number) {
		this.shop_number = shop_number;
	}

	public String getShop_numble() {
		return shop_numble;
	}

	public void setShop_numble(String shop_numble) {
		this.shop_numble = shop_numble;
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

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public ObjectId getZone_id() {
		return zone_id;
	}

	public void setZone_id(ObjectId zone_id) {
		this.zone_id = zone_id;
	}

	public List<ObjectId> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<ObjectId> zone_ids) {
		this.zone_ids = zone_ids;
	}
}
