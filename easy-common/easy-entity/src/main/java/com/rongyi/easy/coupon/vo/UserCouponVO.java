package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.UserRedenvelope;
import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Breggor
 */
public class UserCouponVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String couponCode;// 卡券码

    private String title;// 券名称

    private Double discount;// 抵扣金额

    private String validBeginDate;// 有效期开始时间

    private String validEndDate;// 有效期结束时间

    private Integer status;// 券状态： 未使用[0] 已使用[1] 已过期[2]

    private String type;// 0: 全场抵扣券 1: 商品抵扣券

    private List<String> productIds;// 商品ID集合：如果是指定商品可用，返回，全场抵扣券不需要

    private String useDescription;// 使用说明

    private String recommend;// 推荐说明

    private String shopName;// 店铺名称

    private List<CommodityBuyerVO> commodityList;// 商品信息列表

    private String description;// 描述

    private String couponType;//卡券类型

    private String couponId;//卡券ID

    private Integer id;//用户红包主键
    
    private Integer applyObject;//适用对象 :商家/买手[0] 商家[1] 买手[2]
    
    private Integer applyScope;//适用范围:商品/代金券[0] 商品[1] 代金券[2]
    
    private List<String> label;//标签
    /**
     * 使用规则
     */
    private String limitDesc;

    /**
     * 抵扣券关联的代金券结合
     */
    private List<VoucherVO> voucherVOs;
    
    public String getLimitDesc() {
		return limitDesc;
	}

	public void setLimitDesc(String limitDesc) {
		this.limitDesc = limitDesc;
	}

	public List<String> getLabel() {
		return label;
	}

	public void setLabel(List<String> label) {
		this.label = label;
	}

	public Integer getApplyObject() {
		return applyObject;
	}

	public void setApplyObject(Integer applyObject) {
		this.applyObject = applyObject;
	}

	public Integer getApplyScope() {
		return applyScope;
	}

	public void setApplyScope(Integer applyScope) {
		this.applyScope = applyScope;
	}

	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getValidBeginDate() {
        return validBeginDate;
    }

    public void setValidBeginDate(String validBeginDate) {
        this.validBeginDate = validBeginDate;
    }

    public String getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(String validEndDate) {
        this.validEndDate = validEndDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<CommodityBuyerVO> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<CommodityBuyerVO> commodityList) {
        this.commodityList = commodityList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<VoucherVO> getVoucherVOs() {
        return voucherVOs;
    }

    public void setVoucherVOs(List<VoucherVO> voucherVOs) {
        this.voucherVOs = voucherVOs;
    }

    // 券状态 0:未激活 1:已领用 2:已使用 3:已过期
    public void setConvertStatus(Integer status, Date validEndAt) {
        if (UserRedenvelope.STATUS_UNUSE.equals(status) && new Date().before(validEndAt))
            this.setStatus(1);
        else if (UserRedenvelope.STATUS_USED.equals(status))
            this.setStatus(2);
        else if (UserRedenvelope.STATUS_UNUSE.equals(status) && new Date().after(validEndAt))
            this.setStatus(3);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("couponCode", couponCode)
                .append("title", title)
                .append("discount", discount)
                .append("validBeginDate", validBeginDate)
                .append("validEndDate", validEndDate)
                .append("status", status)
                .append("type", type)
                .append("productIds", productIds)
                .append("useDescription", useDescription)
                .append("recommend", recommend)
                .append("shopName", shopName)
                .append("commodityList", commodityList)
                .append("description", description)
                .append("couponType", couponType)
                .append("couponId", couponId)
                .append("id", id)
                .toString();
    }
}
