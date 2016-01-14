package com.rongyi.easy.redi.vo;

import java.util.List;

public class ProductVo  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<GoodsListVo> goodsList;
	private List<CategorysVo> categorysList ;
	private List<ColoursVo> coloursList ;
	private List<StanVo> stanList ;
	private List<SubStanVo> subStanList ;
	private List<PropertiesVo> propertiesList ;
	private List<BrandVo> brandList ;
	
	private List<MdmCategoryVo> mdmCategoryList ;

	public List<GoodsListVo> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsListVo> goodsList) {
		this.goodsList = goodsList;
	}

	public List<CategorysVo> getCategorysList() {
		return categorysList;
	}

	public void setCategorysList(List<CategorysVo> categorysList) {
		this.categorysList = categorysList;
	}

	public List<ColoursVo> getColoursList() {
		return coloursList;
	}

	public void setColoursList(List<ColoursVo> coloursList) {
		this.coloursList = coloursList;
	}

	public List<StanVo> getStanList() {
		return stanList;
	}

	public void setStanList(List<StanVo> stanList) {
		this.stanList = stanList;
	}

	public List<SubStanVo> getSubStanList() {
		return subStanList;
	}

	public void setSubStanList(List<SubStanVo> subStanList) {
		this.subStanList = subStanList;
	}

	public List<PropertiesVo> getPropertiesList() {
		return propertiesList;
	}

	public void setPropertiesList(List<PropertiesVo> propertiesList) {
		this.propertiesList = propertiesList;
	}

	public List<BrandVo> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<BrandVo> brandList) {
		this.brandList = brandList;
	}

	public List<MdmCategoryVo> getMdmCategoryList() {
		return mdmCategoryList;
	}

	public void setMdmCategoryList(List<MdmCategoryVo> mdmCategoryList) {
		this.mdmCategoryList = mdmCategoryList;
	}
	
	

}
