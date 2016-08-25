package com.rongyi.easy.malllife.vo.wish;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WishListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String goodsName;//商品名称
	private String brandName;//品牌名称
	private String remark;//备注
	private String picUrls;//图片集合
	private String createAt;//创建人id
	private Date createBy;//提交时间
	private String response;//官方回复内容
	private String phone;//手机号
	private Date updateAt;//更新回复时间
	private String responseBy;//回复人


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPicUrls() {
		return picUrls;
	}

	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}



	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Date createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getResponseBy() {
		return responseBy;
	}

	public void setResponseBy(String responseBy) {
		this.responseBy = responseBy;
	}

	@Override
	public String toString() {
		return "WishVO [id=" + id + ", brandName=" + brandName
				+ ", goodsName=" + goodsName + ", remark=" + remark
				+ ", picUrls=" + picUrls + ", createAt=" + createAt
				+ ", createBy=" + createBy + ", response=" + response
				+ ", phone=" + phone + ", updateAt=" + updateAt
				+ ", responseBy=" + responseBy
				+ "]";
	}
	
}
