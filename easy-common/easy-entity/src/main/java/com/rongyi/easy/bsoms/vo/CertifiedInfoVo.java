package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.bsoms.entity.CertifiedCheckInfo;

/**
 * 导购认证信息
 * @author sj
 *
 */
public class CertifiedInfoVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer userId;        //关联用户ID
	private String callName;      //称呼
	private Integer proId;       //省ID
	private Integer cityId;       //市ID
	private Integer areaId;       //区ID
	private String contactPhone;  //联系电话
	private String resume;      //自我简介
	private String mallId;        //商场ID
	private String shopId;        //店铺
	private String mallName;      //商场名称
	private String shopName;      //店铺名称
	private String userAccount;   //用户账号
	private String userNickName;  //用户昵称
	private Integer userStatus;   //账号状态
	private Integer isAcc = 1;        //是否加速审核  0是 1否
	private Integer inviteUserId;  //邀请人ID
	private String inviteUserAccount;//邀请人账号
	private List<CertifiedCheckInfo> failList; //审核不理由
	private Integer isDeleted;    //是否已删除  0正常 1已删除
	private Date createAt;
	private Date updateAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCallName() {
		return callName;
	}
	public void setCallName(String callName) {
		this.callName = callName;
	}
	
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getIsAcc() {
		return isAcc;
	}
	public void setIsAcc(Integer isAcc) {
		this.isAcc = isAcc;
	}
	public Integer getInviteUserId() {
		return inviteUserId;
	}
	public void setInviteUserId(Integer inviteUserId) {
		this.inviteUserId = inviteUserId;
	}
	public String getInviteUserAccount() {
		return inviteUserAccount;
	}
	public void setInviteUserAccount(String inviteUserAccount) {
		this.inviteUserAccount = inviteUserAccount;
	}
	public List<CertifiedCheckInfo> getFailList() {
		return failList;
	}
	public void setFailList(List<CertifiedCheckInfo> failList) {
		this.failList = failList;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
}
