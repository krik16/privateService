package com.rongyi.rss.rcc;

import com.rongyi.core.bean.ResponseResult;

/**
 * 礼品验码接口
 * 
 * @author Lc 2015年1月9日 下午2:49:20
 */
public interface RCCValiConditionForCommodityService {
	// 验码方法
	public ResponseResult validateCommodity(String code, String terminalId, Long useMode);
}
