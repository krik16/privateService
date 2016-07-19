package com.rongyi.easy.solr.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * 获取分类参数  - 抵扣券页面
 *
 * @author wangjh7
 * @date 2016-06-30
 */
public class ActivityCategorySearchParam  extends MalllifeBaseParam implements Serializable {

    private static final long serialVersionUID = 578059263593575051L;

    // 城市MId
    private String cityId;
    // 店铺id list
    private List<String> shopList;
    // 分类id list
    private List<String> categoryList;
    private String couponId;//红包券id

    public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public List<String> getShopList() {
        return shopList;
    }

    public void setShopList(List<String> shopList) {
        this.shopList = shopList;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }

	@Override
	public String toString() {
		return "ActivityCategorySearchParam [cityId=" + cityId + ", shopList="
				+ shopList + ", categoryList=" + categoryList + ", couponId="
				+ couponId + "]";
	}
}
