package com.rongyi.easy.solr.result;

import com.rongyi.easy.solr.retrival.result.ActivityData;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ActivityDetailSearchResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2115413240169259264L;
	
	
	private SearchMeta meta;
	private ActivitySearchInfo result;
	private List<ActivitySearchInfo> other_activities;
	private List<ShopSearchInfo> apply_shops;
	public SearchMeta getMeta() {
		return meta;
	}

	private String easyOrder;
	public void setMeta(SearchMeta meta) {
		this.meta = meta;
	}
	public ActivitySearchInfo getResult() {
		return result;
	}
	public void setResult(ActivitySearchInfo result) {
		this.result = result;
	}
	public List<ActivitySearchInfo> getOther_activities() {
		return other_activities;
	}
	public void setOther_activities(List<ActivitySearchInfo> other_activities) {
		this.other_activities = other_activities;
	}
	public List<ShopSearchInfo> getApply_shops() {
		return apply_shops;
	}
	public void setApply_shops(List<ShopSearchInfo> apply_shops) {
		this.apply_shops = apply_shops;
	}

	public void copyResult(ActivityData data) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		this.result = new ActivitySearchInfo();
		PropertyUtils.copyProperties(this.result, data);
	}

	public String getEasyOrder() {
		return easyOrder;
	}

	public void setEasyOrder(String easyOrder) {
		this.easyOrder = easyOrder;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("meta", meta)
				.append("result", result)
				.append("other_activities", other_activities)
				.append("apply_shops", apply_shops)
				.toString();
	}
}
