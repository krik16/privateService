package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class OldMallVO implements Serializable{
	private String id;//商场mongoId
	private String name;//商场名称
	private String icon;//商场icon
	private String rank_avg;//商场评分
	private String address;//商场地址
	private List<MainCategoriesVO> main_categories;
	private String telephone;//电话
	private List<String> mobile;//通信信息
	private String transport_information;//交通信息
	private String business_hours;//营业时间
	private Double coord_x;//坐标
	private Double coord_y;//坐标
	private Integer parking_count;
	private boolean has_building;
	private String appearance_pic;
	private String parent_name;
	private String mold;
	private String parking_info;//停车信息
	private Integer production_count;
	private Integer activity_count;
	private String description;//商场描述
	private boolean has_watched;//
	/** 收藏数 */
	private Integer collectionNum;
	private String title;
	private List<Double> location;
	private String type;
	private Integer shopCount;//商场下的店铺数量
	private boolean hasWonderFulAct; //精彩活动
    private boolean hasDiscountAct; //优惠资讯
    private boolean hasRaiders;//潮人攻略

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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getRank_avg() {
		return rank_avg;
	}
	public void setRank_avg(String rank_avg) {
		this.rank_avg = rank_avg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<MainCategoriesVO> getMain_categories() {
		return main_categories;
	}
	public void setMain_categories(List<MainCategoriesVO> main_categories) {
		this.main_categories = main_categories;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
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
	public Double getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(Double coord_x) {
		this.coord_x = coord_x;
	}
	public Double getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(Double coord_y) {
		this.coord_y = coord_y;
	}
	public Integer getParking_count() {
		return parking_count;
	}
	public void setParking_count(Integer parking_count) {
		this.parking_count = parking_count;
	}
	public boolean isHas_building() {
		return has_building;
	}
	public void setHas_building(boolean has_building) {
		this.has_building = has_building;
	}
	public String getAppearance_pic() {
		return appearance_pic;
	}
	public void setAppearance_pic(String appearance_pic) {
		this.appearance_pic = appearance_pic;
	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}
	public String getMold() {
		return mold;
	}
	public void setMold(String mold) {
		this.mold = mold;
	}

	public String getParking_info() {
		return parking_info;
	}
	public void setParking_info(String parking_info) {
		this.parking_info = parking_info;
	}
	public Integer getProduction_count() {
		return production_count;
	}
	public void setProduction_count(Integer production_count) {
		this.production_count = production_count;
	}
	public Integer getActivity_count() {
		return activity_count;
	}
	public void setActivity_count(Integer activity_count) {
		this.activity_count = activity_count;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isHas_watched() {
		return has_watched;
	}
	public void setHas_watched(boolean has_watched) {
		this.has_watched = has_watched;
	}
    
    public Integer getCollectionNum() {
        return collectionNum;
    }
    
    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public Integer getShopCount() {
		return shopCount;
	}
	public void setShopCount(Integer shopCount) {
		this.shopCount = shopCount;
	}
	public boolean isHasWonderFulAct() {
		return hasWonderFulAct;
	}
	public void setHasWonderFulAct(boolean hasWonderFulAct) {
		this.hasWonderFulAct = hasWonderFulAct;
	}
	public boolean isHasDiscountAct() {
		return hasDiscountAct;
	}
	public void setHasDiscountAct(boolean hasDiscountAct) {
		this.hasDiscountAct = hasDiscountAct;
	}
	public boolean isHasRaiders() {
		return hasRaiders;
	}
	public void setHasRaiders(boolean hasRaiders) {
		this.hasRaiders = hasRaiders;
	}
	@Override
	public String toString() {
		return "OldMallVO [id=" + id + ", name=" + name + ", icon=" + icon
				+ ", rank_avg=" + rank_avg + ", address=" + address
				+ ", main_categories=" + main_categories + ", telephone="
				+ telephone + ", mobile=" + mobile + ", transport_information="
				+ transport_information + ", business_hours=" + business_hours
				+ ", coord_x=" + coord_x + ", coord_y=" + coord_y
				+ ", parking_count=" + parking_count + ", has_building="
				+ has_building + ", appearance_pic=" + appearance_pic
				+ ", parent_name=" + parent_name + ", mold=" + mold
				+ ", parking_info=" + parking_info + ", production_count="
				+ production_count + ", activity_count=" + activity_count
				+ ", description=" + description + ", has_watched="
				+ has_watched + ", collectionNum=" + collectionNum + ", title="
				+ title + ", location=" + location + ", type=" + type
				+ ", shopCount=" + shopCount + ", hasWonderFulAct="
				+ hasWonderFulAct + ", hasDiscountAct=" + hasDiscountAct
				+ ", hasRaiders=" + hasRaiders + "]";
	}
	
}
