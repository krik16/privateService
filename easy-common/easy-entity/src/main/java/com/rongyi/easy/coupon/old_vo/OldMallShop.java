package com.rongyi.easy.coupon.old_vo;

import java.io.Serializable;

/**
 * 优惠券详情，店铺商场信息
 */
public class OldMallShop implements Serializable{

    protected String id;

    protected String name;

    protected String pic_url; //LOGO

    protected String key_tag; // 注意确认修改key_tags

    protected String shop_nature;

    protected boolean any_coupon;

    protected String type;

    protected String mall_id;

    protected String shop_own;

    protected String business_district;

    protected float[] location;

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

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getKey_tag() {
        return key_tag;
    }

    public void setKey_tag(String key_tag) {
        this.key_tag = key_tag;
    }

    public String getShop_nature() {
        return shop_nature;
    }

    public void setShop_nature(String shop_nature) {
        this.shop_nature = shop_nature;
    }

    public boolean isAny_coupon() {
        return any_coupon;
    }

    public void setAny_coupon(boolean any_coupon) {
        this.any_coupon = any_coupon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMall_id() {
        return mall_id;
    }

    public void setMall_id(String mall_id) {
        this.mall_id = mall_id;
    }

    public String getShop_own() {
        return shop_own;
    }

    public void setShop_own(String shop_own) {
        this.shop_own = shop_own;
    }

    public String getBusiness_district() {
        return business_district;
    }

    public void setBusiness_district(String business_district) {
        this.business_district = business_district;
    }

    public float[] getLocation() {
        return location;
    }

    public void setLocation(float[] location) {
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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
