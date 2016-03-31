package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

public class AppAdvertisement implements Serializable {

	private Integer id;
	private String name;
	private String position;
	private Date timefrom;
	private Date timeto;
	private String articleid;
	private String articletitle;
	private String grouppurchaseid;
	private String grouppurchasename;
	private String imgurl;
	private Integer seqnum;
	private String remark;
	private String pro;
	private String city;
	private Integer status;
	private String contenttype;

	/*
	 * 一下字段用于文章
	 */
	private String title;
	private String cotent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getTimefrom() {
		return timefrom;
	}

	public void setTimefrom(Date timefrom) {
		this.timefrom = timefrom;
	}

	public Date getTimeto() {
		return timeto;
	}

	public void setTimeto(Date timeto) {
		this.timeto = timeto;
	}

	public String getArticleid() {
		return articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}

	public String getArticletitle() {
		return articletitle;
	}

	public void setArticletitle(String articletitle) {
		this.articletitle = articletitle;
	}

	public String getGrouppurchaseid() {
		return grouppurchaseid;
	}

	public void setGrouppurchaseid(String grouppurchaseid) {
		this.grouppurchaseid = grouppurchaseid;
	}

	public String getGrouppurchasename() {
		return grouppurchasename;
	}

	public void setGrouppurchasename(String grouppurchasename) {
		this.grouppurchasename = grouppurchasename;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public Integer getSeqnum() {
		return seqnum;
	}

	public void setSeqnum(Integer seqnum) {
		this.seqnum = seqnum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getContenttype() {
		return contenttype;
	}

	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCotent() {
		return cotent;
	}

	public void setCotent(String cotent) {
		this.cotent = cotent;
	}

}