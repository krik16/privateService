package com.rongyi.easy.redi.vo;


/**
 * 分类商品
 * @author 
 */
public class BailianCategoryGoodsVo implements java.io.Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String goodsId; //商品SID
    
    private String comSid; //业态SID
    
    private String marketPrice; //商品销售价
    
    private String goodsPrice;//商品基准价
    
    private String goodsMsg;//商品销售名称
    
    private String goodsImgPath;//商品图片链接
    
    private String supplierSid;//供应商ID
    
    private String mdmGoodsId;//mdm商品编码



	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getComSid() {
		return comSid;
	}

	public void setComSid(String comSid) {
		this.comSid = comSid;
	}

	public String getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsMsg() {
		return goodsMsg;
	}

	public void setGoodsMsg(String goodsMsg) {
		this.goodsMsg = goodsMsg;
	}

	public String getGoodsImgPath() {
		return goodsImgPath;
	}

	public void setGoodsImgPath(String goodsImgPath) {
		this.goodsImgPath = goodsImgPath;
	}

	public String getSupplierSid() {
		return supplierSid;
	}

	public void setSupplierSid(String supplierSid) {
		this.supplierSid = supplierSid;
	}

	public String getMdmGoodsId() {
		return mdmGoodsId;
	}

	public void setMdmGoodsId(String mdmGoodsId) {
		this.mdmGoodsId = mdmGoodsId;
	}

	@Override
	public String toString() {
		return "BailianCategoryGoodsParam [goodsId=" + goodsId + ", comSid="
				+ comSid + ", marketPrice=" + marketPrice + ", goodsPrice="
				+ goodsPrice + ", goodsMsg=" + goodsMsg + ", goodsImgPath="
				+ goodsImgPath + ", supplierSid=" + supplierSid
				+ ", mdmGoodsId=" + mdmGoodsId + "]";
	}
    
    
    

	
    
}
