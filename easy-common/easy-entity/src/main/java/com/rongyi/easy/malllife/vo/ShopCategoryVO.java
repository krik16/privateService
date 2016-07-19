package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 入驻店铺返回VO
 * @author user
 *
 */
public class ShopCategoryVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categoryId;//分类id
	private String categoryName;//分类名称
	private Integer shopCount;//同分类的店铺数量
	private String categoryPic;//类型图片
	private List<String> categoryPicList;//分类图片集合
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getShopCount() {
		return shopCount;
	}
	public void setShopCount(Integer shopCount) {
		this.shopCount = shopCount;
	}
	public String getCategoryPic() {
		return categoryPic;
	}
	public void setCategoryPic(String categoryPic) {
		this.categoryPic = categoryPic;
	}
	public List<String> getCategoryPicList() {
		return categoryPicList;
	}
	public void setCategoryPicList(List<String> categoryPicList) {
		this.categoryPicList = categoryPicList;
	}
	@Override
	public String toString() {
		return "ShopCategoryVO [categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", shopCount=" + shopCount + ", categoryPic="
				+ categoryPic + ", categoryPicList=" + categoryPicList + "]";
	}
	
	
}
