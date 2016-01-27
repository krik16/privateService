package com.rongyi.easy.ryoms.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 微信 
 * @author 苏娟
 *
 */
public class WechatInfoVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4187816482111761950L;
	private Integer id;
	private String name;              //微信名
	private String serviceName;       //微信服务号
	private String appId;             //应用Id
	private String appSecret;         //(应用密钥
	private String encodingAESKey;    //消息加密密钥
	private Integer type;             //类型  1容易内部&代运营   2容易外部
	private String mallId;            //商场monogId
	private String mallName;          //商场名称
	private String dockingType;       //对接方式  1B类 2C类
	private Integer isMeiwei ;		//是否接入美味不用等
	private String meiweiId;  		//美味不用等商场ID
	private Integer isDeleted ;      //是否已删除  0正常 1已删除
	List<MeiweiWechatVo> meiweiList ; //美味ID与商场对应关系
	private WechatPayVo wechatPayVo;      //支付信息
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
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public String getEncodingAESKey() {
		return encodingAESKey;
	}
	public void setEncodingAESKey(String encodingAESKey) {
		this.encodingAESKey = encodingAESKey;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getDockingType() {
		return dockingType;
	}
	public void setDockingType(String dockingType) {
		this.dockingType = dockingType;
	}
	public Integer getIsMeiwei() {
		return isMeiwei;
	}
	public void setIsMeiwei(Integer isMeiwei) {
		this.isMeiwei = isMeiwei;
	}
	public String getMeiweiId() {
		return meiweiId;
	}
	public void setMeiweiId(String meiweiId) {
		this.meiweiId = meiweiId;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public List<MeiweiWechatVo> getMeiweiList() {
		return meiweiList;
	}
	public void setMeiweiList(List<MeiweiWechatVo> meiweiList) {
		this.meiweiList = meiweiList;
	}
	public WechatPayVo getWechatPayVo() {
		return wechatPayVo;
	}
	public void setWechatPayVo(WechatPayVo wechatPayVo) {
		this.wechatPayVo = wechatPayVo;
	}
	
	
}
