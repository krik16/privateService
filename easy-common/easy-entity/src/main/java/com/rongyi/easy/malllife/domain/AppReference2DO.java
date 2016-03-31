package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

public class AppReference2DO implements Serializable{
	private Integer id;
	private Date create_date;
	private Date update_date;
	private String type;
	private String reference_field;
	private Integer app_content_ref;

	public Integer getId() {
		return id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public String getType() {
		return type;
	}

	public String getReference_field() {
		return reference_field;
	}

	public Integer getApp_content_ref() {
		return app_content_ref;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setReference_field(String reference_field) {
		this.reference_field = reference_field;
	}

	public void setApp_content_ref(Integer app_content_ref) {
		this.app_content_ref = app_content_ref;
	}

}
