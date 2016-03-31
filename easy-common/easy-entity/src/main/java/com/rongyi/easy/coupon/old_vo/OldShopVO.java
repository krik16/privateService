package com.rongyi.easy.coupon.old_vo;


import java.io.Serializable;
import java.util.List;

/**
 * 老优惠券店铺信息
 */
public class OldShopVO implements Serializable {
    private String id;
    private String name;//店铺名
    private String pro;//省份
    private String city;//市
    private String area;//区
    private String business;//商圈
    private String address;//地址
    private String owner_id;//所属商场id
    private String iconUrl;//店铺logo
    private List<Double> location;//店铺的 经纬度

    //来至 OldMallVO
    private String type;//关联类型(mall or shop)
    private String icon;//商家图片
    private String title;//商家名称
    private String telephone; //商家电话
    private Double distance = 0.0; //距离

    public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
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

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
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
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
