package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("keyword_search_log")
public class KeywordSearchHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5272491144809432057L;
	@Id
	private ObjectId id;
	private String userId;
	private int user_type ; // 1 for phone_user
	private String request_ip;
	private int search_type; // 1for commodity  2for shop/mall 3for activity
	private String keyword; ///< 关键字
	private Date create_at;
	private int total_count; ///< 对应商品总数
	public int getSearch_type() {
		return search_type;
	}
	public void setSearch_type(int search_type) {
		this.search_type = search_type;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public String getRequest_ip() {
		return request_ip;
	}
	public void setRequest_ip(String request_ip) {
		this.request_ip = request_ip;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public int getTotal_count() {
		return total_count;
	}
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	@Override
	public String toString() {
		return "KeywordSearchHistory{" +
				"create_at=" + create_at +
				", id=" + id +
				", userId='" + userId + '\'' +
				", user_type=" + user_type +
				", request_ip='" + request_ip + '\'' +
				", search_type=" + search_type +
				", keyword='" + keyword + '\'' +
				", total_count=" + total_count +
				'}';
	}
}
