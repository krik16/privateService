/** 
* @Title: PoiDocument.java 
* @Package com.rongyi.easy.solr 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年10月27日 上午10:36:18 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.rongyi.core.util.ListUtil;
import com.rongyi.easy.mcmc.Zones;
import com.rongyi.easy.shop.entity.ShopEntity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.bson.types.ObjectId;

/**
 * @author ZhengYl
 *
 */
public class PoiDocument implements Serializable {

	/**  */
	private static final long serialVersionUID = 4494801702104199054L;

	@Field("id")
	private String id;

	@Field("has_activity")
	private boolean has_activity;

	@Field("valid")
	private String valid;

	@Field("parent_id")
	private String parent_id;

	@Field("parent_ids")
	private List<String> parent_ids;

	@Field("wildcard_name")
	private String wildcard_name;

	@Field("var_poi_chinese")
	private String var_poi_chinese;

	@Field("var_poi_chinese_str")
	private String var_poi_chinese_str;

	@Field("slug")
	private String slug;

	@Field("var_address_chinese")
	private String var_address_chinese;

	@Field("var_address_chinese_str")
	private String var_address_chinese_str;

	@Field("text")
	private String text;

	@Field("key_tags")
	private List<String> key_tags;

	@Field("brand_ids")
	private String brand_ids;

	@Field("mall_ids")
	private String mall_ids;

	@Field("zone_ids")
	private List<String> zone_ids;

	@Field("category_ids")
	private List<String> category_ids;
	
	@Field("custom_category_ids")
	private List<String> custom_category_ids;

	@Field("shop_nature")
	private Integer shop_nature;

	@Field("shop_type")
	private String shop_type;

	@Field("rank")
	private Integer rank;

	@Field("position")
	private String position;

	@Field("brand")
	private String brand;

	@Field("icon")
	private String icon;

	@Field("tags")
	private List<String> tags;
	
	@Field("BigTag")
	private List<String> BigTag;
	
	@Field("production_ids")
	private List<String> production_ids;
	
	@Field("description")
	private String description;
	
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
	
	@Field("telephone")
	private String telephone;
	
	@Field("rmmmShopId")
	private String rmmmShopId;
	
	@Field("rmmmShopStatus")
	private Integer rmmmShopStatus;
	
	@Field("mall")
	private Integer mall;

	@Field("recommend")
	private Integer recommend;//是否商场推荐
	
	// <-- mall 
	@Field("mold")
	private String mold;//商场类型
		
	@Field("terminal_mall")
	private boolean terminal_mall;//终端是否合作
	// -->
	
	// <-- shop
	@Field("has_terminal_pic")
	private boolean has_terminal_pic;//终端机_商家详情_图片 shop索引中为owner_id 
	
	@Field("has_app_pic")
	private boolean has_app_pic;//App_商家详情_图片 shop索引中为owner_app_id
	
	@Field("business_status")
	private Integer business_status;//营业状态
	
	@Field("shop_number")
	private String shop_number;//铺位号
	
	@Field("business_hours")
	private String business_hours;//营业时间
	    
	@Field("create_source")
	private Integer create_source;//创建源
	
	@Field("update_source")
	private Integer update_source;//最后更新源
	
	@Field("created_by")
	private Integer created_by;//创建人

	@Field("updated_by")
	private Integer updated_by;//更新人
	
	@Field("created_at")
	private Date created_at;//创建时间
	
	@Field("updated_at")
	private Date updated_at;//更新时间
	
	
	// -->	
	
	private String appearance_pic;

	public PoiDocument() {
	}

	public PoiDocument(ShopEntity shop) {

		id=shop.getId().toString();
		has_activity=false;
		if(shop.getValid()!=null)
			valid=shop.getValid().toString();
		if(StringUtils.isNotBlank(shop.getName())){
			var_poi_chinese=shop.getName();
			var_poi_chinese_str=shop.getName().toLowerCase();
			wildcard_name=shop.getName();
		}
		if(StringUtils.isNotBlank(shop.getSlug()))
			slug=shop.getSlug().replaceAll("-"," ");

		if(CollectionUtils.isNotEmpty(shop.getProduction_ids())){
			production_ids=new ArrayList<String>();
			for(ObjectId id:shop.getProduction_ids()){
				production_ids.add(id.toString());
			}
		}
		//key_tags=shop.getKey_tags(); 该字段可以是List<String> 可以废除
		/*if(dbObject.get("key_tags") != null)
			shop.setKey_tags(stringToArrayList(dbObject.get("key_tags").toString()));*/
		if(StringUtils.isNotBlank(shop.getKey_tags()))
			key_tags=Arrays.asList(shop.getKey_tags().split("[\u3000\\s]+"));
		if(shop.getBrand_id()!=null)
			brand_ids=shop.getBrand_id().toString();
		if(shop.getValid()!=null&&shop.getValid().toString().equals("0"))
			valid="0";
		else if(shop.getValid()==null){
			valid="0";
		}else {
			valid = shop.getValid().toString();
		}
			//valid="1";/////////////////////////////////////////////////////////////////////

		if(StringUtils.isNotBlank(shop.getTelephone())){
			if(shop.getTelephone().indexOf("(")>0){
				telephone=shop.getTelephone().substring(0, shop.getTelephone().indexOf("(")).replaceAll(" ", "-");
			}else if(shop.getTelephone().indexOf("（")>0){
				telephone=shop.getTelephone().substring(0, shop.getTelephone().indexOf("（")).replaceAll(" ", "-");
			}else if(shop.getTelephone().indexOf("/")>0){
				telephone=shop.getTelephone().substring(0, shop.getTelephone().indexOf("/")).replaceAll(" ", "-");
			}else{
				telephone=shop.getTelephone().replaceAll(" ", "-");
			}
		}

		if(CollectionUtils.isNotEmpty(shop.getLocation())){
			position=shop.getLocation().toString().substring(1,shop.getLocation().toString().length()-1);
		}
		if(StringUtils.isNotBlank(shop.getDescription()))
			description=shop.getDescription();
		if(StringUtils.isNotBlank(shop.getShop_nature()))
			shop_nature=Integer.valueOf(shop.getShop_nature());
		if(StringUtils.isNotBlank(shop.getShop_type()))
			shop_type=shop.getShop_type();
		if(shop.getRank()!=null)
			rank=shop.getRank();
		if(CollectionUtils.isNotEmpty(shop.getCustom_category_ids())){
			custom_category_ids=new ArrayList<String>();
			for(ObjectId id:shop.getCustom_category_ids()){
				if(id!=null)
					custom_category_ids.add(id.toString());
			}
		}
		mall=0;
		if(CollectionUtils.isNotEmpty(shop.getZone_ids()))
			zone_ids= ListUtil.toStringList(shop.getZone_ids());

		if(shop.getParent_id()!=null){
			parent_id=shop.getParent_id().toString();
		}
		if(CollectionUtils.isNotEmpty(shop.getParent_ids()))
			parent_ids= ListUtil.toStringList(shop.getParent_ids());

	}


	/*public  PoiDocument(Zones zone){

		if(zone.getMall_valid()!=0)
			valid="1";
		else
			valid="0";
		if(StringUtils.isNotBlank(zone.getName())){
			var_poi_chinese=zone.getName();
			var_poi_chinese_str=zone.getName().toLowerCase();
		}
		if(CollectionUtils.isNotEmpty(zone.getMain_categories())){
			tags=new ArrayList<String>();
			for(com.rongyi.easy.roa.entity.CategoriesEntity category:zone.getMain_categories()){
				tags.add(category.getName());
			}
		}
		rank=zone.getRank();
		if(StringUtils.isNotBlank(zone.getSlug())){
			slug=zone.getSlug();
		}

		if(CollectionUtils.isNotEmpty(zone.getLocation())){
			position=zone.getLocation().toString().substring(1,zone.getLocation().toString().length()-1);
		}
		if(StringUtils.isNotBlank(zone.getIcon()))
			icon="/system/mall/icon/"+zone.getId().toString()+"/"+zone.getIcon();
		if(StringUtils.isNotBlank(zone.getAppearance_pic())&&zone.getCreated_at()!=null){

		}
		if(dbObject.get("appearance_pic") != null){
			Date create=new Date(dbObject.get("created_at").toString());
			zone.setAppearance_pic("/system/mall/appearance_pic/"+(create.getYear()+1900)+"/"+(create.getMonth()+1)+"/"+dbObject.get("_id").toString()+"/"+dbObject.get("appearance_pic").toString());
		}

		if(dbObject.get("telephone")!=null&&!dbObject.get("telephone").toString().equalsIgnoreCase("")){
			String telephoneString=dbObject.get("telephone").toString();
			if(telephoneString.indexOf("(")>0){
				zone.setTelephone(telephoneString.substring(0, telephoneString.indexOf("(")).replaceAll(" ", "-"));
			}else if(telephoneString.indexOf("（")>0){
				zone.setTelephone(telephoneString.substring(0, telephoneString.indexOf("（")).replaceAll(" ", "-"));
			}else if(telephoneString.indexOf("/")>0){
				zone.setTelephone(telephoneString.substring(0, telephoneString.indexOf("/")).replaceAll(" ", "-"));
			}else{
				zone.setTelephone(telephoneString.replaceAll(" ", "-"));
			}
		}

		if(dbObject.get("parent_ids") != null) {
			if (type == 0) // 获取id
				zone.setZoneList((ArrayList<String>)dbObject.get("parent_ids"));
			else { // 获取mall中parent_ids对应的name值
				zone.setZoneIds((ArrayList<String>) dbObject.get("parent_ids"));
				zone.setZoneList(getZoneList(dbObject.get("parent_ids")));
			}
		}
	}*/


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isHas_activity() {
		return has_activity;
	}

	public void setHas_activity(boolean has_activity) {
		this.has_activity = has_activity;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getVar_poi_chinese() {
		return var_poi_chinese;
	}

	public void setVar_poi_chinese(String var_poi_chinese) {
		this.var_poi_chinese = var_poi_chinese;
	}

	public String getVar_poi_chinese_str() {
		return var_poi_chinese_str;
	}

	public void setVar_poi_chinese_str(String var_poi_chinese_str) {
		this.var_poi_chinese_str = var_poi_chinese_str;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getVar_address_chinese() {
		return var_address_chinese;
	}

	public void setVar_address_chinese(String var_address_chinese) {
		this.var_address_chinese = var_address_chinese;
	}

	public String getVar_address_chinese_str() {
		return var_address_chinese_str;
	}

	public void setVar_address_chinese_str(String var_address_chinese_str) {
		this.var_address_chinese_str = var_address_chinese_str;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<String> getKey_tags() {
		return key_tags;
	}

	public void setKey_tags(List<String> key_tags) {
		this.key_tags = key_tags;
	}

	public String getBrand_ids() {
		return brand_ids;
	}

	public void setBrand_ids(String brand_ids) {
		this.brand_ids = brand_ids;
	}

	public String getMall_ids() {
		return mall_ids;
	}

	public void setMall_ids(String mall_ids) {
		this.mall_ids = mall_ids;
	}

	public List<String> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public List<String> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<String> category_ids) {
		this.category_ids = category_ids;
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

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getBigTag() {
		return BigTag;
	}

	public void setBigTag(List<String> bigTag) {
		BigTag = bigTag;
	}

	public List<String> getProduction_ids() {
		return production_ids;
	}

	public void setProduction_ids(List<String> production_ids) {
		this.production_ids = production_ids;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRmmmShopId() {
		return rmmmShopId;
	}

	public void setRmmmShopId(String rmmmShopId) {
		this.rmmmShopId = rmmmShopId;
	}

	public Integer getRmmmShopStatus() {
		return rmmmShopStatus;
	}

	public void setRmmmShopStatus(Integer rmmmShopStatus) {
		this.rmmmShopStatus = rmmmShopStatus;
	}

	public Integer getMall() {
		return mall;
	}

	public void setMall(Integer mall) {
		this.mall = mall;
	}

	/**
	 * @return the custom_category_ids
	 */
	public List<String> getCustom_category_ids() {
		return custom_category_ids;
	}

	/**
	 * @param custom_category_ids the custom_category_ids to set
	 */
	public void setCustom_category_ids(List<String> custom_category_ids) {
		this.custom_category_ids = custom_category_ids;
	}

	public String getAppearance_pic() {
		return appearance_pic;
	}

	public void setAppearance_pic(String appearance_pic) {
		this.appearance_pic = appearance_pic;
	}

	public String getMold() {
		return mold;
	}

	public void setMold(String mold) {
		this.mold = mold;
	}

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public boolean isTerminal_mall() {
		return terminal_mall;
	}

	public void setTerminal_mall(boolean terminal_mall) {
		this.terminal_mall = terminal_mall;
	}

	public boolean isHas_terminal_pic() {
		return has_terminal_pic;
	}

	public void setHas_terminal_pic(boolean has_terminal_pic) {
		this.has_terminal_pic = has_terminal_pic;
	}

	public boolean isHas_app_pic() {
		return has_app_pic;
	}

	public void setHas_app_pic(boolean has_app_pic) {
		this.has_app_pic = has_app_pic;
	}

	public Integer getBusiness_status() {
		return business_status;
	}

	public void setBusiness_status(Integer business_status) {
		this.business_status = business_status;
	}

	public String getShop_number() {
		return shop_number;
	}

	public void setShop_number(String shop_number) {
		this.shop_number = shop_number;
	}

	public String getBusiness_hours() {
		return business_hours;
	}

	public void setBusiness_hours(String business_hours) {
		this.business_hours = business_hours;
	}

	public Integer getCreate_source() {
		return create_source;
	}

	public void setCreate_source(Integer create_source) {
		this.create_source = create_source;
	}

	public Integer getUpdate_source() {
		return update_source;
	}

	public void setUpdate_source(Integer update_source) {
		this.update_source = update_source;
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

	public String getWildcard_name() {
		return wildcard_name;
	}

	public void setWildcard_name(String wildcard_name) {
		this.wildcard_name = wildcard_name;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public List<String> getParent_ids() {
		return parent_ids;
	}

	public void setParent_ids(List<String> parent_ids) {
		this.parent_ids = parent_ids;
	}
}
