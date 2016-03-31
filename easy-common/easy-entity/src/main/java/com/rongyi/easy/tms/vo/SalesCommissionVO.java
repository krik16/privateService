/**   
 * @Title: SalesCommissionVO.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年5月25日 下午6:11:04 
 */

package com.rongyi.easy.tms.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description
 * @author 袁波
 * @date 2015年5月25日 下午6:11:04
 */

public class SalesCommissionVO {
    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
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

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    private Integer id;

    /** 导购id */
    private String guideId;

    /** 订单号 */
    private String orderNo;

    /** 返佣金额 */
    private BigDecimal commissionAmount;

    /** 0:未审核 ；1：一级审核通过；2：二级审核通过 ；-1：一级审核未通过；-2二级审核未通过 */
    private Integer status;

    /** 创建时间 */
    private Date createAt;

    /** 小票上传时间 */
    private Date picUploadAt;

    /** 小票图片urls */
    private String picUrls;

    /** 商场 MongDb id */
    private String mallMid;

    /** 商场名称 */
    private String mallName;

    /** 店铺名称 */
    private String shopName;

    /** 店铺MongDb id */
    private String shopMid;

    /** 买家账户 */
    private String buyerAccount;

    /** 买家id */
    private String buyerId;

    /** 卖家姓名 */
    private String sellerName;

    /** 卖家id */
    private String sellerId;

    /** 卖家账号 */
    private String sellerAccount;

    /** 下单时间 */
    private Date orderAt;

    private String reason;
    /**
     * 渠道：1-商家，2-买手
     */
    private Integer guideType;

    public String getReason() {
        return reason;
    }

    
    public Integer getGuideType() {
		return guideType;
	}

	public void setGuideType(Integer guideType) {
		this.guideType = guideType;
	}

	public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getPicUploadAt() {
        return picUploadAt;
    }

    public void setPicUploadAt(Date picUploadAt) {
        this.picUploadAt = picUploadAt;
    }

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public Date getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    @Override
    public String toString() {
        return "SalesCommissionVO [id=" + id + ", guideId=" + guideId + ", orderNo=" + orderNo + ", commissionAmount="
                + commissionAmount + ", status=" + status + ", createAt=" + createAt + ", picUploadAt=" + picUploadAt
                + ", picUrls=" + picUrls + ", mallMid=" + mallMid + ", mallName=" + mallName + ", shopName=" + shopName
                + ", shopMid=" + shopMid + ", buyerAccount=" + buyerAccount + ", buyerId=" + buyerId + ", sellerName="
                + sellerName + ", sellerId=" + sellerId + ", sellerAccount=" + sellerAccount + ", orderAt=" + orderAt
                + "]";
    }

}
