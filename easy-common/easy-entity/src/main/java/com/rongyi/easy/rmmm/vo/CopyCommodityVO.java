package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.mcmc.entity.ThirdPartMcmcCommodity;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 抄同款返回的商品数据
 * @author zzp
 *
 */
public class CopyCommodityVO implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String commodityId;//商品id
	private List<String> commodityPicList;//商品图片集合
	private String commodityName;//商品名称
	//private String commodityCode;//商品编号
	private String brandEName;//品牌英文名
	private String brandCName;//品牌中文名
	private String commodityOriginalPrice;//商品原价
	private String commodityCurrentPrice;//商品现价
	private String commodityNo;//商品款号
	private List<String> goodsParam;//商品参数
	private List<CopyCommoditySpecVO> commoditySpecList;//商品规格信息
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getBrandEName() {
		return brandEName;
	}
	public void setBrandEName(String brandEName) {
		this.brandEName = brandEName;
	}
	public String getBrandCName() {
		return brandCName;
	}
	public void setBrandCName(String brandCName) {
		this.brandCName = brandCName;
	}
	public String getCommodityOriginalPrice() {
		return commodityOriginalPrice;
	}
	public void setCommodityOriginalPrice(String commodityOriginalPrice) {
		this.commodityOriginalPrice = commodityOriginalPrice;
	}
	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}
	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public List<String> getGoodsParam() {
		return goodsParam;
	}
	public void setGoodsParam(List<String> goodsParam) {
		this.goodsParam = goodsParam;
	}
	public List<CopyCommoditySpecVO> getCommoditySpecList() {
		return commoditySpecList;
	}
	public void setCommoditySpecList(List<CopyCommoditySpecVO> commoditySpecList) {
		this.commoditySpecList = commoditySpecList;
	}
	@Override
	public String toString() {
		return "CopyCommodityVO [commodityId=" + commodityId
				+ ", commodityPicList=" + commodityPicList + ", commodityName="
				+ commodityName + ", brandEName=" + brandEName
				+ ", brandCName=" + brandCName + ", commodityOriginalPrice="
				+ commodityOriginalPrice + ", commodityCurrentPrice="
				+ commodityCurrentPrice + ", commodityNo=" + commodityNo
				+ ", goodsParam=" + goodsParam + ", commoditySpecList="
				+ commoditySpecList + "]";
	}

	public CopyCommodityVO toCopyCommodityVO (ThirdPartMcmcCommodity thirdPartMcmcCommodity){
		CopyCommodityVO copyCommodityVO = new CopyCommodityVO();
		if(null != thirdPartMcmcCommodity){
			copyCommodityVO.setCommodityId(String.valueOf(thirdPartMcmcCommodity.getId()));//商品id
			copyCommodityVO.setBrandCName(thirdPartMcmcCommodity.getBrandChsName());//中文品牌名
			copyCommodityVO.setBrandEName(thirdPartMcmcCommodity.getBrandEngName());//英文品牌名
			copyCommodityVO.setCommodityName(thirdPartMcmcCommodity.getTitle());//商品名称
			copyCommodityVO.setCommodityNo(thirdPartMcmcCommodity.getArtNo());//商品款号
			copyCommodityVO.setCommodityCurrentPrice(thirdPartMcmcCommodity.getSalePrice());//现价
			copyCommodityVO.setCommodityOriginalPrice(thirdPartMcmcCommodity.getOrgPrice());//原价
			List<CopyCommoditySpecVO> copyCommoditySpecVOs = new ArrayList<>();
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getSize())){
				CopyCommoditySpecVO copyCommoditySpecVO = new CopyCommoditySpecVO();
				copyCommoditySpecVO.setColumnName("尺寸");
				List<String> columnValues = new ArrayList<>();
				columnValues.add(thirdPartMcmcCommodity.getSize());
				copyCommoditySpecVO.setColumnValue(columnValues);
				copyCommoditySpecVOs.add(copyCommoditySpecVO);
			}
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getColor())){
				CopyCommoditySpecVO copyCommoditySpecVO = new CopyCommoditySpecVO();
				copyCommoditySpecVO.setColumnName("颜色");
				List<String> columnValues = new ArrayList<>();
				columnValues.add(thirdPartMcmcCommodity.getColor());
				copyCommoditySpecVO.setColumnValue(columnValues);
				copyCommoditySpecVOs.add(copyCommoditySpecVO);
			}
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getImage())){
				List<String> picList = new ArrayList<>();
				picList.add(thirdPartMcmcCommodity.getImage());
				copyCommodityVO.setCommodityPicList(picList);//图片
			}
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getInfo())){
				List<String> goodsParams = new ArrayList<>();
				goodsParams.add(thirdPartMcmcCommodity.getInfo());
				copyCommodityVO.setCommodityPicList(goodsParams);//商品参数
			}

		}

       return copyCommodityVO;
	}
}
