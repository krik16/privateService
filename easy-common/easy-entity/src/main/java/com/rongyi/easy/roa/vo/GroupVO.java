package com.rongyi.easy.roa.vo;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author Lc at 2014/08/19 21:48
 *
 *         优惠团购vo, Get from CRM Groupon Domain.
 */
public class GroupVO {

	private String id;
	private String title; // 团购名称
	private String terminel_title;
	private String activity_type; //值为3时用钱
	private String holder_id;
	private String holder_type;
	private List<String> lable;
	private String valid;
	private String status;

	private List<String> shop_ids;
	private List<String> mall_ids;
	private List<String> zone_ids;

	private List<Double> location;

	private Date public_start; // 发布时间开始
	private Date public_end; // 发布时间结束
	private Date sale_start; // 销售时间开始
	private Date sale_end; // 销售时间结束
	private Integer sale_type; // 销售时间类型
	private Date start_time; //使用开始时间（有效期开始时间）
	private Date updated_at;
	private Date created_at;
	private Date end_time; //使用结束时间（有效期结束时间）

	private Integer recommend; // 顶置 0 no 1;
	private String user_quota; // 用户限购数量
	private String groupon_original; //原价

	private String thumbnail; // 缩略图

	private String groupon_price; // 优惠券价格
	private String groupon_num; // 优惠券数量
	private String buyed_amount; // 已购买数量
	private String rest_amount; // 剩余数量
	private String use_restriction; // 使用限制
	private String use_mode; // 使用方式
	private String position; // 置顶位置

	private String groupon_status; // 团购状态

	private Integer created_user; // 创建人
	private Integer updated_user; // 更新人

	private String description; //描述
	private Integer buyed_num; //此商品被多少人购买过
	
	private String name;//holder_id对应的名称
	
	private String groupon_type; //团购类型，3为外部导入码
	
    private String cooperater; //合作商ID， 0 属于容易，团购中没有合作商是为0
	
    private Integer alarmNum; //库存紧张字段
	public Integer getCreated_user() {
		return created_user;
	}

	public void setCreated_user(Integer created_user) {
		this.created_user = created_user;
	}

	public Integer getUpdated_user() {
		return updated_user;
	}

	public void setUpdated_user(Integer updated_user) {
		this.updated_user = updated_user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTerminel_title() {
		return terminel_title;
	}

	public void setTerminel_title(String terminel_title) {
		this.terminel_title = terminel_title;
	}

	public String getActivity_type() {
		return activity_type;
	}

	public void setActivity_type(String activity_type) {
		this.activity_type = activity_type;
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

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getShop_ids() {
		return shop_ids;
	}

	public void setShop_ids(List<String> shop_ids) {
		this.shop_ids = shop_ids;
	}

	public List<String> getMall_ids() {
		return mall_ids;
	}

	public void setMall_ids(List<String> mall_ids) {
		this.mall_ids = mall_ids;
	}

	public List<String> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<String> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
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

	public Date getSale_start() {
		return sale_start;
	}

	public void setSale_start(Date sale_start) {
		this.sale_start = sale_start;
	}

	public Date getSale_end() {
		return sale_end;
	}

	public void setSale_end(Date sale_end) {
		this.sale_end = sale_end;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public String getUser_quota() {
		return user_quota;
	}

	public void setUser_quota(String user_quota) {
		this.user_quota = user_quota;
	}

	public String getGroupon_original() {
		return groupon_original;
	}

	public void setGroupon_original(String groupon_original) {
		this.groupon_original = groupon_original;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getGroupon_price() {
		return groupon_price;
	}

	public void setGroupon_price(String groupon_price) {
		this.groupon_price = groupon_price;
	}

	public String getGroupon_num() {
		return groupon_num;
	}

	public void setGroupon_num(String groupon_num) {
		this.groupon_num = groupon_num;
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

	public String getUse_mode() {
		return use_mode;
	}

	public void setUse_mode(String use_mode) {
		this.use_mode = use_mode;
	}

	public List<String> getLable() {
		return lable;
	}

	public void setLable(List<String> lable) {
		this.lable = lable;
	}

	public String getGroupon_status() {
		return groupon_status;
	}

	public void setGroupon_status(String groupon_status) {
		this.groupon_status = groupon_status;
	}

	public Integer getSale_type() {
		return sale_type;
	}

	public void setSale_type(Integer sale_type) {
		this.sale_type = sale_type;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBuyed_num() {
		return buyed_num;
	}

	public void setBuyed_num(Integer buyed_num) {
		this.buyed_num = buyed_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupon_type() {
		return groupon_type;
	}

	public void setGroupon_type(String groupon_type) {
		this.groupon_type = groupon_type;
	}

	public String getCooperater() {
		return cooperater;
	}

	public void setCooperater(String cooperater) {
		this.cooperater = cooperater;
	}

	public Integer getAlarmNum() {
		return alarmNum;
	}

	public void setAlarmNum(Integer alarmNum) {
		this.alarmNum = alarmNum;
	}
}
