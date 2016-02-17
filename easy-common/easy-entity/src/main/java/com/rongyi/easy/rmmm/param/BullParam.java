/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年10月15日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月15日               1.0              创建文件
 */
public class BullParam extends MalllifeBaseParam implements Serializable{
	
	private String bullId;//买手id
	private String liveId;//直播id
	private String flashSaleId; //commodityType为4则flashSaleId为闪购ID、commodityType为5则flashSaleId为特卖ID
	private String commodityType;//商品类型", 1所有商品 2导购商品 3买手商品 4闪购 5卖场
	private String keyword;
	private String categoryId;

	private String shopId;
	private String mallId;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(String flashSaleId) {
		this.flashSaleId = flashSaleId;
	}
	public String getBullId() {
		return bullId;
	}

	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public String getCommodityType() {
		return commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("bullId", bullId)
				.append("liveId", liveId)
				.append("flashSaleId", flashSaleId)
				.append("commodityType", commodityType)
				.append("keyword", keyword)
				.append("categoryId", categoryId)
				.append("shopId", shopId)
				.append("mallId", mallId)
				.toString();
	}
}
