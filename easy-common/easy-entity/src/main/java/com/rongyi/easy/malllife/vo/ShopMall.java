package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2014/6/18  10:41.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2014/6/18        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class ShopMall implements Serializable{
    protected String id;
    protected String name;
    @SerializedName("pic_url")
    protected String logo;
    @SerializedName("key_tag")//注意确认修改key_tags
    protected String keyTag;
    @SerializedName("shop_nature")
    protected String shopNature;
    @SerializedName("any_coupon")
    protected boolean isCoupon;
    protected String type;
    @SerializedName("mall_id")
    protected String mallId;
    @SerializedName("shop_own")
    protected String shopOwn;
    @SerializedName("business_district")
    protected String businessDistrict;
    protected List<Double> location;
    protected String distance;
    protected String label;
    protected String[] tags;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getKeyTag() {
        return keyTag;
    }

    public void setKeyTag(String keyTag) {
        this.keyTag = keyTag;
    }

    public String getShopNature() {
        return shopNature;
    }

    public void setShopNature(String shopNature) {
        this.shopNature = shopNature;
    }

    public boolean isCoupon() {
        return isCoupon;
    }

    public void setCoupon(boolean isCoupon) {
        this.isCoupon = isCoupon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopOwn() {
        return shopOwn;
    }

    public void setShopOwn(String shopOwn) {
        this.shopOwn = shopOwn;
    }

    public String getBusinessDistrict() {
        return businessDistrict;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setBusinessDistrict(String businessDistrict) {
        this.businessDistrict = businessDistrict;
    }
    
    public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public ShopMall() {
    }

}
