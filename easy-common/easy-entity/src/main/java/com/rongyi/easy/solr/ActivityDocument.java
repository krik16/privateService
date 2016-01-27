package com.rongyi.easy.solr;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by wangzehui on 2016/1/26.
 */
public class ActivityDocument {
    private String id;
    private String var_poi_chinese;
    private String var_title_chinese;// 活动名称
    private String var_address_chinese;
    private String var_label_chinese;// 标记，包含店名
    private ArrayList<String> mall_ids;
    private ArrayList<String> shop_ids;
    private String holder_id;// 优惠活动主办方
    private String holder_type;// shop or mall
    private String description;
    private Date created_at;// 创建时间
    private Date start_time;// 开始时间
    private Date end_time;// 结束时间
    private String coord_x;// 纬度
    private String coord_y;// 经度
    private String icon;
    private ArrayList<String> category_ids;
    private ArrayList<String> zone_ids;
    private ArrayList<String> tags;
    private String position;
    private String brand_ids;

    private String thumbnail; // 缩略图
    private ArrayList<String> carousel_img; // 轮播图片

    private String visted_num="0"; // 访问次数
    private String user_quota; // 用户限购数量
    private String groupon_price; // 团购价格
    private String groupon_original; // 团购原价
    private String groupon_num; // 团购数量
    private String buyed_amount; // 已购买数量
    private String rest_amount; // 剩余数量
    private String use_restriction; // 使用限制
    private String use_mode; // 使用方式
    private String groupon_style; // 使用方式 暂时只有0.以后有了在往后加。没有的就是最普通的优惠
    private Integer groupon_sort; //排序
    private String valid="0";// 是否隐藏
    private int mall;
    private Date public_start;
    private Date public_end;

    private String buyed_num;
    private String text;
    private String area1;
    private String area2;
    private String area3;
    private String area4;
    private String area5;
    private String area6;
    public String getBrand_ids() {
        return brand_ids;
    }

    public void setBrand_ids(String brand_ids) {
        this.brand_ids = brand_ids;
    }

    public ArrayList<String> getZone_ids() {
        return zone_ids;
    }

    public void setZone_ids(ArrayList<String> zone_ids) {
        this.zone_ids = zone_ids;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getCategory_ids() {
        return category_ids;
    }

    public void setCategory_ids(ArrayList<String> category_ids) {
        this.category_ids = category_ids;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(String coord_x) {
        this.coord_x = coord_x;
    }

    public String getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(String coord_y) {
        this.coord_y = coord_y;
    }

    public String getVar_poi_chinese() {
        return var_poi_chinese;
    }

    public void setVar_poi_chinese(String var_poi_chinese) {
        this.var_poi_chinese = var_poi_chinese;
    }


    public String getVar_label_chinese() {
        return var_label_chinese;
    }

    public void setVar_label_chinese(String var_label_chinese) {
        this.var_label_chinese = var_label_chinese;
    }

    public String getVar_address_chinese() {
        return var_address_chinese;
    }

    public void setVar_address_chinese(String var_address_chinese) {
        this.var_address_chinese = var_address_chinese;
    }

    public String getHolder_id() {
        return holder_id;
    }

    public void setHolder_id(String holder_id) {
        this.holder_id = holder_id;
    }

    public String getHolder_type() {
        return holder_type;
    }

    public void setHolder_type(String holder_type) {
        this.holder_type = holder_type;
    }

    public String getVar_title_chinese() {
        return var_title_chinese;
    }

    public void setVar_title_chinese(String var_title_chinese) {
        this.var_title_chinese = var_title_chinese;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ArrayList<String> getCarousel_img() {
        return carousel_img;
    }

    public void setCarousel_img(ArrayList<String> carousel_img) {
        this.carousel_img = carousel_img;
    }

    public String getVisted_num() {
        return visted_num;
    }

    public void setVisted_num(String visted_num) {
        this.visted_num = visted_num;
    }

    public String getBuyed_amount() {
        return buyed_amount;
    }

    public void setBuyed_amount(String buyed_amount) {
        this.buyed_amount = buyed_amount;
    }

    public String getRest_amount() {
        return rest_amount;
    }

    public void setRest_amount(String rest_amount) {
        this.rest_amount = rest_amount;
    }

    public String getUse_restriction() {
        return use_restriction;
    }

    public void setUse_restriction(String use_restriction) {
        this.use_restriction = use_restriction;
    }

    public ArrayList<String> getMall_ids() {
        return mall_ids;
    }

    public void setMall_ids(ArrayList<String> mall_ids) {
        this.mall_ids = mall_ids;
    }

    public ArrayList<String> getShop_ids() {
        return shop_ids;
    }

    public void setShop_ids(ArrayList<String> shop_ids) {
        this.shop_ids = shop_ids;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getUser_quota() {
        return user_quota;
    }

    public void setUser_quota(String user_quota) {
        this.user_quota = user_quota;
    }

    public String getGroupon_price() {
        return groupon_price;
    }

    public void setGroupon_price(String groupon_price) {
        this.groupon_price = groupon_price;
    }

    public String getGroupon_original() {
        return groupon_original;
    }

    public void setGroupon_original(String groupon_original) {
        this.groupon_original = groupon_original;
    }

    public String getGroupon_num() {
        return groupon_num;
    }

    public void setGroupon_num(String groupon_num) {
        this.groupon_num = groupon_num;
    }

    public String getUse_mode() {
        return use_mode;
    }

    public void setUse_mode(String use_mode) {
        this.use_mode = use_mode;
    }

    public String getGroupon_style() {
        return groupon_style;
    }

    public void setGroupon_style(String groupon_style) {
        this.groupon_style = groupon_style;
    }

    public Integer getGroupon_sort() {
        return groupon_sort;
    }

    public void setGroupon_sort(Integer groupon_sort) {
        this.groupon_sort = groupon_sort;
    }

    public Date getPublic_start() {
        return public_start;
    }

    public void setPublic_start(Date public_start) {
        this.public_start = public_start;
    }

    public Date getPublic_end() {
        return public_end;
    }

    public void setPublic_end(Date public_end) {
        this.public_end = public_end;
    }

    public String getBuyed_num() {
        return buyed_num;
    }

    public void setBuyed_num(String buyed_num) {
        this.buyed_num = buyed_num;
    }

    public int getMall() {
        return mall;
    }

    public void setMall(int mall) {
        this.mall = mall;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
