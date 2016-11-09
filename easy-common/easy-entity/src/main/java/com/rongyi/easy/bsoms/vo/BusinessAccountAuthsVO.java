package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.rmmm.entity.UserAccountEntity;
/**
 * 商家账户权限VO
 * @author pingkang
 *
 */
public class BusinessAccountAuthsVO implements Serializable {
	
	private static final long serialVersionUID = 4281397684447523338L;
	
	private Integer id;//用户id
	private String userPhone;//用户账号 （手机号）
	private String userAccount ;//  用户账号
	private String userName;//用户姓名
	private String nickName;//用户昵称
	private String merchantName;
	private List<Map> auths;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public List<Map> getAuths() {
		return auths;
	}
	public void setAuths(List<Map> auths) {
		this.auths = auths;
	}
	
	
	
}
