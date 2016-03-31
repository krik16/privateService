package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 老优惠券临时VO
 */
public class CouponTmpVO implements Serializable{
	private static final long serialVersionUID = 3;
	private String id;
	private String holder_id;
	private String holder_name;
	private String title;//团购名称
    private Integer recommend;//置顶
    private String groupon_price;
    private String groupon_original;
    private String groupon_num;
    private String user_quota;
    private String start_time;
    private String end_time;
    private String public_start;
    private String public_end;
    private String sale_start;
    private String sale_end;
    private String thumbnail;
    private String holder_type;
    private List carouselImg;
    private Integer buyed_amount;
    private String after_sale_service = "任何关于优惠券的使用，退款问题均可致电：400-040-8989";
    private String use_restriction; // 使用限制
    private String use_mode;        // 使用方式
    private List<ShopTmpVO> apply_shops;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHolder_id() {
		return holder_id;
	}
	public void setHolder_id(String holder_id) {
		this.holder_id = holder_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getRecommend() {
		return recommend;
	}
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
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
	public String getUser_quota() {
		return user_quota;
	}
	public void setUser_quota(String user_quota) {
		this.user_quota = user_quota;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getPublic_start() {
		return public_start;
	}
	public void setPublic_start(String public_start) {
		this.public_start = public_start;
	}
	public String getPublic_end() {
		return public_end;
	}
	public void setPublic_end(String public_end) {
		this.public_end = public_end;
	}
	public String getSale_start() {
		return sale_start;
	}
	public void setSale_start(String sale_start) {
		this.sale_start = sale_start;
	}
	public String getSale_end() {
		return sale_end;
	}
	public void setSale_end(String sale_end) {
		this.sale_end = sale_end;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getHolder_type() {
		return holder_type;
	}
	public void setHolder_type(String holder_type) {
		this.holder_type = holder_type;
	}
	public List getCarouselImg() {
		return carouselImg;
	}
	public void setCarouselImg(List carouselImg) {
		this.carouselImg = carouselImg;
	}
	public List<ShopTmpVO> getApply_shops() {
		return apply_shops;
	}
	public void setApply_shops(List<ShopTmpVO> apply_shops) {
		this.apply_shops = apply_shops;
	}
	public Integer getBuyed_amount() {
		return buyed_amount;
	}
	public void setBuyed_amount(Integer buyed_amount) {
		this.buyed_amount = buyed_amount;
	}
	public String getAfter_sale_service() {
		return after_sale_service;
	}
	public void setAfter_sale_service(String after_sale_service) {
		this.after_sale_service = after_sale_service;
	}
	public String getUse_restriction() {
		return use_restriction;
	}
	public void setUse_restriction(String use_restriction) {
		this.use_restriction = use_restriction;
	}
	public String getUse_mode() {
		return use_mode;
	}
	public void setUse_mode(String use_mode) {
		this.use_mode = use_mode;
	}
	public String getHolder_name() {
		return holder_name;
	}
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	
}
