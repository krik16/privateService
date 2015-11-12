package com.rongyi.easy.shop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import com.rongyi.easy.shop.mvc.DateJson.JsonObjectIdSerializer;
import com.rongyi.easy.shop.mvc.DateJson.ObjectIdJsonDeserializer;
import com.rongyi.easy.shop.param.ShopParam;


/**
 * 商家后台店铺管理实体类
 * @author wzh
 *
 */
@Entity("shops")
public class ShopEntity implements Serializable{
	@JsonSerialize(using=JsonObjectIdSerializer.class)
	@Id
    private ObjectId id;
    
    private String name;//店铺名称
    private Integer shop_nature;//店铺性质 0商场店铺 1商场专柜 2街边店
    private String shop_type;//店铺类型 0普通店 1免税店 2专柜 3折扣店 4旗舰店
    private String number;//店铺编号
    
   // @JsonDeserialize(using=ObjectIdJsonDeserializer.class)
    private ObjectId brand_id;//主品牌
    
    //@JsonDeserialize(using=ObjectIdJsonDeserializer.class)
    private List<ObjectId> brand_ids;//兼营品牌
    
    private String icon;//logo
    
    //@JsonDeserialize(using=ObjectIdJsonDeserializer.class)
    private List<ObjectId> category_ids;//店铺所属分类
    
    //@JsonDeserialize(using=ObjectIdJsonDeserializer.class)
    private List<ObjectId> exclusive_category_ids;//店铺所属专属分类
    
    private List<String> photo_urls;//图片地址
    private String tags;//标签 自定义分类
    
    //@JsonDeserialize(using=ObjectIdJsonDeserializer.class)
    private ObjectId zone_id;//所在商场id
    
    //@JsonDeserialize(using=ObjectIdJsonDeserializer.class)
    private List<ObjectId> zone_ids;//所在商场
    
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
    
    @JsonDeserialize(using=DateJsonDeserializer.class)
    private Date created_at;
    
    @JsonDeserialize(using=DateJsonDeserializer.class)
    private Date updated_at;
    
    private Integer created_by;
    private Integer updated_by;
    private Integer valid;//0正常显示1已隐藏2删除3待处理   4系统下架
    private String reason;//停业原因
    
    @JsonDeserialize(using=ObjectIdJsonDeserializer.class)
    private ObjectId filiale_id;//分公司id
    
	public ShopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ShopEntity(ShopParam param) throws Exception {
		
		super();
		if(StringUtils.isNotBlank(param.getId())){
			if(param.getId().matches("[\\da-zA-Z]{24}"))
				this.id = new ObjectId(param.getId());
			else{
				throw new Exception("id格式不对");
			}
		}
		
		this.name = param.getName();
		
		this.shop_nature = param.getShop_nature();
		this.shop_type = param.getShop_type();
		this.number = param.getNumber();
		
		//主品牌
		if(StringUtils.isNotBlank(param.getBrand_id())){
			if(param.getBrand_id().matches("[\\da-zA-Z]{24}"))
				this.brand_id = new ObjectId(param.getBrand_id());
			else{
				throw new Exception("主品牌id格式不对");
			}
		}
		
		//兼营品牌
		if(CollectionUtils.isNotEmpty(param.getBrand_ids())){
			List<ObjectId> brand_ids=new ArrayList<ObjectId>();
			for(String id:param.getBrand_ids()){
				if(StringUtils.isNotBlank(id)){
					if(id.matches("[\\da-zA-Z]{24}"))
						brand_ids.add(new ObjectId(id));
					else{
						throw new Exception("兼营品牌id格式不对");
					}
				}else{
					brand_ids.add(null);
				}
				
			}
			this.brand_ids = brand_ids;
		}
		
		this.icon = param.getIcon();
		
		if(CollectionUtils.isNotEmpty(param.getCategory_ids())){
			List<ObjectId> category_ids=new ArrayList<ObjectId>();
			for(String id:param.getCategory_ids()){
				if(StringUtils.isNotBlank(id)){
					if(id.matches("[\\da-zA-Z]{24}"))
						category_ids.add(new ObjectId(id));
					else{
						throw new Exception("品牌品牌id格式不对");
					}
				}else{
					category_ids.add(null);
				}
			}
			this.category_ids = category_ids;
		}
		
		if(CollectionUtils.isNotEmpty(param.getExclusive_category_ids())){
			List<ObjectId> exclusive_category_ids=new ArrayList<ObjectId>();
			for(String id:param.getExclusive_category_ids()){
				if(StringUtils.isNotBlank(id)){
					if(id.matches("[\\da-zA-Z]{24}"))
						exclusive_category_ids.add(new ObjectId(id));
					else{
						throw new Exception("品牌品牌id格式不对");
					}
				}else{
					exclusive_category_ids.add(null);
				}
			}
			this.exclusive_category_ids = exclusive_category_ids;
		}
		
		this.photo_urls = param.getPhoto_urls();
		this.tags = param.getTags();
		
		//楼层id
		if(StringUtils.isNotBlank(param.getZone_id())){
			if(param.getBrand_id().matches("[\\da-zA-Z]{24}"))
				this.zone_id = new ObjectId(param.getZone_id());
			else{
				throw new Exception("楼层id格式不对");
			}
		}
		
		if(CollectionUtils.isNotEmpty(param.getZone_ids())){
			List<ObjectId> zone_ids=new ArrayList<ObjectId>();
			for(String id:param.getZone_ids()){
				if(StringUtils.isNotBlank(id)){
					if(id.matches("[\\da-zA-Z]{24}"))
						zone_ids.add(new ObjectId(id));
					else{
						throw new Exception("品牌品牌id格式不对");
					}
				}else{
					zone_ids.add(null);
				}
			}
			this.zone_ids = zone_ids;
		}
		
		this.address = param.getAddress();
		this.moreFloors = param.getMoreFloors();
		this.shop_number = param.getShop_number();
		this.business_status = param.getBusiness_status();
		this.business_hours = param.getBusiness_hours();
		this.opened_time = param.getOpened_time();
		this.telephone = param.getTelephone();
		this.head_name = param.getHead_name();
		this.head_telephone = param.getHead_telephone();
		this.description = param.getDescription();
		this.created_at = param.getCreated_at();
		this.updated_at = param.getUpdated_at();
		this.created_by = param.getCreated_by();
		this.updated_by = param.getUpdated_by();
		this.valid = param.getValid();
		this.reason = param.getReason();
		
		//分公司id
		if(StringUtils.isNotBlank(param.getFiliale_id())){
			if(param.getFiliale_id().matches("[\\da-zA-Z]{24}"))
				this.filiale_id = new ObjectId(param.getFiliale_id());
			else{
				throw new Exception("分公司id格式不对");
			}
		}
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
	public ObjectId getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(ObjectId brand_id) {
		this.brand_id = brand_id;
	}
	public List<ObjectId> getBrand_ids() {
		return brand_ids;
	}
	public void setBrand_ids(List<ObjectId> brand_ids) {
		this.brand_ids = brand_ids;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<ObjectId> getCategory_ids() {
		return category_ids;
	}
	public void setCategory_ids(List<ObjectId> category_ids) {
		this.category_ids = category_ids;
	}
	public List<ObjectId> getExclusive_category_ids() {
		return exclusive_category_ids;
	}
	public void setExclusive_category_ids(List<ObjectId> exclusive_category_ids) {
		this.exclusive_category_ids = exclusive_category_ids;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
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
	public ObjectId getFiliale_id() {
		return filiale_id;
	}
	public void setFiliale_id(ObjectId filiale_id) {
		this.filiale_id = filiale_id;
	}
	public List<String> getPhoto_urls() {
		return photo_urls;
	}
	public void setPhoto_urls(List<String> photo_urls) {
		this.photo_urls = photo_urls;
	}
	
}
