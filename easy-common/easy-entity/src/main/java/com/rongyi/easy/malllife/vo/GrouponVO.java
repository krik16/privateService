package com.rongyi.easy.malllife.vo;

import java.io.Serializable;


public class GrouponVO implements Serializable{

    private String                    id;//团购ID
    private String                    item_title;//品牌商名称
    private String                    title;//团购名称
    private String 					  start_time;
    private String 					  end_time;
    private String                    use_restriction; // 使用限制
    private String					  use_mode;//使用方式
    private String 					  service;//售后服务
    private String 					  address;
    private String					  phone;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem_title() {
		return item_title;
	}
	public void setItem_title(String item_title) {
		this.item_title = item_title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	


}
