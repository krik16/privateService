package com.rongyi.easy.redi.vo;


public class BailianActivityVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String endTime;// 活动结束时间 
	
	private String ylUrl;// 活动预览URL
	
	private String beginTime;// 活动开始时间
	
	private String subjectPicUrl;// 活动主题图（pc）
	
	private String shortDesc;// 短描述
	
	private String conDesc;// 简介
	
	private String detailDesc ; //详情描述
	
	private String detailUrlList ; //APP详情图列表
	
	private String pcDetailUrlList; //PC详情图列表
	
	private String couponList ;  //优惠券列表
	
	private String campNewId ;  //活动id
	
	private String name ;  //活动名称

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getYlUrl() {
		return ylUrl;
	}

	public void setYlUrl(String ylUrl) {
		this.ylUrl = ylUrl;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getSubjectPicUrl() {
		return subjectPicUrl;
	}

	public void setSubjectPicUrl(String subjectPicUrl) {
		this.subjectPicUrl = subjectPicUrl;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getConDesc() {
		return conDesc;
	}

	public void setConDesc(String conDesc) {
		this.conDesc = conDesc;
	}

	public String getDetailDesc() {
		return detailDesc;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public String getDetailUrlList() {
		return detailUrlList;
	}

	public void setDetailUrlList(String detailUrlList) {
		this.detailUrlList = detailUrlList;
	}

	public String getPcDetailUrlList() {
		return pcDetailUrlList;
	}

	public void setPcDetailUrlList(String pcDetailUrlList) {
		this.pcDetailUrlList = pcDetailUrlList;
	}

	public String getCouponList() {
		return couponList;
	}

	public void setCouponList(String couponList) {
		this.couponList = couponList;
	}

	public String getCampNewId() {
		return campNewId;
	}

	public void setCampNewId(String campNewId) {
		this.campNewId = campNewId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	


}