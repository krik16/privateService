package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.mcmc.CommodityCategory;

public class CommodityCategorySaleVO implements Serializable, Comparable<CommodityCategorySaleVO> {
	private static final long serialVersionUID = -4158506094352482238L;
	private String categoryId;
	private String categoryName;
	private String categoryLogo;
	private String categoryType;
	private Date createAt;
	private List<SndClassCategory> subCategoryList;

	public List<SndClassCategory> getSubCategoryList() {
		return subCategoryList;
	}

	public void setSubCategoryList(List<SndClassCategory> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}

	public CommodityCategorySaleVO() {

	}

	public CommodityCategorySaleVO(CommodityCategory commodityCategory) {
		this.categoryId = commodityCategory.getId().toString();
		this.categoryName = commodityCategory.getName();
		this.categoryLogo = commodityCategory.getLogoUrl();
		this.categoryType = "我是一级类目";
		this.createAt = commodityCategory.getCreateAt();
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
	
	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}



	public class SndClassCategory implements Serializable, Comparable<SndClassCategory>{
		private static final long serialVersionUID = -8762888917527899984L;
		private String categoryId;
		private String categoryName;
		private String categoryLogo;
		private String categoryType;
		private Date createAt;
		private List<TrdClassCategory> subCategoryList;

		public SndClassCategory() {

		}

		public SndClassCategory(CommodityCategory commodityCategory) {
			this.categoryId = commodityCategory.getId().toString();
			this.categoryName = commodityCategory.getName();
			this.categoryLogo = commodityCategory.getLogoUrl();
			this.categoryType = "我是二级类目";
			this.createAt = commodityCategory.getCreateAt();
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
		
		public Date getCreateAt() {
			return createAt;
		}

		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}

		public class TrdClassCategory implements Serializable {
			private static final long serialVersionUID = 3027565667824642164L;
			private String categoryId;
			private String categoryName;
			private String categoryLogo;
			private String categoryType;
			private List<CommoditySpecColumnVO> categoryColumList;

			public TrdClassCategory() {

			}

			public TrdClassCategory(CommodityCategory commodityCategory) {
				this.categoryId = commodityCategory.getId().toString();
				this.categoryName = commodityCategory.getName();
				this.categoryLogo = commodityCategory.getLogoUrl();
				this.categoryType = "我是三级类目";
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
		
		public String toJson() {
			return JsonUtil.getJSONString(this);
		}

		/**
		 * 排序
		 */
		@Override
		public int compareTo(SndClassCategory o) {
			long t1 = this.getCreateAt().getTime();
			long t2 = o.getCreateAt().getTime();
			if (t1 < t2) {
				return -1;
			}
			if (t1 > t2) {
				return 1;
			}
			return 0;
		}
	}
	
	public String toJson() {
		return JsonUtil.getJSONString(this);
	}

	@Override
	public int compareTo(CommodityCategorySaleVO o) {
		long t1 = this.getCreateAt().getTime();
		long t2 = o.getCreateAt().getTime();
		if (t1 < t2) {
			return -1;
		}
		if (t1 > t2) {
			return 1;
		}
		return 0;
	}
}
