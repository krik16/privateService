package com.rongyi.easy.redi.param;

import java.util.List;


public class BailianMallParam {
	/**
	 * =============门店店铺信息实时同步=================
	 */
	private String mallBusiness;//	商圈名称
	
	private String mallBusiness_hours  ; //营业时间
	
	private String  mallCity ;  //城市
	
	private String mallDescription ;   //描述
	
	private String mallId ; // 商场编号
	
	private List<String> mallInfo ;  //商品图片列表
	
	private  String  mallName ;//商场名称
	
	private  String  mallPro ; //所在省份
	
	private String mallTelephone ; //电话
	
	private String mallAddress ;//地址
	
	private String mallArea ; //所在区
	
	private String actionType ;

	public BailianMallParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BailianMallParam(String mallBusiness, String mallBusinessHours,
			String mallCity, String mallDescription, String mallId,
			List mallInfo, String mallName, String mallPro,
			String mallTelephone, String mallAddress, String mallArea) {
		super();
		this.mallBusiness = mallBusiness;
		this.mallBusiness_hours = mallBusinessHours;
		this.mallCity = mallCity;
		this.mallDescription = mallDescription;
		this.mallId = mallId;
		this.mallInfo = mallInfo;
		this.mallName = mallName;
		this.mallPro = mallPro;
		this.mallTelephone = mallTelephone;
		this.mallAddress = mallAddress;
		this.mallArea = mallArea;
	}

	public String getMallBusiness() {
		return mallBusiness;
	}

	public void setMallBusiness(String mallBusiness) {
		this.mallBusiness = mallBusiness;
	}

	public String getMallBusiness_hours() {
		return mallBusiness_hours;
	}

	public void setMallBusiness_hours(String mallBusiness_hours) {
		this.mallBusiness_hours = mallBusiness_hours;
	}

	public String getMallCity() {
		return mallCity;
	}

	public void setMallCity(String mallCity) {
		this.mallCity = mallCity;
	}

	public String getMallDescription() {
		return mallDescription;
	}

	public void setMallDescription(String mallDescription) {
		this.mallDescription = mallDescription;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public List<String> getMallInfo() {
		return mallInfo;
	}

	public void setMallInfo(List<String> mallInfo) {
		this.mallInfo = mallInfo;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getMallPro() {
		return mallPro;
	}

	public void setMallPro(String mallPro) {
		this.mallPro = mallPro;
	}

	public String getMallTelephone() {
		return mallTelephone;
	}

	public void setMallTelephone(String mallTelephone) {
		this.mallTelephone = mallTelephone;
	}

	public String getMallAddress() {
		return mallAddress;
	}

	public void setMallAddress(String mallAddress) {
		this.mallAddress = mallAddress;
	}

	public String getMallArea() {
		return mallArea;
	}

	public void setMallArea(String mallArea) {
		this.mallArea = mallArea;
	}


	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@Override
	public String toString() {
		return "BailianMallParam [mallBusiness=" + mallBusiness
				+ ", mallBusinessHours=" + mallBusiness_hours + ", mallCity="
				+ mallCity + ", mallDescription=" + mallDescription
				+ ", mallId=" + mallId + ", mallInfo=" + mallInfo
				+ ", mallName=" + mallName + ", mallPro=" + mallPro
				+ ", mallTelephone=" + mallTelephone + ", mallAddress="
				+ mallAddress + ", mallArea=" + mallArea + ", actionType="
				+ actionType + "]";
	}
	
	
	



	

}