package com.rongyi.easy.solr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mongodb.BasicDBList;
import com.mongodb.DBObject;
import com.rongyi.core.util.Pinyin4jUtil;
import com.rongyi.easy.shop.entity.ShopEntity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.bson.types.ObjectId;

/** 
 * 店铺SolrDoc
 * @author	作者：刘磊
 * @date	时间：2015年12月21日 下午5:10:57 
 * @version	版本：1.0
 */
public class ShopDocument implements Serializable {
	private static final long serialVersionUID = 4329800340590289762L;
	@Field("id")
	private String id;
	@Field("area1")
	private String area1;
	@Field("area2")
	private String area2;
	@Field("area3")
	private String area3;
	@Field("area4")
	private String area4;
	@Field("area5")
	private String area5;
	@Field("area6")
	private String area6;
	@Field("icon")
	private String icon;
	@Field("operator_id")
	private String operator_id;
	@Field("mold")
	private String mold;
	@Field("terminal_mall")
	private String terminal_mall;
	@Field("valid")
	private String valid;
	@Field("business_status")
	private String business_status;
	@Field("parent_status")
	private String parent_status;
	@Field("recommend")
	private String recommend;
	@Field("aliases")
	private ArrayList<String> aliases;
	@Field("shop_nature")
	private String shop_nature;
	@Field("shop_number")
	private String shop_number;
	@Field("shop_type")
	private String shop_type;
	@Field("brand")
	private String brand;
	@Field("brand_id")
	private String brand_id;
	@Field("tags")
	private String tags;
	@Field("key_tags")
	private String key_tags;
	@Field("category_tags")
	private String category_tags;
	@Field("category_ids")
	private ArrayList<String> category_ids;
	@Field("zone_ids")
	private ArrayList<String> zone_ids;
	@Field("created_at")
	private Date created_at;//创建时间
	@Field("updated_at")
	private Date updated_at;//更新时间
	@Field("name")
	private String name;
	@Field("address")
	private String address;
	@Field("brand_ids")
	private String brand_ids;
	@Field("telephone")
	private String telephone;
	@Field("average_consumption")
	private String average_consumption;
	@Field("description")
	private String description;
	@Field("business_hours")
	private String business_hours;
	@Field("owner_id")
	private String owner_id; //终端机图片
	@Field("owner_app_id")
	private String owner_app_id; //APP图片
	@Field("slug")
	private String slug;//名称拼音
	@Field("text")
	private String text;

	public ShopDocument() {
	}

	public ShopDocument(ShopEntity shop) {
		id=shop.getId().toString();
		if(StringUtils.isNotBlank(shop.getName()))
			name=shop.getName();
		if(shop.getOperator_id()!=null)
			operator_id=shop.getOperator_id().toString();
		if(StringUtils.isNotBlank(shop.getMold()))
			mold=shop.getMold();
		if(shop.getValid()!=null)
			valid=shop.getValid().toString();
		if(shop.getBusiness_status()!=null)
			business_status=shop.getBusiness_status().toString();
		if(shop.getRecommend()!=null)
			recommend=shop.getRecommend().toString();
		if(StringUtils.isNotBlank(shop.getShop_number()))
			shop_number=shop.getShop_number();
		if(StringUtils.isNotBlank(shop.getShop_nature()))
			shop_nature=shop.getShop_nature();
		if(StringUtils.isNotBlank(shop.getShop_type()))
			shop_type=shop.getShop_type();
		if(shop.getCreated_at()!=null)
			created_at=shop.getCreated_at();
		if(shop.getUpdated_at()!=null)
			updated_at=shop.getUpdated_at();


		category_ids=new ArrayList<String>();
		if(CollectionUtils.isNotEmpty(shop.getCategory_ids())){
			for(ObjectId categoryId:shop.getCategory_ids()){
				if(categoryId!=null)
					category_ids.add(categoryId.toString());
			}
		}
		if(StringUtils.isNotBlank(shop.getTags())){
			tags=shop.getTags();
		}

		if(CollectionUtils.isNotEmpty(shop.getZone_ids())){
			zone_ids=new ArrayList<String>();
			for(ObjectId zoneId:shop.getZone_ids()){
				zone_ids.add(zoneId.toString());
			}
		}

		if(StringUtils.isNotBlank(shop.getTelephone())){
			telephone=shop.getTelephone();
		}
		if(StringUtils.isNotBlank(shop.getAverage_consumption()))
			average_consumption=shop.getAverage_consumption();
		if(StringUtils.isNotBlank(shop.getDescription()))
			description=shop.getDescription();
		//新增返回数据
		if(StringUtils.isNotBlank(shop.getBusiness_hours()))
			business_hours=shop.getBusiness_hours();
		if(shop.getParent_status()!=null)
			parent_status=shop.getParent_status().toString();
		//进行空值判断，不建索引，1表示有值
		if(CollectionUtils.isNotEmpty(shop.getBrand_ids()))
			brand_ids="1";

		//slug
		if(StringUtils.isNotBlank(shop.getName())){
			List<String> pinyins= Pinyin4jUtil.converterToSpell(shop.getName());
			if(CollectionUtils.isNotEmpty(pinyins)){
				slug=pinyins.get(0);
			}else
				slug=shop.getName();
		}
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArea1() {
		return area1;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public String getArea2() {
		return area2;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	public String getArea4() {
		return area4;
	}
	public void setArea4(String area4) {
		this.area4 = area4;
	}
	public String getArea5() {
		return area5;
	}
	public void setArea5(String area5) {
		this.area5 = area5;
	}
	public String getArea6() {
		return area6;
	}
	public void setArea6(String area6) {
		this.area6 = area6;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
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
	public String getTerminal_mall() {
		return terminal_mall;
	}
	public void setTerminal_mall(String terminal_mall) {
		this.terminal_mall = terminal_mall;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getBusiness_status() {
		return business_status;
	}
	public void setBusiness_status(String business_status) {
		this.business_status = business_status;
	}
	public String getParent_status() {
		return parent_status;
	}
	public void setParent_status(String parent_status) {
		this.parent_status = parent_status;
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
	public String getShop_nature() {
		return shop_nature;
	}
	public void setShop_nature(String shop_nature) {
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getKey_tags() {
		return key_tags;
	}
	public void setKey_tags(String key_tags) {
		this.key_tags = key_tags;
	}
	public String getCategory_tags() {
		return category_tags;
	}
	public void setCategory_tags(String category_tags) {
		this.category_tags = category_tags;
	}
	public ArrayList<String> getCategory_ids() {
		return category_ids;
	}
	public void setCategory_ids(ArrayList<String> category_ids) {
		this.category_ids = category_ids;
	}
	public ArrayList<String> getZone_ids() {
		return zone_ids;
	}
	public void setZone_ids(ArrayList<String> zone_ids) {
		this.zone_ids = zone_ids;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBrand_ids() {
		return brand_ids;
	}
	public void setBrand_ids(String brand_ids) {
		this.brand_ids = brand_ids;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAverage_consumption() {
		return average_consumption;
	}
	public void setAverage_consumption(String average_consumption) {
		this.average_consumption = average_consumption;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBusiness_hours() {
		return business_hours;
	}
	public void setBusiness_hours(String business_hours) {
		this.business_hours = business_hours;
	}
	public String getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}
	public String getOwner_app_id() {
		return owner_app_id;
	}
	public void setOwner_app_id(String owner_app_id) {
		this.owner_app_id = owner_app_id;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
