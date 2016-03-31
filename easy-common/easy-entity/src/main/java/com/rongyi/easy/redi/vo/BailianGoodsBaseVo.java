package com.rongyi.easy.redi.vo;

import java.util.Date;
import java.util.List;

public class BailianGoodsBaseVo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 接口返回结果编码，00100000表示成功，其他编码表示失败
	 */
	// public final static String RESPONSE_CODE = "00100000";
	private Integer count;
	private Integer currentPage;
	private Integer pageSize;
	private Integer pages;
	private Integer end;
	private Integer start;
	
	private Long goodsSid ; //商品SID
	private Double price ; //商品价格
	private Double salePrice ;
	private Integer priceType ;
	private Date priceStartDate ;
	private Date priceEndDate ;
	private Double promotionPrice ;
	private Integer sType;
	private String goodsSalesName ;
	private Integer goodsType ;
	private Integer sendType ;
	private Integer splitPackType ;
	private String comGoodsCode ;
	private String goodsStandaName ;
	private List<SellPointVo> sellPointList ;
	private List<ComVo> comList ;
	private List<SupplierVo> supplierList ;
	
	private String sellInfo;
	private String goodsDesc ;
	private String packageList;
	
	private Integer stor ;
	private Integer strainStor ;
	private Integer normalStor ;
	private List<ShopsVo> shopsList ;
	
	private String proSellBit ;
	
	private Integer colourSid;
	private Integer stanSid ;
	
	private String stanName;
	private String subStanName ;
	
	private Integer subStanSid ;
	
	private List<ProductVo> productList ;
	
	private List<PicturesVo> picturesList;
	

	public BailianGoodsBaseVo() {
		super();
	}

	public BailianGoodsBaseVo(Integer count, Integer currentPage, Integer pageSize, Integer pages, Integer end, List<BailianMemberCouponVo> list) {
		super();
		this.count = count;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.pages = pages;
		this.end = end;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}


	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Long getGoodsSid() {
		return goodsSid;
	}

	public void setGoodsSid(Long goodsSid) {
		this.goodsSid = goodsSid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getPriceType() {
		return priceType;
	}

	public void setPriceType(Integer priceType) {
		this.priceType = priceType;
	}

	public Date getPriceStartDate() {
		return priceStartDate;
	}

	public void setPriceStartDate(Date priceStartDate) {
		this.priceStartDate = priceStartDate;
	}

	public Date getPriceEndDate() {
		return priceEndDate;
	}

	public void setPriceEndDate(Date priceEndDate) {
		this.priceEndDate = priceEndDate;
	}

	public Double getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(Double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Integer getsType() {
		return sType;
	}

	public void setsType(Integer sType) {
		this.sType = sType;
	}

	public String getGoodsSalesName() {
		return goodsSalesName;
	}

	public void setGoodsSalesName(String goodsSalesName) {
		this.goodsSalesName = goodsSalesName;
	}

	public Integer getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(Integer goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getSendType() {
		return sendType;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}

	public Integer getSplitPackType() {
		return splitPackType;
	}

	public void setSplitPackType(Integer splitPackType) {
		this.splitPackType = splitPackType;
	}

	public String getComGoodsCode() {
		return comGoodsCode;
	}

	public void setComGoodsCode(String comGoodsCode) {
		this.comGoodsCode = comGoodsCode;
	}

	public String getGoodsStandaName() {
		return goodsStandaName;
	}

	public void setGoodsStandaName(String goodsStandaName) {
		this.goodsStandaName = goodsStandaName;
	}

	public List<SellPointVo> getSellPointList() {
		return sellPointList;
	}

	public void setSellPointList(List<SellPointVo> sellPointList) {
		this.sellPointList = sellPointList;
	}

	public List<ComVo> getComList() {
		return comList;
	}

	public void setComList(List<ComVo> comList) {
		this.comList = comList;
	}

	public List<SupplierVo> getSupplierList() {
		return supplierList;
	}

	public void setSupplierList(List<SupplierVo> supplierList) {
		this.supplierList = supplierList;
	}

	public String getSellInfo() {
		return sellInfo;
	}

	public void setSellInfo(String sellInfo) {
		this.sellInfo = sellInfo;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getPackageList() {
		return packageList;
	}

	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}

	public Integer getStor() {
		return stor;
	}

	public void setStor(Integer stor) {
		this.stor = stor;
	}

	public Integer getStrainStor() {
		return strainStor;
	}

	public void setStrainStor(Integer strainStor) {
		this.strainStor = strainStor;
	}

	public Integer getNormalStor() {
		return normalStor;
	}

	public void setNormalStor(Integer normalStor) {
		this.normalStor = normalStor;
	}

	public List<ShopsVo> getShopsList() {
		return shopsList;
	}

	public void setShopsList(List<ShopsVo> shopsList) {
		this.shopsList = shopsList;
	}

	public String getProSellBit() {
		return proSellBit;
	}

	public void setProSellBit(String proSellBit) {
		this.proSellBit = proSellBit;
	}

	public Integer getColourSid() {
		return colourSid;
	}

	public void setColourSid(Integer colourSid) {
		this.colourSid = colourSid;
	}

	public Integer getStanSid() {
		return stanSid;
	}

	public void setStanSid(Integer stanSid) {
		this.stanSid = stanSid;
	}

	public String getStanName() {
		return stanName;
	}

	public void setStanName(String stanName) {
		this.stanName = stanName;
	}

	public String getSubStanName() {
		return subStanName;
	}

	public void setSubStanName(String subStanName) {
		this.subStanName = subStanName;
	}

	public Integer getSubStanSid() {
		return subStanSid;
	}

	public void setSubStanSid(Integer subStanSid) {
		this.subStanSid = subStanSid;
	}

	public List<ProductVo> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductVo> productList) {
		this.productList = productList;
	}

	public List<PicturesVo> getPicturesList() {
		return picturesList;
	}

	public void setPicturesList(List<PicturesVo> picturesList) {
		this.picturesList = picturesList;
	}

}
