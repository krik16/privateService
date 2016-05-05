package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

public class ShareCouponRecordEntity implements Serializable {
    /** 主键 */
    private Integer id;

    /** 分享红包id */
    private String shareId;

    /** 订单号 */
    private String orderNo;

    /** 1商品订单 2代金券订单 */
    private Integer orderType;

    /** 用户绑定手机主键id */
    private Integer userOpenidId;

    /** 分享平台昵称 */
    private String nickName;

    /** 分享平台头像地址 */
    private String headImg;

    /** 红包金额 精确到分 */
    private Integer price;

    /** 券码 */
    private String couponCode;

    /** 1:抵扣券 2红包 */
    private Integer couponType;

    /** 红包随机文案 */
    private String desc;

    /** 创建时间 */
    private Date createAt;

    /** 修改时间 */
    private Date updateAt;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 版本 */
    private Integer version;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 分享红包id
     * @return shareId
     */
    public String getShareId() {
        return shareId;
    }

    /**
     * 分享红包id
     * @param shareId
     */
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * 订单号
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单号
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 1商品订单 2代金券订单
     * @return orderType
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 1商品订单 2代金券订单
     * @param orderType
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 用户绑定手机主键id
     * @return userOpenidId
     */
    public Integer getUserOpenidId() {
        return userOpenidId;
    }

    /**
     * 用户绑定手机主键id
     * @param userOpenidId
     */
    public void setUserOpenidId(Integer userOpenidId) {
        this.userOpenidId = userOpenidId;
    }

    /**
     * 分享平台昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 分享平台昵称
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 分享平台头像地址
     * @return headImg
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 分享平台头像地址
     * @param headImg
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 红包金额 精确到分
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 红包金额 精确到分
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 券码
     * @return couponCode
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 券码
     * @param couponCode
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * 1:抵扣券 2红包
     * @return couponType
     */
    public Integer getCouponType() {
        return couponType;
    }

    /**
     * 1:抵扣券 2红包
     * @param couponType
     */
    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    /**
     * 红包随机文案
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 红包随机文案
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 修改时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 是否禁用0正常 1禁用
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

	@Override
	public String toString() {
		return "ShareCouponRecordEntity [id=" + id + ", shareId=" + shareId
				+ ", orderNo=" + orderNo + ", orderType=" + orderType
				+ ", userOpenidId=" + userOpenidId + ", nickName=" + nickName
				+ ", headImg=" + headImg + ", price=" + price + ", couponCode="
				+ couponCode + ", couponType=" + couponType + ", desc=" + desc
				+ ", createAt=" + createAt + ", updateAt=" + updateAt
				+ ", isDisabled=" + isDisabled + ", version=" + version + "]";
	}
}