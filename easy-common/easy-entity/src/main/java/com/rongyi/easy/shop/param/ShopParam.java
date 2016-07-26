package com.rongyi.easy.shop.param;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import com.rongyi.easy.shop.mvc.DateJson.JsonObjectIdSerializer;

/**
 * 商家后台添加店铺参数类
 * 
 * @author wzh
 *
 */
public class ShopParam {

	private String id;
    private String name;//店铺名称
    private Integer shop_nature = 0;//店铺类型 0普通店 1免税店 2专柜 3折扣店 4旗舰店
    private String shop_type;//店铺性质 0商场店铺 1商场专柜 2街边店
    private String number;//店铺编号
    @JsonSerialize(using=JsonObjectIdSerializer.class)
    private String brand_id;//主品牌
    //@JsonSerialize(using=JsonListObjectIdSerializer.class)
    private List<String> brand_ids;//兼营品牌
    private String icon;//logo
    //@JsonSerialize(using=JsonListObjectIdSerializer.class)
    private List<String> category_ids;//店铺所属分类
   // @JsonSerialize(using=JsonListObjectIdSerializer.class)
    private List<String> exclusive_category_ids;//店铺所属专属分类
    private List<String> photo_urls;//图片地址
    private String tags;//标签 自定义分类
    @JsonSerialize(using=JsonObjectIdSerializer.class)
    private String zone_id;//所在商场id
    //@JsonSerialize(using=JsonListObjectIdSerializer.class)
    private List<String> zone_ids;//所在商场
    private String address;//详细地址
    private int moreFloors;//0不跨楼，1跨楼
    
    private String shop_number;//铺位号
    private String business_status;//营业状态0正常营业 1即将营业 2暂停营业 3停止营业
    private String business_hours;//营业时间
    @JsonDeserialize(using=DateJsonDeserializer.class)
    private Date opened_time;//开业时间
    private String telephone;//店铺电话
    private String head_name;//店铺负责人名字
    private String head_telephone;//店铺负责人电话
    private String description;//店铺描述
    private Date created_at;
    private Date updated_at;
    private Integer created_by;
    private Integer updated_by;
    private Integer valid;//0正常显示1已隐藏2删除3待处理   4系统下架
    private String reason;//停业原因
    private String	 filiale_id;//分公司id
    private String name_en ;       //店铺英文名
    private String description_en ;  //英文描述
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
	public Integer getShop_nature() {
		return shop_nature;
	}
	public void setShop_nature(Integer shop_nature) {
		this.shop_nature = shop_nature;
	}
	public String getShop_type() {
		return shop_type;
	}
	public void setShop_type(String shop_type) {
		this.shop_type = shop_type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	public List<String> getBrand_ids() {
		return brand_ids;
	}
	public void setBrand_ids(List<String> brand_ids) {
		this.brand_ids = brand_ids;
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
	public List<String> getExclusive_category_ids() {
		return exclusive_category_ids;
	}
	public void setExclusive_category_ids(List<String> exclusive_category_ids) {
		this.exclusive_category_ids = exclusive_category_ids;
	}
	public List<String> getPhoto_urls() {
		return photo_urls;
	}
	public void setPhoto_urls(List<String> photo_urls) {
		this.photo_urls = photo_urls;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getZone_id() {
		return zone_id;
	}
	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}
	public List<String> getZone_ids() {
		return zone_ids;
	}
	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoreFloors() {
		return moreFloors;
	}
	public void setMoreFloors(int moreFloors) {
		this.moreFloors = moreFloors;
	}
	public String getShop_number() {
		return shop_number;
	}
	public void setShop_number(String shop_number) {
		this.shop_number = shop_number;
	}
	public String getBusiness_status() {
		return business_status;
	}
	public void setBusiness_status(String business_status) {
		this.business_status = business_status;
	}
	public String getBusiness_hours() {
		return business_hours;
	}
	public void setBusiness_hours(String business_hours) {
		this.business_hours = business_hours;
	}
	public Date getOpened_time() {
		return opened_time;
	}
	public void setOpened_time(Date opened_time) {
		this.opened_time = opened_time;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getHead_name() {
		return head_name;
	}
	public void setHead_name(String head_name) {
		this.head_name = head_name;
	}
	public String getHead_telephone() {
		return head_telephone;
	}
	public void setHead_telephone(String head_telephone) {
		this.head_telephone = head_telephone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Integer getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}
	public Integer getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(Integer updated_by) {
		this.updated_by = updated_by;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getFiliale_id() {
		return filiale_id;
	}
	public void setFiliale_id(String filiale_id) {
		this.filiale_id = filiale_id;
	}
	public String getName_en() {
		return name_en;
	}
	public void setName_en(String name_en) {
		this.name_en = name_en;
	}
	public String getDescription_en() {
		return description_en;
	}
	public void setDescription_en(String description_en) {
		this.description_en = description_en;
	}
    
    
}
