package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.CommodityCategory;


public class CommodityCategoryVO implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7221743669151489796L;
	private String categoryId;
	private String categoryName;
	private String categoryLogo;
	private String categoryType;
	private List<SndClassCategory> subCategoryList;
	public CommodityCategoryVO(){
		
	}
	
	public CommodityCategoryVO(CommodityCategory commodityCategory){
		this.categoryId = commodityCategory.getId().toString();
		this.categoryName = commodityCategory.getName();
		this.categoryLogo = commodityCategory.getLogoUrl();
		this.categoryType = "我是一级类目";
	}
	
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

	public String getCategoryLogo() {
		return categoryLogo;
	}

	public void setCategoryLogo(String categoryLogo) {
		this.categoryLogo = categoryLogo;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public List<SndClassCategory> getSubCategoryList() {
		return subCategoryList;
	}

	public void setSubCategoryList(List<SndClassCategory> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}

	public class SndClassCategory{
		private String categoryId;
		private String categoryName;
		private String categoryLogo;
		private String categoryType;
		private List<TrdClassCategory> subCategoryList;
		public SndClassCategory(){
			
		}
		
		public SndClassCategory(CommodityCategory commodityCategory){
			this.categoryId = commodityCategory.getId().toString();
			this.categoryName = commodityCategory.getName();
			this.categoryLogo = commodityCategory.getLogoUrl();
			this.categoryType = "我是二级类目";
		}
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
		public String getCategoryLogo() {
			return categoryLogo;
		}
		public void setCategoryLogo(String categoryLogo) {
			this.categoryLogo = categoryLogo;
		}
		public String getCategoryType() {
			return categoryType;
		}
		public void setCategoryType(String categoryType) {
			this.categoryType = categoryType;
		}
		public List<TrdClassCategory> getSubCategoryList() {
			return subCategoryList;
		}
		public void setSubCategoryList(List<TrdClassCategory> subCategoryList) {
			this.subCategoryList = subCategoryList;
		}
		public class TrdClassCategory{
			private String categoryId;
			private String categoryName;
			private String categoryLogo;
			private String categoryType;
			private List<FthClassCategory> subCategoryList;
			public TrdClassCategory(){
				
			}
			
			public TrdClassCategory(CommodityCategory commodityCategory){
				this.categoryId = commodityCategory.getId().toString();
				this.categoryName = commodityCategory.getName();
				this.categoryLogo = commodityCategory.getLogoUrl();
				this.categoryType = "我是三级类目";
			}
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
			public String getCategoryLogo() {
				return categoryLogo;
			}
			public void setCategoryLogo(String categoryLogo) {
				this.categoryLogo = categoryLogo;
			}
			public String getCategoryType() {
				return categoryType;
			}
			public void setCategoryType(String categoryType) {
				this.categoryType = categoryType;
			}
			public List<FthClassCategory> getSubCategoryList() {
				return subCategoryList;
			}
			public void setSubCategoryList(List<FthClassCategory> subCategoryList) {
				this.subCategoryList = subCategoryList;
			}
			public class FthClassCategory{
				private String categoryId;
				private String categoryName;
				private String categoryLogo;
				private String categoryType;
				private List<CommoditySpecColumnVO> categoryColumList;
				public FthClassCategory(){
					
				}
				
				public FthClassCategory(CommodityCategory commodityCategory){
					this.categoryId = commodityCategory.getId().toString();
					this.categoryName = commodityCategory.getName();
					this.categoryLogo = commodityCategory.getLogoUrl();
					this.categoryType = "我是四级类目";
				}
				public List<CommoditySpecColumnVO> getCategoryColumList() {
					return categoryColumList;
				}
				public void setCategoryColumList(List<CommoditySpecColumnVO> categoryColumList) {
					this.categoryColumList = categoryColumList;
				}
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
				public String getCategoryLogo() {
					return categoryLogo;
				}
				public void setCategoryLogo(String categoryLogo) {
					this.categoryLogo = categoryLogo;
				}
				public String getCategoryType() {
					return categoryType;
				}
				public void setCategoryType(String categoryType) {
					this.categoryType = categoryType;
				}
			}
		}
	}
	 
	
}
