package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 类MallVO.java的实现描述：TODO 类实现描述
 * 
 * @author jiejie 2014年6月19日 下午2:28:13
 */
public class MallVO implements Serializable{
    private String id;
    private String mallName;
    private String iconUrl; // 商场iconUrl
    private double logoX;
    private double logoY;
    private String tags;
    private String traffic;    
    private String bussinessHour;
    private List<String> parking;
    
    private String address;
    private String description;
	private String business_district;//商圈
	
	private String cityId;//城市ID
	private String cityName;//城市名称
	
    private String appearance_picUrl; //商场外景图
	
	private String telephone;
	
	private List<String> mainCategories;

	public List<String> getMainCategories() {
		return mainCategories;
	}

	public void setMainCategories(List<String> mainCategories) {
		this.mainCategories = mainCategories;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAppearance_picUrl() {
		return appearance_picUrl;
	}

	public void setAppearance_picUrl(String appearance_picUrl) {
		this.appearance_picUrl = appearance_picUrl;
	}

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public double getLogoX() {
        return logoX;
    }

    public void setLogoX(double logoX) {
        this.logoX = logoX;
    }

    public double getLogoY() {
        return logoY;
    }

    public void setLogoY(double logoY) {
        this.logoY = logoY;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

	public String getTags() {
		return tags;
	}

	public String getTraffic() {
		return traffic;
	}


	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getBussinessHour() {
		return bussinessHour;
	}

	public void setBussinessHour(String bussinessHour) {
		this.bussinessHour = bussinessHour;
	}

	public List<String> getParking() {
		return parking;
	}

	public void setParking(List<String> parking) {
		this.parking = parking;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public String getDescription() {
		return description;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBusiness_district() {
		return business_district;
	}

	public void setBusiness_district(String business_district) {
		this.business_district = business_district;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


}
