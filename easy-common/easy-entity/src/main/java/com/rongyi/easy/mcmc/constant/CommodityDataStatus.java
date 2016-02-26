package com.rongyi.easy.mcmc.constant;

import com.rongyi.core.constant.DataStatus;

/**
 * 商品状态 继承基础数据状态
 * Created by liulei on 2016/2/26.
 */
public interface CommodityDataStatus extends DataStatus {
	/** 商品数据状态：非现货初始化（直播使用） **/
	public static final int STATUS_COMMODITY_NOT_SPORT_CONTRACT = -1;
	/** 商品数据状态：下架 **/
	public static final int STATUS_COMMODITY_UNSHELVE			= 0;
	/** 商品数据状态：上架（当前时间在上架时间和下架时间之间） **/
	public static final int STATUS_COMMODITY_SHELVE 			= 1;
	/** 商品数据状态：删除 **/
	public static final int STATUS_COMMODITY_DELETED 			= 2;
	/** 商品数据状态：待上架 **/
	public static final int STATUS_COMMODITY_SHELVE_WAITING		= 3;
	/** 商品数据状态：待处理 **/
	public static final int STATUS_COMMODITY_PENDING			= 4;
	/** 商品数据状态：待审核 **/
	public static final int STATUS_COMMODITY_CHECK_PENDING		= 5;
	/** 商品数据状态：审核失败 **/
	public static final int STATUS_COMMODITY_CHECK_FAIL			= 6;
	
}
