package com.rongyi.easy.malllife.vo;
import java.io.Serializable;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
@Generated("org.jsonschema2pojo")
public class MainCategories implements Serializable{

	@Expose
	private Id id;
	@Expose
	private String name;

	public Id getId() {
	return id;
	}

	public void setId(Id id) {
	   this.id = id;
	}

	public String getName() {
	   return name;
	}

	public void setName(String name) {
	   this.name = name;
	}

}


