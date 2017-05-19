/**
 *
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.easy.tradecenter.param.QueryForActivityParam;
import com.rongyi.easy.tradecenter.param.StatisticalForActivityParam;
import com.rongyi.easy.tradecenter.vo.PintuanOrderCountVO;
import com.rongyi.easy.tradecenter.vo.QueryForActivityVO;
import com.rongyi.easy.tradecenter.vo.StatisticalForActivityVO;

import java.util.Date;
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
	 * @param  countType 统计维度（-1根据时间筛选 0全部 1当天 2昨天 ）
	 * @param  begingAt 下单开始时间 格式 "2015-11-14 01:37:40"
	 * @param  endAt    下单结束时间 格式 "2015-11-14 01:37:40"
	 * @throws Exception
	 */
	List<PintuanOrderCountVO> pintuanOrderCount(Integer activityId,List<String> commodityId, Integer countType,Date begingAt,Date endAt) throws Exception;


	/**
	 * 单项活动统计
	 *
	 * @param param
	 * @return
	 */
	DubboVO<StatisticalForActivityVO> statisticalForActivity(StatisticalForActivityParam param);

	/**
	 * 单项活动查询数据
	 *
	 * @param param
	 * @return
	 */
	DubboVO<List<QueryForActivityVO>> listForActivity(QueryForActivityParam param);

	/**
	 * 单项活动查询总数
	 *
	 * @param param
	 * @return
	 */
	DubboVO<Integer> listCountForActivity(QueryForActivityParam param);
}
