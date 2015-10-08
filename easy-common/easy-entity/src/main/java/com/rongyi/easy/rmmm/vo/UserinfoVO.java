package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
/**
 * 
* @ClassName: UserinfoVO 
* @Description: 导购信息返回
* @author wzh
* @date 2015年5月27日 下午2:25:05 
*
 */
public class UserinfoVO implements Serializable{
	/** 主键 */
    private Integer id;


    /** 用户头像logo */
    private String logo;

    /** 电话号码 */
    private String phone;

    /** 昵称 */
    private String nickname;
    
    private String name;
    
    private Integer status;//状态：1:通过，2：审核中，3：删除

    private boolean online;//true 在线 false离线
    
    private boolean belong;//是否为专属导购
    /**
     * 卖家评分
     */
    private Double mark;
    
    private String userIMCount;//环信账户ID
    
    private String shopMid;//店铺mongoID
    
    private Integer shopId;//店铺ID
    
    private String shopName;//店铺名称
    
    private String customerId;//顾客表id


	private String sharCode;//邀请码
	private String downUrl; //容易逛下载地址

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getMark() {
		return mark;
	}

	public String getUserIMCount() {
		return userIMCount;
	}

	public void setUserIMCount(String userIMCount) {
		this.userIMCount = userIMCount;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public boolean isBelong() {
		return belong;
	}

	public void setBelong(boolean belong) {
		this.belong = belong;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSharCode() {
		return sharCode;
	}

	public void setSharCode(String sharCode) {
		this.sharCode = sharCode;
	}

	public String getDownUrl() {
		return downUrl;
	}

	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}
}
