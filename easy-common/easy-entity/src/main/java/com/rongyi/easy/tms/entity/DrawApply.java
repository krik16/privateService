package com.rongyi.easy.tms.entity;

import java.io.Serializable;
import java.util.Date;



/**	
 * @Author:  柯军
 * @Description: 提现申请 
 * @datetime:2015年5月11日下午3:17:55
 *
 **/
public class DrawApply implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3490504338459066931L;

    private Integer id;

    /**
     * 提现申请时间
     */
    private Date createAt;

    /**
     * 提现完成时间（最终审核通过时间）
     */
    private Date endAt;

    /**
     * 商场id
     */
    private String mallId;

    /**
     * 商场名称
     */
    private String mallName;

    /**
     * 店铺id
     */
    private String shopId;



    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 卖家账号
     */
    private String sellerAccount;

    /**
     * 卖家姓名
     */
    private String sellerName;

    /**
     * 提现金额
     */


    private Double drawAmount;

    /**
     * 付款方式(0:支付宝付款，1:银行卡 2：微信 其余暂保留)

    /**
     * 付款方式(0:支付宝付款，其余暂保留)
     */
    private Integer payType;

    /**
     * 付款账号
     */
    private String payAccount;

    /**
     * 付款姓名
     */
    private String payName;

    /**
     * 状态(0:未审核，1:一级审核，2:二级审核，-1：一级审核不通过，-2：二级审核不通过 ,3：交易完成)
     */
    private Integer status;


    /**
     * 提现用户Id
     */
    private String drawUserId;

    /**
     * 提现用户名
     */
    private String drawUsername;
    
    /**
     * 提现流水号
     */
    private String drawNo;
    
    private Date tradeAt;

    private String tradeNo;

    /**
     * 渠道：1-导购 2-买手
     */
    private Integer guideType;
    
    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Date getTradeAt() {
        return tradeAt;
    }

    public void setTradeAt(Date tradeAt) {
        this.tradeAt = tradeAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }



    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public Integer getStatus() {
        return status;
    }


    public String getDrawUserId() {
        return drawUserId;
    }

    public void setDrawUserId(String drawUserId) {
        this.drawUserId = drawUserId;
    }

    public String getDrawUsername() {
        return drawUsername;
    }

    public void setDrawUsername(String drawUsername) {
        this.drawUsername = drawUsername;
    }

    public String getDrawNo() {
        return drawNo;
    }

    public void setDrawNo(String drawNo) {
        this.drawNo = drawNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setDrawAmount(Double drawAmount) {
        this.drawAmount = drawAmount;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getDrawAmount() {
        return drawAmount;
    }

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }
}