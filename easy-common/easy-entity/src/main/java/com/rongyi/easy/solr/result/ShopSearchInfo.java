package com.rongyi.easy.solr.result;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;

public class ShopSearchInfo implements Serializable,Comparable<ShopSearchInfo> {

    /**
     *
     */
    private static final long serialVersionUID = 6370327050857493042L;

    private String id;                 //id
    private String name;               //name
    private String addr;               //地址
    private String pic_url;            //品牌logo
    private List<Double> location;     //坐标
    private String description;        //描述
    private String rank;               //评分？前端需要咩 以前有，现在没用到
    private String city_name;          //城市名
    private String shop_own;           //店铺所属名
    private String label;              //标签，逗号隔开
    private String type;               //类型  shop/mall 还有其他么 木有了
    private String business_district;  //商圈名
    private String shop_nature;       //这是毛，需要么  要的
    private boolean any_activity;      //是否有优惠、
    private boolean any_coupon;        //是否有优惠券
    private String cooperationShopId;  //合作商铺mysqlid 这个干掉
    private int rmmmShopStatus;        //合作商铺状态，0初始，1合作，2有货
    private List<String> tags;         //标签，和label一样，用了哪锅？两个都要了，要不你统一一下？
    private int activityNum;           //优惠数量
    private String brandId;  // 品牌id ，摩店用
    private String appearance_pic;
    private String telephone; //商家电话
    private Double dist;//距离
    private List<Integer> tip; ///< 店铺标签（格式：[0，0，0] 对应：[货，惠、劵]）
    private String shopFloor;//店铺楼层
    private String brandMId;     //与该用户关联的主营品牌
    private String brandName; //主营品牌名

    public String getBrandMId() {
        return brandMId;
    }

    public void setBrandMId(String brandMId) {
        this.brandMId = brandMId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<Integer> getTip() {
        return tip;
    }
    public void setTip(List<Integer> tip) {
        this.tip = tip;
    }
    public String getAppearance_pic() {
        return appearance_pic;
    }
    public void setAppearance_pic(String appearance_pic) {
        this.appearance_pic = appearance_pic;
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
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getPic_url() {
        return pic_url;
    }
    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }
    public List<Double> getLocation() {
        return location;
    }
    public void setLocation(List<Double> location) {
        this.location = location;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getCity_name() {
        return city_name;
    }
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    public String getShop_own() {
        return shop_own;
    }
    public void setShop_own(String shop_own) {
        this.shop_own = shop_own;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBusiness_district() {
        return business_district;
    }
    public void setBusiness_district(String business_district) {
        this.business_district = business_district;
    }
    public String getShop_nature() {
        return shop_nature;
    }
    public void setShop_nature(String shop_nature) {
        this.shop_nature = shop_nature;
    }
    public boolean isAny_activity() {
        return any_activity;
    }
    public void setAny_activity(boolean any_activity) {
        this.any_activity = any_activity;
    }
    public boolean isAny_coupon() {
        return any_coupon;
    }
    public void setAny_coupon(boolean any_coupon) {
        this.any_coupon = any_coupon;
    }
    public String getCooperationShopId() {
        return cooperationShopId;
    }
    public void setCooperationShopId(String cooperationShopId) {
        this.cooperationShopId = cooperationShopId;
    }
    public int getRmmmShopStatus() {
        return rmmmShopStatus;
    }
    public void setRmmmShopStatus(int rmmmShopStatus) {
        this.rmmmShopStatus = rmmmShopStatus;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public int getActivityNum() {
        return activityNum;
    }
    public void setActivityNum(int activityNum) {
        this.activityNum = activityNum;
    }
    public String getBrandId() {
        return brandId;
    }
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getShopFloor() {
		return shopFloor;
	}
	public void setShopFloor(String shopFloor) {
		this.shopFloor = shopFloor;
	}
    public Double getDist() {
        return dist;
    }
    public void setDist(Double dist) {
        this.dist = dist;
    }
    @Override
    public int compareTo(ShopSearchInfo o) {
        if(o==null||o.getDist()==null){
            return 1;
        }else if(this==null||this.dist==null){
            return -1;
        }else{
            DecimalFormat df=new DecimalFormat("0");
            return Integer.valueOf(df.format((dist - o.getDist()) * 1000));
        }
    }
	@Override
	public String toString() {
		return "ShopSearchInfo [id=" + id + ", name=" + name + ", addr=" + addr
				+ ", pic_url=" + pic_url + ", location=" + location
				+ ", description=" + description + ", rank=" + rank
				+ ", city_name=" + city_name + ", shop_own=" + shop_own
				+ ", label=" + label + ", type=" + type
				+ ", business_district=" + business_district + ", shop_nature="
				+ shop_nature + ", any_activity=" + any_activity
				+ ", any_coupon=" + any_coupon + ", cooperationShopId="
				+ cooperationShopId + ", rmmmShopStatus=" + rmmmShopStatus
				+ ", tags=" + tags + ", activityNum=" + activityNum
				+ ", brandId=" + brandId + ", appearance_pic=" + appearance_pic
                + ", brandMId=" + brandMId + ", brandName=" + brandName
                + ", telephone=" + telephone + ", dist=" + dist + ", tip="
				+ tip + ", shopFloor=" + shopFloor + "]";
	}
    
}
