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
	private String key_tags;

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
		brand_ids=shop.getBrand_id().toString();
		if(shop.getValid()!=null&&shop.getValid().toString().equals("0"))
			valid="1";
		else
			valid="0";

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
				custom_category_ids.add(id.toString());
			}
		}
		mall=0;
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

	public String getKey_tags() {
		return key_tags;
	}

	public void setKey_tags(String key_tags) {
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


}
