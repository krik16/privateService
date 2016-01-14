package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 
 * @author rongyi
 */
public class BailianGoodsInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String goodsId;// String 商品id
	
	private String goodsNumber;// 商品数量
	
	private String introducerInfo ;  //推荐人id
	
	private String deviceComSid ; //设备业态编码
	
	private String deviceStore ;  //设备门店
	
	private String deviceType ; //设备类型
	
	private String deviceNo ; //设备编号
	
	private String activeCode ; //活动编码
	
	private String qrId ; //商品二维码信息

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public String getIntroducerInfo() {
		return introducerInfo;
	}

	public void setIntroducerInfo(String introducerInfo) {
		this.introducerInfo = introducerInfo;
	}

	public String getDeviceComSid() {
		return deviceComSid;
	}

	public void setDeviceComSid(String deviceComSid) {
		this.deviceComSid = deviceComSid;
	}

	public String getDeviceStore() {
		return deviceStore;
	}

	public void setDeviceStore(String deviceStore) {
		this.deviceStore = deviceStore;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getQrId() {
		return qrId;
	}

	public void setQrId(String qrId) {
		this.qrId = qrId;
	}
	
	
	

	
}
