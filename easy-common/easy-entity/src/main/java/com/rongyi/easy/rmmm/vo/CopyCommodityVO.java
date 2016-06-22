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

	public CopyCommodityVO(ThirdPartMcmcCommodity thirdPartMcmcCommodity){
		if(thirdPartMcmcCommodity != null){
			this.commodityId = String.valueOf(thirdPartMcmcCommodity.getId());//商品id
			this.brandCName = thirdPartMcmcCommodity.getBrandChsName();//中文品牌名
			this.brandEName = thirdPartMcmcCommodity.getBrandEngName();//英文品牌名
			this.commodityName = thirdPartMcmcCommodity.getTitle();//商品名称
			this.commodityNo = thirdPartMcmcCommodity.getArtNo();//商品款号
			this.commodityCurrentPrice = thirdPartMcmcCommodity.getSalePrice();//现价
			this.commodityOriginalPrice = thirdPartMcmcCommodity.getOrgPrice();//原价
			List<CopyCommoditySpecVO> copyCommoditySpecVOs = new ArrayList<>();
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getSize())){
				CopyCommoditySpecVO copyCommoditySpecVO = new CopyCommoditySpecVO();
				copyCommoditySpecVO.setColumnName("尺码");//规格名
				List<String> columnValues = new ArrayList<>();
				String[] sizes = thirdPartMcmcCommodity.getSize().split(",");
				for(int i=0;i<sizes.length;i++){
					columnValues.add(sizes[i]);//尺寸处理
				}
				copyCommoditySpecVO.setColumnValue(columnValues);//规格名称对应的值
				copyCommoditySpecVOs.add(copyCommoditySpecVO);
			}
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getColor())){
				CopyCommoditySpecVO copyCommoditySpecVO = new CopyCommoditySpecVO();
				copyCommoditySpecVO.setColumnName("颜色");//规格名
				List<String> columnValues = new ArrayList<>();
				String[] colors = thirdPartMcmcCommodity.getColor().split(",");
				for(int i=0;i<colors.length;i++){
					columnValues.add(colors[i]);//颜色处理
				}
				copyCommoditySpecVO.setColumnValue(columnValues);//规格名称对应的值
				copyCommoditySpecVOs.add(copyCommoditySpecVO);
			}
			this.commoditySpecList = copyCommoditySpecVOs;//规格集合
			List<String> picList = new ArrayList<>();
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getImage())){
				String[] pics = thirdPartMcmcCommodity.getImage().split(",");
				for(int i=0;i<pics.length;i++){
					picList.add(pics[i]);//图片处理
				}
			}
			this.commodityPicList = picList;//商品图片
			List<String> goodsParams = new ArrayList<>();
			if(StringUtils.isNotBlank(thirdPartMcmcCommodity.getInfo())){
				String[] goodParams = thirdPartMcmcCommodity.getInfo().split(";");
				for(int i=0;i<goodParams.length;i++){
					goodsParams.add(goodParams[i]);//抄过来的商品参数处理
				}
			}
			for(int j=0;j<goodsParams.size();j++){
				if(StringUtils.isBlank(goodsParams.get(j))){
					goodsParams.remove(j);//删除空元素
				}
			}
			this.goodsParam = goodsParams;//商品参数
		}
	}
	
}
