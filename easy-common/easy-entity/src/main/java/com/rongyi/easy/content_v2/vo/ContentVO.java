package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.Date;

public class ContentVO implements Serializable{
	 private String provId;
	    /**身份的名字*/
	    private String provName;
	    /**城市的id*/
	    private String cityId;
	    /**城市的名字*/
	    private String cityName;
	    /**存放图片的全路径*/
	    private String picUrls;
	    /**内容管理的详情的标题*/
	    private String title;
	    /**活动的子标题*/
	    private String subtitle;
	    
	    private Integer type;
	    /**id值 对应的是上面类型所对应的id      如类型为商场 则id是商场的id*/
	    private String typeVal;

	    /**店铺ids*/
	    private String shopIds;
	    /**发布开始时间*/
	    private Date publishBeginAt;
	    /**发布结束时间*/
	    private Date publishEndAt;
		public String getProvId() {
			return provId;
		}
		public void setProvId(String provId) {
			this.provId = provId;
		}
		public String getProvName() {
			return provName;
		}
		public void setProvName(String provName) {
			this.provName = provName;
		}
		public String getCityId() {
			return cityId;
		}
		public void setCityId(String cityId) {
			this.cityId = cityId;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getPicUrls() {
			return picUrls;
		}
		public void setPicUrls(String picUrls) {
			this.picUrls = picUrls;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getSubtitle() {
			return subtitle;
		}
		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}
		public Integer getType() {
			return type;
		}
		public void setType(Integer type) {
			this.type = type;
		}
		public String getTypeVal() {
			return typeVal;
		}
		public void setTypeVal(String typeVal) {
			this.typeVal = typeVal;
		}
		public String getShopIds() {
			return shopIds;
		}
		public void setShopIds(String shopIds) {
			this.shopIds = shopIds;
		}
		public Date getPublishBeginAt() {
			return publishBeginAt;
		}
		public void setPublishBeginAt(Date publishBeginAt) {
			this.publishBeginAt = publishBeginAt;
		}
		public Date getPublishEndAt() {
			return publishEndAt;
		}
		public void setPublishEndAt(Date publishEndAt) {
			this.publishEndAt = publishEndAt;
		}
	    
	    
}
