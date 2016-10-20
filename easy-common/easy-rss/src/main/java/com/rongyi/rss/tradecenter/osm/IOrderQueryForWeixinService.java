/**
 *
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.tradecenter.vo.PintuanOrderCountVO;

import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author yujisun
 * Description ：
 * time ：2016年10月20日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 */
public interface IOrderQueryForWeixinService {

	/**
	 * 拼团统计
	 * @param  activityId 活动id（必填）
	 * @param  commodityId 商品id（空为全部）
	 * @param  countType 统计维度（0全部 1当天 2昨天）
	 * @throws Exception
	 */
	List<PintuanOrderCountVO> pintuanOrderCount(Integer activityId,List<String> commodityId, Integer countType) throws Exception;
}
