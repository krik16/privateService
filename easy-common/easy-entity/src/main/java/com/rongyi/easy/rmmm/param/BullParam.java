/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

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
	private String commodityType;//商品类型", 1所有商品2导购商品3买手商品

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
	
	

}
