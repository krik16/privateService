package com.rongyi.easy.solr;

import com.rongyi.core.util.ListUtil;
import com.rongyi.core.util.Pinyin4jUtil;
import com.rongyi.easy.mcmc.Zones;
import com.rongyi.easy.roa.entity.CategoriesEntity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 商场索引文档
 * @author lim
 */
public class MallsDocument implements java.io.Serializable{
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Field
    private String id;

    /** 商场名称 */
    @Field
    private String name;
    
    @Field
    private String area1;

    @Field
    private String area2;
    
    @Field
    private String area3;
    
    @Field
    private String area4;

	private String address;
	private String province;
	private String city;
	private String district;
	private String bussinessDistrict;
	private String operator_id;
	private String icon;
	private String mold;
	private String mall_valid;
	private String terminal_mall;
	private String business_status;

	private Date created_at;//创建时间
	private Date updated_at;//更新时间

	private ArrayList<ObjectId> zone_ids;

	private String shopcount;
	//进行空值判断，不建索引，1表示有值
	private String parent_id;
	private String description;
	private String parking;
	private String transport_information;
	private String business_hours;
	private String telephone;
	private String appearance_pic;
	private String web_appearance_pic;
	private String traffic_pic;
	private String introduction_pic;
	private String terminal_logo;
	private String recommend;
	private ArrayList<String> aliases;//别名
	private String floor;//楼层
	private String slug;//名称拼音
	//private List<ObjectId> parent_ids;

	public MallsDocument() {
	}

	public MallsDocument(Zones zone) {
		id=zone.getId().toString();
		if(StringUtils.isNotBlank(zone.getName()))
			name=zone.getName();
		if(StringUtils.isNotBlank(zone.getAddress()))
			address=zone.getAddress();
		if(StringUtils.isNotBlank(zone.getIcon()))
			icon="/system/mall/icon/"+zone.getId().toString()+"/"+zone.getIcon();
		if(StringUtils.isNotBlank(zone.getOperator_id()))
			operator_id=zone.getOperator_id();
		if(StringUtils.isNotBlank(zone.getMold()))
			mold=zone.getMold();
		if(StringUtils.isNotBlank(zone.getTerminal_mall()))
			terminal_mall=zone.getTerminal_mall();
		mall_valid=Integer.toString(zone.getMall_valid());
		if(StringUtils.isNotBlank(zone.getBusiness_status()))
			business_status=zone.getBusiness_status();
		/*if(CollectionUtils.isNotEmpty(zone.getParent_ids())){
			parent_ids=zone.getParent_ids();
		}*/
		if(StringUtils.isNotBlank(zone.getRecommend()))
			recommend=zone.getRecommend();
		else
			recommend="0";
		if(CollectionUtils.isNotEmpty(zone.getAliases()))
			aliases=zone.getAliases();
		if(zone.getCreated_at()!=null)
			created_at=zone.getCreated_at();
		if(zone.getUpdated_at()!=null)
			updated_at=zone.getUpdated_at();
		/*if(dbObject.get("parent_ids") != null) {
			mall.setZone_ids((ArrayList<ObjectId>) dbObject.get("parent_ids"));
			fillMallArea(mall, dbObject.get("parent_ids"));
		}*/
		if(zone.getParent_id()!=null)
			parent_id="1";
		if(StringUtils.isNotBlank(zone.getDescription()))
			description="1";
		//进行空值判断，不建索引，1表示有值

		if(CollectionUtils.isNotEmpty(zone.getParking()))
			parking="1";
		if(StringUtils.isNotBlank(zone.getTransport_information()))
			transport_information="1";
		if(StringUtils.isNotBlank(zone.getBusiness_hours()))
			business_hours="1";
		if(StringUtils.isNotBlank(zone.getTelephone()))
			telephone="1";
		if(StringUtils.isNotBlank(zone.getAppearance_pic()))
			appearance_pic="1";
		if(StringUtils.isNotBlank(zone.getWeb_apperance_pic()))
			web_appearance_pic="1";
		if(StringUtils.isNotBlank(zone.getTraffic_pic()))
			traffic_pic="1";
		if(StringUtils.isNotBlank(zone.getIntroduction_pic()))
			introduction_pic="1";
		if(StringUtils.isNotBlank(zone.getTerminal_logo()))
			terminal_logo="1";

		/*if(!getZoneFloorField(dbObject.get("_id").toString()).equalsIgnoreCase("-1"))//判断商场是否有楼层
			mall.setFloor("1");*/
		//缩略
		if(StringUtils.isNotBlank(zone.getName())){
			List<String> pinyins = Pinyin4jUtil.converterToSpell(zone.getName());
			if (ListUtil.isNotEmpty(pinyins)) {
				slug=pinyins.get(0);
			} else {
				slug=zone.getName();
			}
		}
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMold() {
		return mold;
	}

	public void setMold(String mold) {
		this.mold = mold;
	}

	public String getMall_valid() {
		return mall_valid;
	}

	public void setMall_valid(String mall_valid) {
		this.mall_valid = mall_valid;
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

	public ArrayList<ObjectId> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(ArrayList<ObjectId> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public String getShopcount() {
		return shopcount;
	}

	public void setShopcount(String shopcount) {
		this.shopcount = shopcount;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	/*public List<ObjectId> getParent_ids() {
		return parent_ids;
	}

	public void setParent_ids(List<ObjectId> parent_ids) {
		this.parent_ids = parent_ids;
	}*/

	/*private boolean has_activity=false;

	private String valid;

	private String type;

	private String slug;

	private String location;

	private String address;

	private String description;

	private ArrayList<String> zoneList;

	private ArrayList<String> zoneIds;

	private ArrayList<String> tags;

	private String rank;



	private String appearance_pic;

	private String telephone; //新增电话 app四期

	private String icon;



	public MallsDocument(Zones zone) {
		if(zone==null)
			return;
		this.setId(zone.getId().toString());
		if(zone.getMall_valid()!=0)
			this.setValid("1");
		else
			this.setValid("0");
		this.setName(zone.getName());

		if(CollectionUtils.isNotEmpty(zone.getMain_categories())){
			if(CollectionUtils.isNotEmpty(zone.getMain_categories())){
				ArrayList<String> list = new ArrayList<String>();
				for(CategoriesEntity categoriesEntity:zone.getMain_categories())
					list.add(categoriesEntity.getName());
				this.setTags(list);
			}
		}
		this.setRank(Integer.toString(zone.getRank()));
		this.setType(zone.get_type());
		this.setSlug(zone.getSlug());
		this.setAddress(zone.getAddress());
		if(CollectionUtils.isNotEmpty(zone.getLocation())){
			this.setLocation(zone.getLocation().toString());
		}
		if(StringUtils.isNotBlank(zone.getIcon())){
			this.setIcon("/system/mall/icon/"+zone.getId().toString()+"/"+zone.getIcon());
		}
		if(StringUtils.isNotBlank(zone.getAppearance_pic())&&zone.getCreated_at()!=null){
			this.setAppearance_pic("/system/mall/appearance_pic/"+(zone.getCreated_at().getYear()+1900)
					+"/"+(zone.getCreated_at().getMonth()+1)+"/"+zone.getId().toString()+"/"
					+zone.getAppearance_pic().toString());
		}
		if(StringUtils.isNotBlank(zone.getTelephone())){
			if(zone.getTelephone().indexOf("(")>0){
				this.setTelephone(zone.getTelephone().substring(0, zone.getTelephone().indexOf("(")).replaceAll(" ", "-"));
			}else if(zone.getTelephone().indexOf("（")>0){
				this.setTelephone(zone.getTelephone().substring(0, zone.getTelephone().indexOf("（")).replaceAll(" ", "-"));
			}else if(zone.getTelephone().indexOf("/")>0){
				this.setTelephone(zone.getTelephone().substring(0, zone.getTelephone().indexOf("/")).replaceAll(" ", "-"));
			}else{
				this.setTelephone(zone.getTelephone().replaceAll(" ", "-"));
			}
		}
		if(CollectionUtils.isNotEmpty(zone.getParent_ids())){
			if(zone.getParent_ids().size()>=1)
				this.setArea1(zone.getParent_ids().get(0).toString());
			if(zone.getParent_ids().size()>=2)
				this.setArea1(zone.getParent_ids().get(1).toString());
			if(zone.getParent_ids().size()>=3)
				this.setArea3(zone.getParent_ids().get(2).toString());
			if(zone.getParent_ids().size()>=4)
				this.setArea4(zone.getParent_ids().get(3).toString());
		}

        *//*if(StringUtils.isNotBlank(zone.getName())){
            this.setName(Pinyin4jUtil.tripBracket(zone.getName()));
        }





        if(CollectionUtils.isNotEmpty(zone.getParent_ids())){
            ArrayList<String> parent_ids=new ArrayList<String>();
            for(ObjectId parent_id:zone.getParent_ids()){
                parent_ids.add(parent_id.toString());
            }
            this.setZoneList(parent_ids);
        }*//*
	}

	public MallsDocument() {
		super();
	}

	public MallsDocument(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getZoneList() {
		return zoneList;
	}

	public void setZoneList(ArrayList<String> zoneList) {
		this.zoneList = zoneList;
	}

	public ArrayList<String> getZoneIds() {
		return zoneIds;
	}

	public void setZoneIds(ArrayList<String> zoneIds) {
		this.zoneIds = zoneIds;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}*/
}
