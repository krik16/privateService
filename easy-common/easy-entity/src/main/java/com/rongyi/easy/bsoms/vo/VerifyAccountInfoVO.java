package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.bsoms.entity.CertifiedCheckInfo;

/**
 * 账号审核/导购认证信息VO 
 * @ClassName: VerifyAccountInfoVO 
 * @Description: 
 * @author Kenny
 * @date 2016年11月9日 下午3:24:27 
 *
 */
public class VerifyAccountInfoVO extends CertifiedInfoVo implements Serializable{
	
	private static final long serialVersionUID = -4229602161565326944L;
	
	private Integer id;
	private String userLogo;//用户头像
	private String userPhone;
	private String idCard;//身份证
	private String userName;//用户姓名
	private Integer identity;//身份类型
	private String memo;
	private String shopMid;
	private String mallMid;
	private boolean bShowChiefInfo;
	
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public boolean isbShowChiefInfo() {
		return bShowChiefInfo;
	}
	public void setbShowChiefInfo(boolean bShowChiefInfo) {
		this.bShowChiefInfo = bShowChiefInfo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	
}
