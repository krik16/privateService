package com.rongyi.easy.redi.vo;

import java.util.List;

public class BailianCartVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	 /** 篮筐id */
    private String basketId;
    
    /** 主题 */
    private String basketName;
    
    /** 主题描述 */
    private String basketDesc;

    /** app篮筐列表图*/
    private String appListPic;
    
    /** app篮筐详情图 */
    private String appDetailPic;
    
    /** 活动开始时间 */
    private String startTime;
    
    /** 活动结束时间 */
    private String endTime;
    
    /** 篮筐门槛金额 */
    private String minPrice;
    
    /** 篮筐最小购买商品种类数*/
    private Integer minGoodsTypeNum;
    
    /**篮筐减金额 */
    private String deductionPrice;
    
    /** 商品id */
    private List<String> productId;

    
    
	public BailianCartVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BailianCartVo(String basketId, String basketName, String basketDesc,
			String startTime, String endTime, String minPrice,
			Integer minGoodsTypeNum, String deductionPrice,
			List<String> productId) {
		super();
		this.basketId = basketId;
		this.basketName = basketName;
		this.basketDesc = basketDesc;
		this.startTime = startTime;
		this.endTime = endTime;
		this.minPrice = minPrice;
		this.minGoodsTypeNum = minGoodsTypeNum;
		this.deductionPrice = deductionPrice;
		this.productId = productId;
	}

	public String getBasketId() {
		return basketId;
	}

	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	public String getBasketName() {
		return basketName;
	}

	public void setBasketName(String basketName) {
		this.basketName = basketName;
	}

	public String getBasketDesc() {
		return basketDesc;
	}

	public void setBasketDesc(String basketDesc) {
		this.basketDesc = basketDesc;
	}

	public String getAppListPic() {
		return appListPic;
	}

	public void setAppListPic(String appListPic) {
		this.appListPic = appListPic;
	}

	public String getAppDetailPic() {
		return appDetailPic;
	}

	public void setAppDetailPic(String appDetailPic) {
		this.appDetailPic = appDetailPic;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public Integer getMinGoodsTypeNum() {
		return minGoodsTypeNum;
	}

	public void setMinGoodsTypeNum(Integer minGoodsTypeNum) {
		this.minGoodsTypeNum = minGoodsTypeNum;
	}

	public String getDeductionPrice() {
		return deductionPrice;
	}

	public void setDeductionPrice(String deductionPrice) {
		this.deductionPrice = deductionPrice;
	}

	public List<String> getProductId() {
		return productId;
	}

	public void setProductId(List<String> productId) {
		this.productId = productId;
	}
	
}