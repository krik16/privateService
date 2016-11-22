package com.rongyi.easy.roa.vo;

import java.io.Serializable;


public class ShopPositionVO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String pro;//
    private String city;
    private String proId;
    private String cityId;
    private String area;
    private String business;
    private String bussinessId;
    private String mallId;
    private String mall;
    private String floor;
    private String shopNumber;

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

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getShopNumber() {
        return (shopNumber == null) ? "" : shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(String bussinessId) {
        this.bussinessId = bussinessId;
    }

    public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
    
	public String getFullArea(){
		if(this.pro == null && this.city == null && this.area == null && this.business == null && this.mall == null){
			return null;
		}
		return this.pro + this.city + this.area + this.business + this.mall;
	}
}
