package com.rongyi.settle.dto;

import java.util.List;

/**
 * Created by xgq on 2015/9/25.
 */
public class PaymentStatementExcelDto {
    private String batchNo;
    private String shopName;
    private String cycleTime;
    private String mallName;

    private String rongyiAccountName;
    private String rongyiAccountNo;
    private String rongyiBank;
    private String rongyiBankAddress;

    private String shopAccountName;
    private String shopAccountNo;
    private String shopBank;
    private String payChannel;

    private Double payTotal;
    private Double rongyiDiscount;
    
    private Double payTotalCoupon;
    private Double rongyiDiscountCoupon;
    
    private Byte unitType;
    
    /**
	 * @return the unitType
	 */
	public Byte getUnitType() {
		return unitType;
	}

	/**
	 * @param unitType the unitType to set
	 */
	public void setUnitType(Byte unitType) {
		this.unitType = unitType;
	}

	/**
	 * @return the payTotal
	 */
	public Double getPayTotal() {
		return payTotal;
	}

	/**
	 * @param payTotal the payTotal to set
	 */
	public void setPayTotal(Double payTotal) {
		this.payTotal = payTotal;
	}

	/**
	 * @return the rongyiDiscount
	 */
	public Double getRongyiDiscount() {
		return rongyiDiscount;
	}

	/**
	 * @param rongyiDiscount the rongyiDiscount to set
	 */
	public void setRongyiDiscount(Double rongyiDiscount) {
		this.rongyiDiscount = rongyiDiscount;
	}

	/**
	 * @return the payTotalCoupon
	 */
	public Double getPayTotalCoupon() {
		return payTotalCoupon;
	}

	/**
	 * @param payTotalCoupon the payTotalCoupon to set
	 */
	public void setPayTotalCoupon(Double payTotalCoupon) {
		this.payTotalCoupon = payTotalCoupon;
	}

	/**
	 * @return the rongyiDiscountCoupon
	 */
	public Double getRongyiDiscountCoupon() {
		return rongyiDiscountCoupon;
	}

	/**
	 * @param rongyiDiscountCoupon the rongyiDiscountCoupon to set
	 */
	public void setRongyiDiscountCoupon(Double rongyiDiscountCoupon) {
		this.rongyiDiscountCoupon = rongyiDiscountCoupon;
	}

	private Double payTotalOrder;
    private Double rongyiDiscountOrder;

    /**
	 * @return the payTotalOrder
	 */
	public Double getPayTotalOrder() {
		return payTotalOrder;
	}

	/**
	 * @param payTotalOrder the payTotalOrder to set
	 */
	public void setPayTotalOrder(Double payTotalOrder) {
		this.payTotalOrder = payTotalOrder;
	}

	/**
	 * @return the rongyiDiscountOrder
	 */
	public Double getRongyiDiscountOrder() {
		return rongyiDiscountOrder;
	}

	/**
	 * @param rongyiDiscountOrder the rongyiDiscountOrder to set
	 */
	public void setRongyiDiscountOrder(Double rongyiDiscountOrder) {
		this.rongyiDiscountOrder = rongyiDiscountOrder;
	}

	/** 优惠券表头 */
    private List<CouponExcelDto> couponExcelDtoList;
    
    /** 优惠券明细 */
    private List<CouponCodeExcelDto> couponCodeExcelDtoList;
    
    /** 商品订单表头 */
    private List<OrderSettlementTopDto> orderSettlementTopDtoList;
    
    /** 商品订单明细 */
    private List<OrderSettlementDetailVO> orderSettlementDetailVOList;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getRongyiAccountName() {
        return rongyiAccountName;
    }

    public void setRongyiAccountName(String rongyiAccountName) {
        this.rongyiAccountName = rongyiAccountName;
    }

    public String getRongyiAccountNo() {
        return rongyiAccountNo;
    }

    public void setRongyiAccountNo(String rongyiAccountNo) {
        this.rongyiAccountNo = rongyiAccountNo;
    }

    public String getRongyiBank() {
        return rongyiBank;
    }

    public void setRongyiBank(String rongyiBank) {
        this.rongyiBank = rongyiBank;
    }

    public String getRongyiBankAddress() {
        return rongyiBankAddress;
    }

    public void setRongyiBankAddress(String rongyiBankAddress) {
        this.rongyiBankAddress = rongyiBankAddress;
    }

    public String getShopAccountName() {
        return shopAccountName;
    }

    public void setShopAccountName(String shopAccountName) {
        this.shopAccountName = shopAccountName;
    }

    public String getShopAccountNo() {
        return shopAccountNo;
    }

    public void setShopAccountNo(String shopAccountNo) {
        this.shopAccountNo = shopAccountNo;
    }

    public String getShopBank() {
        return shopBank;
    }

    public void setShopBank(String shopBank) {
        this.shopBank = shopBank;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public List<CouponExcelDto> getCouponExcelDtoList() {
        return couponExcelDtoList;
    }

    public void setCouponExcelDtoList(List<CouponExcelDto> couponExcelDtoList) {
        this.couponExcelDtoList = couponExcelDtoList;
    }

    public List<CouponCodeExcelDto> getCouponCodeExcelDtoList() {
        return couponCodeExcelDtoList;
    }

    public void setCouponCodeExcelDtoList(List<CouponCodeExcelDto> couponCodeExcelDtoList) {
        this.couponCodeExcelDtoList = couponCodeExcelDtoList;
    }

	/**
	 * @return the orderSettlementTopDtoList
	 */
	public List<OrderSettlementTopDto> getOrderSettlementTopDtoList() {
		return orderSettlementTopDtoList;
	}

	/**
	 * @param orderSettlementTopDtoList the orderSettlementTopDtoList to set
	 */
	public void setOrderSettlementTopDtoList(List<OrderSettlementTopDto> orderSettlementTopDtoList) {
		this.orderSettlementTopDtoList = orderSettlementTopDtoList;
	}

	/**
	 * @return the orderSettlementDetailVOList
	 */
	public List<OrderSettlementDetailVO> getOrderSettlementDetailVOList() {
		return orderSettlementDetailVOList;
	}

	/**
	 * @param orderSettlementDetailVOList the orderSettlementDetailVOList to set
	 */
	public void setOrderSettlementDetailVOList(List<OrderSettlementDetailVO> orderSettlementDetailVOList) {
		this.orderSettlementDetailVOList = orderSettlementDetailVOList;
	}
    
    
}
