package com.rongyi.easy.roa.vo;

import java.io.Serializable;
/**
 * 品牌VO
 * @author Ventures
 *
 */
public class BrandVO implements Serializable {

    private static final long serialVersionUID = 1L;
	private String id;//品牌ID
	private String name;//品牌名称
	private String icon;//品牌logo
	private String description;// 品牌描述
	private String cname;
	private String ename;
	private String merlog_pic;//商家后台logo图片
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getMerlog_pic() {
		return merlog_pic;
	}
	public void setMerlog_pic(String merlog_pic) {
		this.merlog_pic = merlog_pic;
	}	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}}
